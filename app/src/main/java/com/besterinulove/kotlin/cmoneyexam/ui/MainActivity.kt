package com.besterinulove.kotlin.cmoneyexam.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.besterinulove.kotlin.cmoneyexam.R
import com.besterinulove.kotlin.cmoneyexam.ui.network.NetWorkActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_main_next.setOnClickListener { startActivity(Intent(this, NetWorkActivity::class.java)) }
    }
}
