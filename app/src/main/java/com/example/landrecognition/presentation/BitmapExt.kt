package com.example.landrecognition.presentation

import android.graphics.Bitmap
import java.lang.IllegalArgumentException

fun Bitmap.centerCrop(desiredWith: Int,desiredHeight:Int):Bitmap{
    val xStart=(width-desiredWith)/2
    val yStart=(width-desiredHeight)/2

    if(xStart<0 || yStart<0 || desiredWith>width|| desiredHeight> height){
        throw IllegalArgumentException("Invalid argument for the centre Cropping")

    }
    return Bitmap.createBitmap(this,xStart,yStart,desiredWith,desiredHeight)
}

