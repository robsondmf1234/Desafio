package com.example.desafio.adapter

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.desafio.fragment.FragmentOne

class MyPageAdapter(fm: FragmentManager, context: Context?, fragment: Fragment) :
    FragmentStateAdapter(fragment) {

    //Lista com as categorias dos filmes
    val categoriesList: List<String> = listOf("Todos", "Acao", "Aventura", "Drama", "Ficcao", "Comedia")

    override fun getItemCount(): Int {
        return categoriesList.size
    }

    override fun createFragment(position: Int): Fragment {
        return FragmentOne(categoriesList[position])
    }
}