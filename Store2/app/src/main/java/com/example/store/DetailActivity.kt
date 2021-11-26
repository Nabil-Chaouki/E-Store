package com.example.store

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import com.example.store.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val articleID = intent.getIntExtra(ARTICLE_ID_EXTRA, -1)
        val article = articleFromID(articleID)
        if (article != null) {
            binding.cover.setImageResource(article.cover)
            binding.title.text = article.title
            binding.description.text = article.description
            binding.author.text = article.author
        }

    }

    private fun articleFromID(articleID: Int): Article? {
        for (article in articleList) {
            if (article.id == articleID)
                return article
        }
        return null
    }

    fun onCheckboxClicked(view: android.view.View) {

        if (view is CheckBox) {
            val checked: Boolean = view.isChecked

            when (view.id) {
                R.id.cB1 -> {
                    if (checked) {
                        // Put some meat on the sandwich
                        binding.cB1.tag = "1"
                    } else {
                        binding.cB1.tag="0"

                    }
                }
            }
        }

    }
}