package com.alom.androidstudy2

import retrofit2.Call
import retrofit2.http.Header
import retrofit2.http.POST

interface Api {

    @POST("rpc/get_item6")
    fun getItems(
        @Header ("apikey") api:String

    ): Call<PostData>
}