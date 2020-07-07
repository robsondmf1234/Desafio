package com.example.desafio

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.desafio.adapter.MyPageAdapter
import com.example.desafio.fragment.FragmentFavorite
import com.example.desafio.fragment.FragmentHome
import com.example.desafio.fragment.FragmentSearch
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    val manager = supportFragmentManager


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        //Chama o fragment home por padrão
        val fragmentHome = FragmentHome("Todos")
        changeFragmentHome(fragmentHome)

        //Capturando clique no BottomNavigation
        bottomNavigation.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.icon_home -> {
                    val fragmentHome = FragmentHome("Todos")
                    changeFragmentHome(fragmentHome)
                    true
                }
                R.id.icon_favorite -> {
                    //Seleciona o Fragment para substituir
                    val fragmentFavorite = FragmentFavorite()
                    changeFragmentFavorite(fragmentFavorite)
                    true
                }
                R.id.icon_search -> {
                    //Seleciona o Fragment para substituir
                    val fraSearch = FragmentSearch()
                    changeFragmentSearch(fraSearch)
                    true
                }
                else -> false
            }
        }
    }

    fun changeFragmentHome(fragmentHome: FragmentHome) {
        val transaction = manager.beginTransaction()
        transaction.replace(R.id.frame_main, fragmentHome)
        //transaction.addToBackStack(null)
        transaction.commit()
    }

    fun changeFragmentFavorite(fragmentFavorite: FragmentFavorite) {
        val transaction = manager.beginTransaction()
        transaction.replace(R.id.frame_main, fragmentFavorite)
        //transaction.addToBackStack(null)
        transaction.commit()
    }

    fun changeFragmentSearch(fraSearch: FragmentSearch) {
        val transaction = manager.beginTransaction()
        transaction.replace(R.id.frame_main, fraSearch)
        //transaction.addToBackStack(null)
        transaction.commit()
    }

}