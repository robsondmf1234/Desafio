package com.example.desafio

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.desafio.adapter.FilmeAdapter2
import com.example.desafio.repositorio.Filme
import com.example.desafio.repositorio.Mock
import kotlinx.android.synthetic.main.activity_tela_secundaria.*

class TelaSecundaria : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_secundaria)

        // image_capa_secundaria.requestFocus()

        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }

        //val listaFilmes = gerarFilmes(100)
        val listaComFilmes = Mock().getListaFilmes()


        val filme = intent.extras?.getParcelable<Filme>("filme")!!

        text_name_filme.text = filme.titulo
        text_categoria.text = filme.categoria
        text_pais.text = filme.paisFilme
        text_nota.text = filme.nota + "/10"
        // text_duracao.text = filme.duracao
        text_descricao.text = filme.descricao
        image_capa_filme.setImageResource(filme.imagemCapa)
        image_capa_secundaria.setImageResource(filme.imagemCapa)

        recyclerView_tela_secundaria.adapter = FilmeAdapter2(listaComFilmes)
        recyclerView_tela_secundaria.layoutManager = LinearLayoutManager(this)
        recyclerView_tela_secundaria.setHasFixedSize(true)

    }
}