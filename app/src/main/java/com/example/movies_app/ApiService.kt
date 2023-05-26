package com.example.movies_app

import retrofit2.Call
import retrofit2.http.GET

interface ApiService {

    @GET("/api/videos/")
    suspend fun getVideos(): List<Video>
}