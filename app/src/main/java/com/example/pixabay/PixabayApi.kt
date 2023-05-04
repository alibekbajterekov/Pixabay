package com.example.pixabay

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PixabayApi {
    @GET("api/")
    fun getImage(
        @Query("q") search: String,
        @Query("page") page :Int,
        @Query("per_page") per_page :Int=3,
        @Query("key") key: String = "33148109-2b7ff4ca3aa7aaa34fc775eea"
    ):Call<PixaModel>
}