package com.example.excercise1wanyama

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class WebsiteActivity : AppCompatActivity() {
    lateinit var myWebview:WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_website)

        myWebview=findViewById(R.id.mweb)
        var settings=myWebview.settings
        settings.javaScriptEnabled=true
        myWebview.loadUrl("https://www.emobilis.ac.ke")
    }
}