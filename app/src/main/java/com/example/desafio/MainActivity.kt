package com.example.desafio

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.desafio.adapter.MyPageAdapter
import com.example.desafio.fragment.FragmentFavorite
import com.example.desafio.fragment.FragmentOne
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        supportActionBar?.hide()

        val fragmentAdapter = MyPageAdapter(supportFragmentManager)
        viewPager.adapter = fragmentAdapter
        tabLayout.setupWithViewPager(viewPager)

        //Capturando clique no BottomNavigation
        bottomNavigation.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.icon_home -> {
                    val fragmentAdapter = MyPageAdapter(supportFragmentManager)
                    buttomClicado("Botao Home clicado!", fragmentAdapter)

                    true
                }
                R.id.icon_favorite -> {
                    val FragmentFavorite = MyPageAdapter(supportFragmentManager)
                    buttomClicado("Botao Favorite clicado!!", FragmentFavorite)

                    true
                }
                R.id.icon_search -> {
                    val fragmentAdapter = MyPageAdapter(supportFragmentManager)
                    buttomClicado("Botao Search clicado!", fragmentAdapter)

                    true
                }
                else -> false
            }
        }
    }

    fun buttomClicado(mensagem: String, fragment: MyPageAdapter) {

        Toast.makeText(this, "${mensagem}", Toast.LENGTH_SHORT).show()

        viewPager.adapter = fragment
        tabLayout.setupWithViewPager(viewPager)

    }
}