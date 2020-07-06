package com.devduo.networkimage

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.SurfaceHolder
import android.widget.ImageView
import androidx.appcompat.widget.AppCompatImageView


class NetworkImageView : ImageView {
    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet? = null) : super(context, attrs)
    constructor(
        context: Context, attrs: AttributeSet? = null,
        defStyleAttr: Int = 0
    ) : super(context, attrs, defStyleAttr)

    fun network(link: String, placeHolder: Int) {
        fromNetwork(executeLink(link), placeHolder)
    }

    private fun executeLink(link: String): String {
        return if (link.contains(NIVConstants.DRIVE_PATTERN_1)) {
            NIVConstants.PREFIX.plus(link.split("=")[1])
        } else if (link.contains(NIVConstants.DRIVE_PATTERN_2)) {
            val firstCut = link.split("d/")[1]
            val id = firstCut.split("/")[0]
            NIVConstants.PREFIX.plus(id)
        } else
            link
    }
}