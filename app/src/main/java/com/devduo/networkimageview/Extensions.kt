package com.devduo.networkimageview

import android.util.Log
import android.widget.ImageView
import androidx.appcompat.widget.AppCompatImageView
import com.squareup.picasso.Picasso

fun ImageView.fromNetwork(link: String, placeHolder: Int) {
    Log.e("library",link)
    Picasso.get()
        .load(link)
        .placeholder(placeHolder)
        .fit()
        .centerInside()
        .into(this)
}