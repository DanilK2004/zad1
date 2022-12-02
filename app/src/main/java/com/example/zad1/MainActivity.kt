package com.example.zad1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.content.SharedPreferences
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var APP_PREFERENS = "setting";
        var P_log = "Log";
        var P_PAS = "Pas";
        lateinit var settings: SharedPreferences
        lateinit var nameBox: EditText
        lateinit var nameView: TextView
    }

    fun GoToActivity(view: View) {
        val log = findViewById<EditText>(R.id.editText)
        val pas = findViewById<EditText>(R.id.editTextPassword)

        if (log.text.toString().isNotEmpty() || pas.text.toString().isNotEmpty()) {
            val randomIntent = Intent(this, MainActivity2::class.java)
            randomIntent.putExtra("pas", pas.text.toString())
            randomIntent.putExtra("log", log.text.toString())

            startActivity(randomIntent)
        }

    }
}

