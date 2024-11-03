package com.alom.androidstudy2

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MarketAdapter(val postList: ArrayList<PostData>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount() = postList.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}