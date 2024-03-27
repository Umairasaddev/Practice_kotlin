package com.example.ViewPager

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R




class ViewPagerAdapter(var imageList: List<Int>) :
    RecyclerView.Adapter<ViewPagerAdapter.PageViewHolder>() {
    class PageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val image: ImageView = itemView.findViewById(R.id.imageView2)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PageViewHolder {
        return PageViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.images, parent, false)
        )
    }

    override fun getItemCount(): Int {

        return imageList.size

    }

    override fun onBindViewHolder(holder: PageViewHolder, position: Int) {

        holder.image.setImageResource(imageList[position])
    }

}

















