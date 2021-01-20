package com.raphael.duastelas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.raphael.duastelas.R
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val i = intent
        val nome = i.getStringExtra("nome")
        saida1.text = nome

    }
}