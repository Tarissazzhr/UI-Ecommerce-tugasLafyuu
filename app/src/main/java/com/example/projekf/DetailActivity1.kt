package com.example.projekf

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail1)

        val btnOut2 = findViewById<ImageView>(R.id.BtnOut2)

        // Set an OnClickListener to navigate back to the previous screen
        btnOut2.setOnClickListener {
            finish()
        }
    }
}