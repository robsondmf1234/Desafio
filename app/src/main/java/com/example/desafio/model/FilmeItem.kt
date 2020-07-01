package com.example.desafio.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class FilmeItem(val id: Int,
                     val imagemCapa: Int,
                     val nota: String,
                     val titulo: String,
                     val categoria: String,
                     val paisFilme: String,
                    // val duracao:String,
                     val descricao: String):Parcelable {
}