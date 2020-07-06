package com.devduo.networkimageview

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.widget.ImageView


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
        Log.e("library,", link)
        return if (link.contains(NIVConstants.DRIVE_PATTERN_1)) {
            Log.e("library,", NIVConstants.PREFIX.plus(link.split("=")[1]))
            NIVConstants.PREFIX.plus(link.split("=")[1])
        } else if (link.contains(NIVConstants.DRIVE_PATTERN_2)) {
            val firstCut = link.split("d/")[1]
            val id = firstCut.split("/")[0]
            Log.e("library,", NIVConstants.PREFIX.plus(id))
            NIVConstants.PREFIX.plus(id)
        } else
            link
    }
}