package com.besterinulove.kotlin.cmoneyexam.data

import androidx.lifecycle.LiveData
import com.besterinulove.kotlin.cmoneyexam.ui.network.PhotoLiveData

class Repository {
    private val photoLiveData = PhotoLiveData()
    fun getPhotos(): LiveData<List<Photo>> {
        return photoLiveData
    }
}