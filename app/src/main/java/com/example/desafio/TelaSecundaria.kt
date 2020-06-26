package com.example.desafio

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.desafio.model.FilmeItem
import kotlinx.android.synthetic.main.activity_tela_secundaria.*

class TelaSecundaria : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_secundaria)

        val filme = intent.extras?.getParcelable<FilmeItem>("filme")!!

        text_name_filme.text = filme.titulo
        text_categoria.text = filme.categoria
        text_pais.text = filme.paisFilme
        image_capa_filme.setImageResource(filme.imagemCapa)
        image_capa_secundaria.setImageResource(filme.imagemCapa)


    }
}