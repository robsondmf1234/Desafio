package com.example.desafio.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.desafio.R
import com.example.desafio.TelaSecundaria
import com.example.desafio.adapter.FilmeAdapter2
import com.example.desafio.repositorio.Filme
import com.example.desafio.repositorio.Mock
import kotlinx.android.synthetic.main.fragment_favorite.*
import kotlinx.android.synthetic.main.fragment_search.*

class FragmentFavorite : Fragment() {


    val arrayList = Mock().getListaFiltradaFavorites()

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val myAdapter = FilmeAdapter2(arrayList, context!!, this::abreSegundaTela)

        recycler_fragment_favorite.layoutManager = LinearLayoutManager(context)
        recycler_fragment_favorite.adapter = myAdapter

    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_favorite, container, false)
    }

    private fun abreSegundaTela(filme: Filme) {
        val vaiPraProximaTela = Intent(context, TelaSecundaria::class.java)
        vaiPraProximaTela.putExtra("filme",filme)
        startActivity(vaiPraProximaTela)
    }
}