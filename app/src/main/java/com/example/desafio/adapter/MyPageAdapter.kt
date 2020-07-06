package com.example.desafio.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.desafio.fragment.FragmentOne
import java.util.*

class MyPageAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    companion object {
        //Lista com as categorias dos filmes
        val categoriesList: List<String> =
            Arrays.asList("Todos", "Acao", "Aventura", "Drama", "Ficcao", "Comedia")
    }

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> FragmentOne(categoriesList[position])
            1 -> FragmentOne(categoriesList[position])
            2 -> FragmentOne(categoriesList[position])
            3 -> FragmentOne(categoriesList[position])
            4 -> FragmentOne(categoriesList[position])
            else -> FragmentOne(categoriesList[position])
        }
    }
/*
    fun getFragmentFavorite(): Fragment {

        return FragmentFavorite()
    }*/

    override fun getCount(): Int {
        return categoriesList.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return categoriesList[position]
    }
}