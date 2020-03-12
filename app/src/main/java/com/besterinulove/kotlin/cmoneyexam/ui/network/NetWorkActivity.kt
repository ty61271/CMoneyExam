package com.besterinulove.kotlin.cmoneyexam.ui.network

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.besterinulove.kotlin.cmoneyexam.R
import com.besterinulove.kotlin.cmoneyexam.ui.DetailActivity
import com.besterinulove.kotlin.cmoneyexam.ui.recycler.PhotoAdapter
import kotlinx.android.synthetic.main.activity_net_work.*

class NetWorkActivity : AppCompatActivity() {
    val TAG = NetWorkActivity::class.java.simpleName

    companion object {
        const val INTENT_ID = "id"
        const val INTENT_TITLE = "title"
        const val INTENT_URL_PATH = "urlPath"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_net_work)
        val adapter = PhotoAdapter {
            startActivity(Intent(this@NetWorkActivity, DetailActivity::class.java).apply {
                putExtra(INTENT_ID, it.id)
                putExtra(INTENT_TITLE, it.title)
                putExtra(INTENT_URL_PATH, it.url)
            })
        }

        recycler_network.apply {
            setHasFixedSize(true)
            layoutManager = GridLayoutManager(this@NetWorkActivity, 4)
            this.adapter = adapter
            setItemViewCacheSize(50)
        }


        val viewModel = ViewModelProvider(this).get(NetWorkViewModel::class.java)
        viewModel.getPhotoLiveData().observe(this, Observer {
            adapter.photos = it
            adapter.notifyDataSetChanged()
        })
    }
}
