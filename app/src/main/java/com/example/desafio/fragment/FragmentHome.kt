package com.example.desafio.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.desafio.R
import com.example.desafio.TelaSecundaria
import com.example.desafio.adapter.MyPageAdapter
import com.example.desafio.repositorio.Filme
import com.example.desafio.repositorio.Mock
import kotlinx.android.synthetic.main.fragment_home.*

class FragmentHome(categoria: String) : Fragment() {
    //Recupera da classe Mock uma lista com filmes
    //  val listaComFilmes = Mock().getListaFiltradaFilmes(categoria)

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val fragmentAdapter = MyPageAdapter(fragmentManager!!)
        viewPager.adapter = fragmentAdapter
        tabLayout.setupWithViewPager(viewPager)

    }

    override fun onCreateView(inflater: LayoutInflater,container: ViewGroup?,savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

}