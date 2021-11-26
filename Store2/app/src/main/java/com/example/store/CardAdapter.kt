package com.example.store

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.*
import com.example.store.databinding.CardCellBinding

class CardAdapter (
    private val articles: List<Article>,
    private  val clickListener: ArticleClickListener
        )
    : Adapter<CardViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder
    {
        val from = LayoutInflater.from(parent.context)
        val binding = CardCellBinding.inflate(from, parent, false)
        return CardViewHolder(binding, clickListener)
    }
    override fun onBindViewHolder(holder: CardViewHolder, position: Int)
    {
        holder.binArticle(articles[position])
    }

    override fun getItemCount(): Int = articles.size
    }

