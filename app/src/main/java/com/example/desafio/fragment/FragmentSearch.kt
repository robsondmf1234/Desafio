package com.example.desafio.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.desafio.R
import com.example.desafio.TelaSecundaria
import com.example.desafio.adapter.FilmeAdapter2
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

        val myAdapter = FilmeAdapter2(displayList, context!!, this::abreSegundaTela)

        recycler_fragment_search.layoutManager = LinearLayoutManager(context)
        recycler_fragment_search.adapter = myAdapter
        
        buscaSearchView(search_title)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_search, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        setHasOptionsMenu(true)
        super.onCreate(savedInstanceState)
    }

    private fun abreSegundaTela(filme: Filme) {
          val vaiPraProximaTela = Intent(context, TelaSecundaria::class.java)
           vaiPraProximaTela.putExtra("filme",filme)
           startActivity(vaiPraProximaTela)
    }

    //Método para buscar os filmes pelo SearchView
    fun buscaSearchView(search_title: SearchView) {
        search_title.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                if (newText!!.isNotEmpty()) {
                    displayList.clear()
                    val search = newText.toLowerCase(Locale.getDefault())
                    arrayList.forEach {
                        if (it.titulo.toLowerCase(Locale.getDefault()).contains(search)) {
                            displayList.add(it)
                        }
                    }
                    recycler_fragment_search.adapter!!.notifyDataSetChanged()
                } else {
                    displayList.clear()
                    displayList.addAll(arrayList)
                    recycler_fragment_search.adapter!!.notifyDataSetChanged()
                }
                return true
            }

        })
    }
}
