package com.example.desafio

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.desafio.model.FilmeItem
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private fun mostrarNome(filme:FilmeItem){
        startActivity(Intent(this,TelaSecundaria::class.java))
        //putextra("filme",filme)
        //startAct
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }

        val listaFilmes = gerarFilmes(100)

        //Lista de Categorias
        // val listaCategoria = listOf("Aventura","Ação","Comédia","Romance")
        // recyclerView.adapter = CategoriaAdapter(listaCategoria, this)


        recyclerView.adapter = FilmeAdapter(listaFilmes,this::mostrarNome)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
    }

    private fun gerarFilmes(size: Int): List<FilmeItem> {

        val list = ArrayList<FilmeItem>()

        for (i in 1 until size) {
            val idAvatar = R.drawable.avatar

            val item = FilmeItem((i),
                                idAvatar,
                                "8.5", "Avatar",
                                "Aventura", "Estados Unidos",
                                "No exuberante " +
                                "mundo alienígena de Pandora vivem os Na'vi, seres que parecem ser" +
                                " primitivos, mas são altamente evoluídos. Como o ambiente do planeta" +
                                " é tóxico, foram criados os avatares, corpos biológicos controlados pela" +
                                " mente humana que se movimentam livremente em Pandora. Jake Sully, um ex-fuzileiro"
            )
            list += item
        }
        return list
    }
}