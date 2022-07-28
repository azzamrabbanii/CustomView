package com.example.customview.viewcustom

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class CircleView(ctx : Context, attr : AttributeSet) : View(ctx, attr) {

    // radius untuk view
    private var radius = 100f

    // untuk memberi warna pada tampilan view
    private var paint = Paint(Paint.ANTI_ALIAS_FLAG)

    // untuk menggambar view ke tampilan
    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        paint.color = Color.RED
        canvas?.drawCircle(radius, radius, radius, paint)
    }

    // onFinishedInflate() -> Dipangil setelah view dan semua turunannya berhasil di inflated dari xml.

    // onMeasure() -> Dipangil untuk menentukan ukuran view dan semua turunannya.

    // onLayout() -> Dipangil ketika view hatus menetapkan ukuran dan posisi untuk semua turunan nya.

    // onSizeChanged() -> Dipangil ketika ukuran view telah berubah.

    // onDraw() -> Dipangil ketika tampilan harus melakukan render kontennya.

    // onKeyDown() -> Dipangil ketika ada sebuah event key down baru terjadi.

    // onKeyUp() -> Dipangil ketika event keyup terjadi

    // onTrackballEvent() -> Dipangil ketika terjadi gerakan pada trackball.

    // onTouchEvent() -> Dipangil ketika terjadi sentuhan pada layar.
}