package com.song.githubtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        val tv:TextView=findViewById(R.id.tv)
        tv.setOnClickListener { Toast.makeText(this, "clicked button", Toast.LENGTH_SHORT).show() }
    }
}