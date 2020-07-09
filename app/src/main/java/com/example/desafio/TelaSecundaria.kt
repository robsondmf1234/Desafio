package com.example.desafio

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
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

        setupMainRecyclerView(listaComFilmes)
    }

    private fun setupMainRecyclerView(listaComFilmes: List<Filme>) {
        recyclerView_tela_secundaria.adapter = FilmeAdapter2(listaComFilmes,this,this::abreSegundaTela)
        recyclerView_tela_secundaria.layoutManager = LinearLayoutManager(this)
        recyclerView_tela_secundaria.setHasFixedSize(true)
    }

    //Método para passado no parametro para capturar clique no itemview dentro do recyclerview
    private fun abreSegundaTela(filme: Filme){
     //   val vaiPraProximaTela = Intent(this, TelaSecundaria::class.java)
     //   vaiPraProximaTela.putExtra("filme",filme)
     //   startActivity(vaiPraProximaTela)
      //  Toast.makeText(this,"O filme ${filme.titulo} foi clicado",Toast.LENGTH_SHORT).show()
    }
}