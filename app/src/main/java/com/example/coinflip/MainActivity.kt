package com.example.coinflip

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val flipCoin: Button = findViewById(R.id.coin_flip)
        val coinImage: ImageView = findViewById(R.id.coin_view)


        flipCoin.setOnClickListener {
            coinFlip(coinImage)
        }
    }

    fun coinFlip(imageView: ImageView) {
        val flipResult = (1..2).random()

        when (flipResult) {
            1 -> imageView.setImageResource(R.drawable.coin1)
            2 -> imageView.setImageResource(R.drawable.coin2)
        }
    }
}