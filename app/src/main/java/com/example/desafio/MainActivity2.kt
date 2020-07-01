package com.example.desafio

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.desafio.adapter.MyPageAdapter
import com.example.desafio.repositorio.Filme
import com.example.desafio.repositorio.Mock
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        /*    if (supportActionBar != null) {
                supportActionBar!!.hide()
            }
        */

        //Recupera da classe Mock uma lista com filmes
        val listaComFilmes = Mock().getListaFilmes()

        val fragmentAdapter = MyPageAdapter(supportFragmentManager)
        viewPager.adapter = fragmentAdapter
        tabLayout.setupWithViewPager(viewPager)
    }


    private fun abreSegundaTela(filme: Filme) {
        val vaiPraProximaTela = Intent(this, TelaSecundaria::class.java)
        vaiPraProximaTela.putExtra("filme", filme)
        startActivity(vaiPraProximaTela)

    }
}