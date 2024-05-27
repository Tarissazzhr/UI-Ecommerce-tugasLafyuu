package com.example.projekf

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class FavoriteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_favorite)

        val imageButton2 = findViewById<ImageView>(R.id.imageButton2)
        val imageView4 = findViewById<ImageView>(R.id.imageView4)
        val imageView6 = findViewById<ImageView>(R.id.imageView6)
        val imageView8 = findViewById<ImageView>(R.id.imageView8)
        val imageView10 = findViewById<ImageView>(R.id.imageView10)

        // Set an OnClickListener to navigate back to the previous screen
        imageButton2.setOnClickListener {
            finish()
        }
        imageView4.setOnClickListener {
            val intent = Intent(this, DetailActivity1::class.java)
            startActivity(intent)
        }
        imageView6.setOnClickListener {
            val intent = Intent(this, DetailActivity1::class.java)
            startActivity(intent)
        }
        imageView8.setOnClickListener {
            val intent = Intent(this, DetailActivity1::class.java)
            startActivity(intent)
        }
        imageView10.setOnClickListener {
            val intent = Intent(this, DetailActivity1::class.java)
            startActivity(intent)
        }
    }
}