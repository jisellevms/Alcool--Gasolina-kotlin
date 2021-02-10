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
        supportActionBar?.hide()
    }

    fun btCalculcar(view: View) {
        val precoAlcool = etAlcool.text.toString()
        val precoGasolina = etGasolina.text.toString()

        if(validarCampos(precoAlcool, precoGasolina)) calcularMelhorPreco(precoAlcool, precoGasolina)
        else tvResult.setText("Preencha todos os campos primeiro")

    }

    fun validarCampos(precoAlcool: String, precoGasolina: String) : Boolean {
        return !(precoAlcool == null || precoAlcool.equals("") || precoGasolina == null || precoGasolina.equals(""))
    }

    fun calcularMelhorPreco(precoAlcool: String, precoGasolina: String) {

        val valorAlcool = precoAlcool.toDouble()
        val valorGasolina = precoGasolina.toDouble()

        val resultadoPreco = valorAlcool / valorGasolina


        if (resultadoPreco >= 0.7) tvResult.setText("Melhor utilizar Gasolina")
        else tvResult.setText("Melhor utilizar Álcool")

    }
}