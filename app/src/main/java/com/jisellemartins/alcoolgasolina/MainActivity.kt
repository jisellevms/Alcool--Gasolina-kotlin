package com.jisellemartins.alcoolgasolina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btCalculcar(view: View){
        val precoAlcool = etAlcool.text.toString()
        val precoGasolina = etGasolina.text.toString()
    }
}