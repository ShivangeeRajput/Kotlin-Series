package com

import android.content.Context
import android.graphics.Canvas
import android.view.View
import androidx.compose.ui.graphics.Color
import java.security.KeyStore.Entry.Attribute

class CustomView(context: Context, attrs:Attribute): View(context,attrs) {
    private val customColor:Int= Color.Red
    private val customTextSize:Float=24f

    init {

    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        val width=MeasureSpec.getSize(widthMeasureSpec)
        val height=MeasureSpec.getSize(heightMeasureSpec)
        setMeasuredDimension(width,height)
    }

    override fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) {
        super.onLayout(changed, left, top, right, bottom)
    }
}
