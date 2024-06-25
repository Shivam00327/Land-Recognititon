package com.example.landrecognition.Domain

import android.graphics.Bitmap

interface LandMarkClassifier {
    fun classify(bitmap: Bitmap,rotation:Int):List<Classification>
}