package com.alom.androidstudy2

import androidx.resourceinspection.annotation.Attribute.IntMap
import com.bumptech.glide.load.ImageHeaderParser.ImageType

data class PostData(
    val result:Int,
    val message:String,
    val data:ArrayList<Data>
)

data class Data(
    val id:Int,
    val title:String,
    val price:String,
    val image_url:String,
    val time:String
)
