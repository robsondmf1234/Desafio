package com.example.desafio.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.desafio.R
import com.example.desafio.TelaSecundaria
import com.example.desafio.adapter.FilmeAdapter
import com.example.desafio.repositorio.Filme
import com.example.desafio.repositorio.Mock
import kotlinx.android.synthetic.main.fragment_one.*

class FragmentOne(val categoria:String) : Fragment() {

    //Recupera da classe Mock uma lista com filmes
    val listaComFilmes = Mock().getListaFiltradaFilmes(categoria)

    // Retornando todos filmes
    //val listaComFilmes = Mock().getListaFilmes()


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        listaFilmesRecycler.adapter = FilmeAdapter(listaComFilmes,this::abreSegundaTela)
        listaFilmesRecycler.layoutManager = LinearLayoutManager(context)
        listaFilmesRecycler.setHasFixedSize(true)

        super.onActivityCreated(savedInstanceState)
    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_one, container, false)
    }

    private fun abreSegundaTela(filme: Filme){
        Toast.makeText(context, "Filme Cliclado", Toast.LENGTH_SHORT).show()
    }

}