package com.devduo.networkimage

import android.Manifest
import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.SurfaceHolder
import android.widget.ImageView
import androidx.annotation.RequiresApi
import androidx.annotation.RequiresPermission
import androidx.appcompat.widget.AppCompatImageView
import com.devduo.networkimage.NIVUtils.executeLink


class NetworkImageView : ImageView {

    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet? = null) : super(context, attrs)
    constructor(
        context: Context, attrs: AttributeSet? = null,
        defStyleAttr: Int = 0
    ) : super(context, attrs, defStyleAttr)


    fun network(link: String, placeHolder: Int, error: Int, fallback: Int) {
        fromNetwork(executeLink(link), placeHolder, error, fallback)
    }

    fun network(link: String, placeHolder: Int, error: Int, fallback: Int, cache: Boolean) {
        if (cache) {
            fromNetwork(executeLink(link), placeHolder, error, fallback)
        } else {
            fromNetwork(executeLink(link), placeHolder, error, fallback, false)
        }
    }

    fun circle(link: String, placeHolder: Int, error: Int, fallback: Int) {
        circleNetwork(executeLink(link), placeHolder, error, fallback)
    }

    fun circle(link: String, placeHolder: Int, error: Int, fallback: Int, cache: Boolean) {
        if (cache) {
            circleNetwork(executeLink(link), placeHolder, error, fallback)
        } else {
            circleNetwork(executeLink(link), placeHolder, error, fallback, false)
        }
    }

    fun random(placeHolder: Int, error: Int, fallback: Int) {
        randomNetwork(placeHolder, error, fallback)
    }

}