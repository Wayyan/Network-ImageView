package com.devduo.networkimage

object NIVConstants {
    const val PREFIX= "https://drive.google.com/uc?export=download&id="
    const val DRIVE_INDITIFIER="drive.google.com"
    val DRIVE_PATTERN_1= Regex("(.*)://drive.google.com/open?id=(.*)")
     val DRIVE_PATTERN_2=Regex("(.*)://drive.google.com/file/d/(.*)/view?usp=sharing")
}