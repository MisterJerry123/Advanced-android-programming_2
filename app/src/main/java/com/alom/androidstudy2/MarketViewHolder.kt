package com.alom.androidstudy2

import androidx.recyclerview.widget.RecyclerView
import com.alom.androidstudy2.databinding.ItemMarketBinding

class MarketViewHolder(binding:ItemMarketBinding):RecyclerView.ViewHolder(binding.root) {

    val img = binding.ivGoodsImg
    val goodsTitle = binding.tvGoodsTitle
    val goodsPrice = binding.tvGoodsPrice
    val goodsTime = binding.tvPostTime
}