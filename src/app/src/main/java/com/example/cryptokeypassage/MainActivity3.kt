package com.example.cryptokeypassage

import android.graphics.Color
import android.graphics.LinearGradient
import android.graphics.Shader
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        supportActionBar?.hide()

        val textView = findViewById<TextView>(R.id.textView7)

        val text = "Приложите телефон\nк турникету"

        val color1 = Color.parseColor("#396AFE")

        val color2 = Color.parseColor("#E5ECFF")

        val linearGradient = LinearGradient(
            0f, 0f, 0f, textView.paint.textSize * 2,
            color1, color2, Shader.TileMode.CLAMP
        )

        textView.paint.shader = linearGradient

        textView.text = text



    }
}