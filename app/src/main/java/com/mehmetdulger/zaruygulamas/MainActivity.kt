package com.mehmetdulger.zaruygulamas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var button: Button
    private lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.button)
        imageView = findViewById(R.id.imageView)

        button.setOnClickListener{
            rollDice()
        }
    }

    private fun rollDice(){
        val drawableResource = when((1..6).random()){
            1 -> R.drawable.zar1
            2 -> R.drawable.zar2
            3 -> R.drawable.zar3
            4 -> R.drawable.zar4
            5 -> R.drawable.zar5
            else -> R.drawable.zar6
        }
        imageView.setImageResource(drawableResource)
    }
}