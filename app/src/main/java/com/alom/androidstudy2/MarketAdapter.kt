package com.alom.androidstudy2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.alom.androidstudy2.databinding.ItemMarketBinding
import com.bumptech.glide.Glide

class MarketAdapter(val postList: ArrayList<PostData>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val binding = ItemMarketBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return MarketViewHolder(binding)
    }

    override fun getItemCount() = postList.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if(holder is MarketViewHolder){
            Glide
                .with(holder.itemView.context)
                .load(postList[position].img)
                .into(holder.img)

            holder.goodsTime.text = postList[position].time
            holder.goodsPrice.text = postList[position].price
            holder.goodsTitle.text = postList[position].title
        }
    }
}