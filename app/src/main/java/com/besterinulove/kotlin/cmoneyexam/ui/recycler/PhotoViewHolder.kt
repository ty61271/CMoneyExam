package com.besterinulove.kotlin.cmoneyexam.ui.recycler

import android.os.Handler
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.besterinulove.kotlin.cmoneyexam.data.Photo
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.photo_row.view.*

class PhotoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val handler = Handler()
    val idText = itemView.tv_network_id
    val titleText = itemView.tv_network_title
    val img = itemView.img_network

    fun bindPhoto(photo: Photo, onItemClickListener: (Photo) -> Unit) {
        idText.text = photo.id.toString()
        titleText.text = photo.title
        img.tag = photo.thumbnailUrl
        Picasso.get().load(photo.thumbnailUrl).into(img)
        itemView.setOnClickListener { onItemClickListener(photo) }
    }
}
