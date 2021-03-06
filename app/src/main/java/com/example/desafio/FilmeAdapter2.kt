package com.example.desafio


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.desafio.model.FilmeItem
import com.example.desafio.repositorio.Filme
import kotlinx.android.synthetic.main.list_item.view.*


class FilmeAdapter2(val listaFilmes: List<Filme>)
    : RecyclerView.Adapter<FilmeAdapter2.FilmeViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmeViewHolder {
        val filmeView =
            LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)

        return FilmeViewHolder(filmeView)
    }

    override fun onBindViewHolder(holder: FilmeViewHolder, position: Int) {
        val filmeAtual = listaFilmes[position]

        holder.imageViewCapa.setImageResource(filmeAtual.imagemCapa)
        holder.textViewNota.text = filmeAtual.nota
        holder.textViewTitulo.text = filmeAtual.titulo
        holder.textViewCategoria.text = filmeAtual.categoria
        holder.textViewPais.text = filmeAtual.paisFilme
        //holder.textViewDuracao.text = filmeAtual.duracao

        holder.textViewDescricao.text = filmeAtual.descricao
    }

    override fun getItemCount(): Int {
        return listaFilmes.size
    }

    class FilmeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageViewCapa: ImageView = itemView.imageCapaFilme
        val textViewNota: TextView = itemView.textNotaFilme
        val textViewTitulo: TextView = itemView.textTituloFilme
        val textViewCategoria: TextView = itemView.textCategoria
        val textViewPais: TextView = itemView.textPais

        //val textViewDuracao:TextView = itemView.text_duracao

        val textViewDescricao: TextView = itemView.textDescricao

        }
}