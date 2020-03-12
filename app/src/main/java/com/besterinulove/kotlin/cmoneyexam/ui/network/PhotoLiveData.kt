package com.besterinulove.kotlin.cmoneyexam.ui.network

import android.util.Log
import androidx.lifecycle.LiveData
import com.besterinulove.kotlin.cmoneyexam.data.Photo
import com.besterinulove.kotlin.cmoneyexam.data.PhotoApi
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class PhotoLiveData : LiveData<List<Photo>>() {
    private val TAG = PhotoLiveData::class.java.simpleName
    val retrofit = Retrofit.Builder()
        .baseUrl("https://jsonplaceholder.typicode.com")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    val photoApi = retrofit.create(PhotoApi::class.java)
    override fun onActive() {
        super.onActive()
        photoApi.getPhotos().enqueue(object : Callback<List<Photo>> {
            override fun onFailure(call: Call<List<Photo>>, t: Throwable) {
            }

            override fun onResponse(call: Call<List<Photo>>, response: Response<List<Photo>>) {
                val photos = response.body()
                value = photos
            }
        })
    }
}