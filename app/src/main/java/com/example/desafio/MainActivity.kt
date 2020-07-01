package com.example.desafio

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.desafio.adapter.FilmeAdapter
import com.example.desafio.repositorio.Filme
import com.example.desafio.repositorio.Mock
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }

        //Recupera da classe Mock uma lista com filmes
        val listaComFilmes = Mock().getListaFilmes()

        //gerar Lista de Filmes
       // val listaFilmes = gerarFilmes(100)

        recyclerView.adapter = FilmeAdapter(
            listaComFilmes,
            this::abreSegundaTela
        )
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
    }

   /* private fun gerarFilmes(size: Int): List<FilmeItem> {

        val list = ArrayList<FilmeItem>()

        for (i in 1 until size) {
            val idAvatar = R.drawable.avatar

            val item = FilmeItem((i),
                                idAvatar,
                                "8.5", "Avatar",
                                "Aventura", "Estados Unidos",//"118 min",
                                "No exuberante " +
                                "mundo alienígena de Pandora vivem os Na'vi, seres que parecem ser" +
                                " primitivos, mas são altamente evoluídos. Como o ambiente do planeta" +
                                " é tóxico, foram criados os avatares, corpos biológicos controlados pela" +
                                " mente humana que se movimentam livremente em Pandora. Jake Sully, um ex-fuzileiro"
            )
            list += item
        }
        return list
    }*/

    private fun abreSegundaTela(filme: Filme){
        val vaiPraProximaTela = Intent(this, TelaSecundaria::class.java)
        vaiPraProximaTela.putExtra("filme",filme)
        startActivity(vaiPraProximaTela)

    }
}