package com.raphael.duastelas

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun navegar(view: View) {
        val valor = entrada1.text.toString()
        val i = Intent(this,MainActivity2::class.java)
        i.putExtra("nome", valor)
        startActivity(i)
        
    }
}