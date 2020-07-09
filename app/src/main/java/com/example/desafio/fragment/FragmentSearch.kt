package com.example.desafio.fragment

import android.os.Bundle
import android.view.*
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.desafio.R
import com.example.desafio.adapter.FilmeAdapter3
import com.example.desafio.repositorio.Filme
import com.example.desafio.repositorio.Mock
import kotlinx.android.synthetic.main.fragment_search.*
import java.util.*
import kotlin.collections.ArrayList

class FragmentSearch : Fragment() {


    val displayList = ArrayList<Filme>()
    var arrayList = Mock().getListaFilmes()

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        displayList.addAll(arrayList)

        val myAdapter = FilmeAdapter3(displayList,context!!)

        recycler_fragment_search.layoutManager = LinearLayoutManager(context)
        recycler_fragment_search.adapter = myAdapter
    }

    override fun onCreateView(inflater: LayoutInflater,container: ViewGroup?,savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_search, container, false)

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        setHasOptionsMenu(true)
        super.onCreate(savedInstanceState)
    }
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_search,menu)
        val menuItem = menu.findItem(R.id.search)

        if (menuItem!= null){
            val searchView = menuItem.actionView as SearchView

            searchView.setOnQueryTextListener(object :SearchView.OnQueryTextListener{
                override fun onQueryTextSubmit(query: String?): Boolean {
                    TODO("Not yet implemented")
                }

                override fun onQueryTextChange(newText: String?): Boolean {
                    if (newText!!.isNotEmpty()){
                        displayList.clear()
                        val search = newText.toLowerCase(Locale.getDefault())
                        arrayList.forEach {
                            if (it.titulo.toLowerCase(Locale.getDefault()).contains(search)){
                                displayList.add(it)
                            }
                        }
                        recycler_fragment_search.adapter!!.notifyDataSetChanged()
                    }
                    else{
                        displayList.clear()
                        displayList.addAll(arrayList)
                        recycler_fragment_search.adapter!!.notifyDataSetChanged()
                    }
                    return true
                }

            })


        }

        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return super.onOptionsItemSelected(item)
    }


}