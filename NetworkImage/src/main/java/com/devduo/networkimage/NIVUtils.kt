package com.devduo.networkimage

import android.content.Context
import com.bumptech.glide.Glide


object NIVUtils {
    fun executeLink(link: String): String {
        return if (link.contains(NIVConstants.DRIVE_PATTERN_1)) {
            NIVConstants.PREFIX.plus(link.split("=")[1])
        } else if (link.contains(NIVConstants.DRIVE_PATTERN_2)) {
            val firstCut = link.split("d/")[1]
            val id = firstCut.split("/")[0]
            NIVConstants.PREFIX.plus(id)
        } else
            link
    }

    fun glide(context: Context) = Glide.get(context)
}