    package com.example.store
    import androidx.recyclerview.widget.RecyclerView
    import com.example.store.databinding.CardCellBinding

    class CardViewHolder (private val cardCellBinding: CardCellBinding,
                          private val clickListener: ArticleClickListener):RecyclerView.ViewHolder(cardCellBinding.root) {
        fun binArticle(article: Article)
        {
            cardCellBinding.cover.setImageResource(article.cover)
            cardCellBinding.title.text = article.title
            cardCellBinding.author.text = article.author

            cardCellBinding.cardView.setOnClickListener{
                clickListener.onClick(article)
            }
        }

    }


