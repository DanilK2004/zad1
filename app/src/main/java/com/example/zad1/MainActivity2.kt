package com.example.zad1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    lateinit var tex : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity)
        var tex1 = findViewById<TextView>(R.id.textView6)
        var l = getIntent().getStringExtra("log")
        tex1.text = l.toString()
    }
}