package com.besterinulove.kotlin.cmoneyexam.ui.recycler

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.besterinulove.kotlin.cmoneyexam.R
import com.besterinulove.kotlin.cmoneyexam.data.Photo

class PhotoAdapter(
    private val onItemClickListener: (Photo) -> Unit
) : RecyclerView.Adapter<PhotoViewHolder>() {


    var photos: List<Photo>? = null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhotoViewHolder {
        return PhotoViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.photo_row, parent, false)
        )
    }

    override fun getItemCount() = photos?.size ?: 0

    override fun onBindViewHolder(holder: PhotoViewHolder, position: Int) {
        holder.img.setImageResource(android.R.drawable.screen_background_light)
        val photo = photos!![position]
        holder.bindPhoto(photo,onItemClickListener)
    }

}