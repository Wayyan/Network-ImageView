package com.devduo.networkimage

import android.content.Context
import android.view.SurfaceHolder
import androidx.appcompat.widget.AppCompatImageView


class NetworkImageView(context: Context) : AppCompatImageView(context) {
    fun network(link: String, placeHolder: Int) {
        fromNetwork(executeLink(link), placeHolder)
    }

    private fun executeLink(link: String): String {
        return if (link.matches(NIVConstants.DRIVE_PATTERN_1)) {
            NIVConstants.PREFIX.plus(link.split("=")[1])
        } else if (link.matches(NIVConstants.DRIVE_PATTERN_2)) {
            val firstCut = link.split("d/")[1]
            val id = firstCut.split("/")[0]
            NIVConstants.PREFIX.plus(id)
        } else
            link
    }
}