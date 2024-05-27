package com.example.projekf

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class OfferActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_offer)

        val btnOutOffer2 = findViewById<ImageView>(R.id.BtnOutOffer2)
        val imageViewOffer4 = findViewById<ImageView>(R.id.imageViewOffer4)
        val imageViewOffer6 = findViewById<ImageView>(R.id.imageViewOffer6)
        val imageViewOffer8 = findViewById<ImageView>(R.id.imageViewOffer8)
        val imageViewOffer10 = findViewById<ImageView>(R.id.imageViewOffer10)

        // Set an OnClickListener to navigate back to the previous screen
        btnOutOffer2.setOnClickListener {
            finish()
        }
        imageViewOffer4.setOnClickListener {
            val intent = Intent(this, DetailActivity1::class.java)
            startActivity(intent)
        }
        imageViewOffer6.setOnClickListener {
            val intent = Intent(this, DetailActivity1::class.java)
            startActivity(intent)
        }
        imageViewOffer8.setOnClickListener {
            val intent = Intent(this, DetailActivity1::class.java)
            startActivity(intent)
        }
        imageViewOffer10.setOnClickListener {
            val intent = Intent(this, DetailActivity1::class.java)
            startActivity(intent)
        }
    }
}