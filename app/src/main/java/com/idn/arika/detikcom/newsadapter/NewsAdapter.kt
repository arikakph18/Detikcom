package com.idn.arika.detikcom.newsadapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.idn.arika.detikcom.R
import kotlinx.android.synthetic.main.lay_berita.view.*

class NewsAdapter(val context: Context, val listnews : List<news>):
        RecyclerView.Adapter<NewsAdapter.MyViewHolder>() {
    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var currentnews : news? = null
        var currentPositions : Int =0

        fun setData(currnews: news, pos : Int){
            itemView.tvw_title.text = currnews!!.title
            itemView.tvw_Desc.text = currnews!!.desc
            itemView.img_news.setImageResource(currnews!!.photo)
            this.currentnews
            this.currentPositions
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsAdapter.MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.lay_berita, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listnews.size
    }

    override fun onBindViewHolder(holder: NewsAdapter.MyViewHolder, position: Int) {
        val datanews = listnews[position]
        holder.setData(datanews, position)

        holder.itemView.setOnClickListener(){onItemClickCallback.onItemClick(listnews[position])}
    }

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnClickCallback(onItemClickCallback : OnItemClickCallback){
        this.onItemClickCallback = onItemClickCallback
    }

    interface OnItemClickCallback{
        fun onItemClick(data: news)
    }


}