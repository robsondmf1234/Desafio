package com.example.desafio

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.desafio.adapter.MyPageAdapter
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
                    Toast.makeText(this, "Botao Home clicado!", Toast.LENGTH_SHORT).show()
                    val fragmentAdapter = MyPageAdapter(supportFragmentManager)

                    viewPager.adapter = fragmentAdapter
                    tabLayout.setupWithViewPager(viewPager)

                    true
                }
                R.id.icon_favorite -> {
                    Toast.makeText(this, "Botao Favorite clicado!!", Toast.LENGTH_SHORT).show()
                    val fragmentAdapter = MyPageAdapter(supportFragmentManager)

                    val fragment1 = MyPageAdapter(supportFragmentManager)

                    //Adicionar o Fragment Favorite a tela inicial
                    viewPager.adapter = fragment1
                    //tabLayout.setupWithViewPager(viewPager)

                    true
                }
                R.id.icon_search -> {
                    Toast.makeText(this, "Botao Search clicado!", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
            }
    }
}}