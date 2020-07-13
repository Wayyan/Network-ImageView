package com.devduo.networkimage

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.resource.bitmap.CircleCrop

fun ImageView.fromNetwork(link: String, placeHolder: Int, error: Int, fallback: Int) {
    val url = "$link?w=360" //Use Up to one third of screen size
    Glide.with(this)
        .load(link)
        .centerCrop()
        .placeholder(placeHolder)
        .error(error)
        .fallback(fallback)
        .into(this)

}

fun ImageView.fromNetwork(
    link: String,
    placeHolder: Int,
    error: Int,
    fallback: Int,
    cache: Boolean = false
) {
    val url = "$link?w=360" //Use Up to one third of screen size
    Glide.with(this)
        .load(link)
        .centerCrop()
        .placeholder(placeHolder)
        .error(error)
        .fallback(fallback)
        .skipMemoryCache(true)
        .diskCacheStrategy(DiskCacheStrategy.NONE)
        .into(this)

}

fun ImageView.randomNetwork(placeHolder: Int, error: Int, fallback: Int) {
    Glide.with(this)
        .load("https://source.unsplash.com/random")
        .centerCrop()
        .placeholder(placeHolder)
        .error(error)
        .fallback(fallback)
        .skipMemoryCache(true)
        .diskCacheStrategy(DiskCacheStrategy.NONE)
        .into(this)
}

fun ImageView.circleNetwork(link: String, placeHolder: Int, error: Int, fallback: Int) {
    Glide.with(this)
        .load(link)
        .centerCrop()
        .placeholder(placeHolder)
        .error(error)
        .fallback(fallback)
        .transform(CircleCrop())
        .into(this)
}

fun ImageView.circleNetwork(
    link: String,
    placeHolder: Int,
    error: Int,
    fallback: Int,
    cache: Boolean = false
) {
    val url = "$link?w=360" //Use Up to one third of screen size
    Glide.with(this)
        .load(link)
        .centerCrop()
        .placeholder(placeHolder)
        .error(error)
        .fallback(fallback)
        .skipMemoryCache(true)
        .diskCacheStrategy(DiskCacheStrategy.NONE)
        .transform(CircleCrop())
        .into(this)

}