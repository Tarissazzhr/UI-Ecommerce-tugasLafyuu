package com.example.projekf

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.login_layout)

        val btnSignIn = findViewById<Button>(R.id.buttonSignIn)
        btnSignIn.setOnClickListener {
            val intent = Intent (this, HomeActivity::class.java)
            startActivity(intent)
        }
        val btnRegis = findViewById<TextView>(R.id.textViewRegis)
        btnRegis.setOnClickListener {
            val intent = Intent (this, RegisterActivity::class.java)
            startActivity(intent)
        }

    }
}