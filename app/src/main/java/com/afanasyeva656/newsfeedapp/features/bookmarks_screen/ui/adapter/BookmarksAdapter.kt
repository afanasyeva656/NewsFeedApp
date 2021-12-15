package com.afanasyeva656.newsfeedapp.features.bookmarks_screen.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.afanasyeva656.newsfeedapp.R
import com.afanasyeva656.newsfeedapp.features.main_screen.domain.model.ArticleDomainModel
import com.afanasyeva656.newsfeedapp.features.main_screen.ui.adapter.ArticlesAdapter
import com.bumptech.glide.Glide

class BookmarksAdapter(
    private var bookmarkModels: List<ArticleDomainModel>
) :
    RecyclerView.Adapter<BookmarksAdapter.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val title: TextView
        val description: TextView
        val publishedAt: TextView
        val imageView: ImageView

        init {
            this.title = view.findViewById<TextView>(R.id.tvTitle)
            this.description = view.findViewById<TextView>(R.id.tvDescription)
            this.publishedAt = view.findViewById<TextView>(R.id.tvPublishAt)
            this.imageView = view.findViewById<ImageView>(R.id.ivNews)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_article, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.title.text = bookmarkModels[position].title
        holder.description.text = bookmarkModels[position].description
        holder.publishedAt.text = bookmarkModels[position].publishedAt
        Glide
            .with(holder.itemView)
            .load(bookmarkModels[position].urlToImage)
            .placeholder(R.drawable.ic_baseline_cloud_download_24)
            .error(R.drawable.ic_baseline_error_24)
            .into(holder.imageView)
    }

    override fun getItemCount(): Int {
        return bookmarkModels.size
    }

    fun updateArticles(updatedArticleModels: List<ArticleDomainModel>) {
        bookmarkModels = updatedArticleModels
        notifyDataSetChanged()
    }
}