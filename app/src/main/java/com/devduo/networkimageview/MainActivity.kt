package com.devduo.networkimageview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    lateinit var networkImageView: NetworkImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        networkImageView = findViewById(R.id.niv)
        networkImageView.network(
            "https://drive.google.com/file/d/1z-apBy-Ue9p4eLNXXgvTwljrr14nW4hX/view?usp=sharing",
            R.drawable.place_holder
        )
    }
}