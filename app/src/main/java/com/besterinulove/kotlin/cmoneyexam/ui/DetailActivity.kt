package com.besterinulove.kotlin.cmoneyexam.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.besterinulove.kotlin.cmoneyexam.R
import com.besterinulove.kotlin.cmoneyexam.ui.network.NetWorkActivity
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val id = intent.getIntExtra(NetWorkActivity.INTENT_ID, -1)
        val title = intent.getStringExtra(NetWorkActivity.INTENT_TITLE)
        val url = intent.getStringExtra(NetWorkActivity.INTENT_URL_PATH)

        tv_network_id.text = id.toString()
        tv_network_title.text = title
        Picasso.get().load(url).into(img_network)
    }
}
