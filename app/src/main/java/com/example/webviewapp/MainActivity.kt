package com.example.webviewapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val url:EditText = findViewById(R.id.edt)
        val btn:Button = findViewById(R.id.btn)

        btn.setOnClickListener {
            val text = url.text.toString()
            val nav = Intent(this,SecondActivity::class.java)
            nav.putExtra("link",text)
            startActivity(nav)

        }

    }
}
