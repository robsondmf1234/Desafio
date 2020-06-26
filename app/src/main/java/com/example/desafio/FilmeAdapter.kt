package com.example.desafio


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.desafio.model.FilmeItem
import kotlinx.android.synthetic.main.list_item.view.*


class FilmeAdapter(val listaFilmes: List<FilmeItem>, val context: Context) :
    RecyclerView.Adapter<FilmeAdapter.FilmeViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmeViewHolder {
        val filmeView =
            LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)

        return FilmeViewHolder(filmeView,context)
    }


    override fun onBindViewHolder(holder: FilmeViewHolder, position: Int) {
        val filmeAtual = listaFilmes[position]

        //holder.itemView.setOnClickListener()
        holder.imageViewCapa.setImageResource(filmeAtual.imagemCapa)
        holder.textViewNota.text = filmeAtual.nota
        holder.textViewTitulo.text = filmeAtual.titulo
        holder.textViewCategoria.text = filmeAtual.categoria
        holder.textViewPais.text = filmeAtual.paisFilme
        holder.textViewDescricao.text = filmeAtual.descricao

    }

    override fun getItemCount(): Int {
        return listaFilmes.size
    }

    class FilmeViewHolder(itemView: View,context: Context) : RecyclerView.ViewHolder(itemView) {
        val imageViewCapa: ImageView = itemView.imageCapaFilme
        val textViewNota: TextView = itemView.textNotaFilme
        val textViewTitulo: TextView = itemView.textTituloFilme
        val textViewCategoria: TextView = itemView.textCategoria
        val textViewPais: TextView = itemView.textPais
        val textViewDescricao: TextView = itemView.textDescricao

        //Adicionando clique ao recyclerview
        //val clique = itemView.setOnClickListener({
        //    Toast.makeText(context, "O ${textViewTitulo} foi clicado", Toast.LENGTH_SHORT).show()
        //})
    }
}