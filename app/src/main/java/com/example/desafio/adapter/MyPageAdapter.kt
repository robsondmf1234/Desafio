package com.example.desafio.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.desafio.fragment.FragmentOne

class MyPageAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                FragmentOne("Todos")
            }
            1 -> {
                FragmentOne("Acao")
            }
            2 -> {
                FragmentOne("Aventura")
            }
            3 -> {
                FragmentOne("Comedia")
            }
            4 -> {
                FragmentOne("Drama")
            }
            else -> {
                return FragmentOne("Ficcao")
            }
        }
    }

    override fun getCount(): Int {
        return 5
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "Todos"
            1 -> "Acao"
            2 -> "Aventura"
            3 -> "Comedia"
            4 -> "Drama"
            else -> return "Ficcao"
        }
    }
}