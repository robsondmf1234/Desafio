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

class FragmentOne(private val categoria:String) : Fragment() {
    
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        //Recupera da classe Mock uma lista com filmes
        val listaComFilmes = Mock().getListaFiltradaFilmes(categoria)

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
        val vaiPraProximaTela = Intent(context, TelaSecundaria::class.java)
        vaiPraProximaTela.putExtra("filme",filme)
        startActivity(vaiPraProximaTela)

       // Toast.makeText(context, "Filme Cliclado...", Toast.LENGTH_SHORT).show()
    }

}