package com.example.Retrofit

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recyclerview.R

class NewsAdapter(val context: Context, val articles: List<Articles>) :
    RecyclerView.Adapter<NewsAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val image: ImageView = itemView.findViewById(R.id.imageView)
        val title: TextView = itemView.findViewById(R.id.newsTitle)
        val description: TextView = itemView.findViewById(R.id.newsDescription)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return articles.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val article = articles[position]
        bindData(holder, article)
        setItemClickListener(holder, article)
    }


    private fun bindData(holder: ViewHolder, article: Articles) {
        holder.title.text = article.title
        holder.description.text = article.description
        Glide.with(context).load(article.urlToImage).into(holder.image)
    }


    private fun setItemClickListener(holder: ViewHolder, article: Articles) {
        holder.itemView.setOnClickListener {
            val intent = Intent(context, NewsDetailActivity::class.java).apply {
                putExtra("title", article.title)
                putExtra("description", article.description)
                putExtra("urlToImage", article.urlToImage)
            }
            context.startActivity(intent)

        }
    }
}












