package com.afanasyeva656.newsfeedapp.features.main_screen.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.afanasyeva656.newsfeedapp.R
import com.afanasyeva656.newsfeedapp.features.main_screen.domain.model.ArticleDomainModel
import com.bumptech.glide.Glide

class ArticlesAdapter(
    private var articleModels: List<ArticleDomainModel>,
    private val onItemClick: (articleModel: ArticleDomainModel) -> Unit
) :
    RecyclerView.Adapter<ArticlesAdapter.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val title: TextView
        val description: TextView
        val imageView: ImageView

        init {
            this.title = view.findViewById<TextView>(R.id.tvTitle)
            this.description = view.findViewById<TextView>(R.id.tvDescription)
            this.imageView = view.findViewById<ImageView>(R.id.ivNews)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_article, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.title.text = articleModels[position].title
        holder.description.text = articleModels[position].description
        Glide
            .with(holder.itemView)
            .load(articleModels[position].urlToImage)
            .placeholder(R.drawable.ic_baseline_cloud_download_24)
            .error(R.drawable.ic_baseline_error_24)
            .into(holder.imageView)

        holder.itemView.setOnClickListener { onItemClick(articleModels[position]) }
    }

    override fun getItemCount(): Int {
        return articleModels.size
    }

    fun updateArticles(updatedArticleModels: List<ArticleDomainModel>) {
        articleModels = updatedArticleModels
        notifyDataSetChanged()
    }
}