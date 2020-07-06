package com.devduo.networkimage

import android.widget.ImageView
import androidx.appcompat.widget.AppCompatImageView
import com.squareup.picasso.Picasso

fun ImageView.fromNetwork(link: String, placeHolder: Int) {
    Picasso.get()
        .load(link)
        .placeholder(placeHolder)
        .fit()
        .centerInside()
        .into(this)
}