package com.example.webviewapp

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        val urlView:WebView = findViewById(R.id.webView)
        val url = intent.getStringExtra("link")
        urlView.webViewClient = WebViewClient()
        urlView.settings.javaScriptEnabled = true // because evry application runs on javascript
        urlView.loadUrl("$url") //or url!!


    }
}