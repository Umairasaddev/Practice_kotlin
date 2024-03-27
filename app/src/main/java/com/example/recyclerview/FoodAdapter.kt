package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class FoodAdapter(val foodList: ArrayList<FoodDataClass>) :
    RecyclerView.Adapter<FoodAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
  val view = LayoutInflater.from(parent.context).inflate(R.layout.each_item,parent,false)
        return ViewHolder(view)

    }

    override fun getItemCount(): Int {
        return foodList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    val food = foodList[position]
        holder.images.setImageResource(food.imageDataCl)
        holder.titles.text = food.titleDataCl
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val images: ImageView = itemView.findViewById(R.id.imageView)
        val titles: TextView = itemView.findViewById(R.id.textView)
    }
}


//
//class FoodAdapter(private val foodList:ArrayList<FoodDataClass>):RecyclerView.Adapter<FoodAdapter.ViewHolder>(){
//
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
//
//        val view = LayoutInflater.from(parent.context).inflate(R.layout.each_item,parent,false)
//        return ViewHolder(view)
//
//    }
//    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//
//        val food  = foodList[position]
//        holder.image.setImageResource(food.imageDataCl)
//        holder.title.text = food.titleDataCl
//    }
//
//    override fun getItemCount(): Int {
//        return foodList.size
//    }
//
//
//
//    class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {
//
//        val image :ImageView = itemView.findViewById(R.id.imageView)
//        val title :TextView = itemView.findViewById(R.id.textView)
//    }
//}
//
