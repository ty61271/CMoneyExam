package com.besterinulove.kotlin.cmoneyexam.ui.network

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.besterinulove.kotlin.cmoneyexam.data.Photo
import com.besterinulove.kotlin.cmoneyexam.data.Repository

class NetWorkViewModel : ViewModel() {
    private val repository: Repository =
        Repository()

    fun getPhotoLiveData():LiveData<List<Photo>>{
        return repository.getPhotos()
    }
}