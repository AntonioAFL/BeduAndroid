package com.example.mysonflowerapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.graphics.Color
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.EditText

const val TEXTO = "TEXTO"

class MainActivity : AppCompatActivity() {

    lateinit var button:Button
    lateinit var acceder:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)
        acceder = findViewById(R.id.button_mensaje)

        button.setOnClickListener {
            if (button.text != "Soy Azul"){
                button.setBackgroundColor(Color.parseColor("#6495ED"))
                button.text = "SoyAzul"
            } else {
                button.setBackgroundColor(Color.parseColor("#FF0000"))
                button.text = "Soy Rojo"
            }
        }

        acceder.setOnClickListener { changeActivity(it) }
    }

    fun changeActivity(view: View){
        var editText = findViewById<EditText>(R.id.campo_de_texto)
        var mensaje = editText.text.toString()
        val intent = Intent(this, ActividadDos::class.java).apply{
            putExtra(TEXTO, mensaje)
        }

        startActivity(intent)
    }

    fun verInventario(view: View){
        val intent = Intent(this, ActividadInventario::class.java).apply {}
        startActivity(intent)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.sunflower_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        return when (item.itemId) {
            R.id.inventario -> {
                abrirInventario()
                true
            }
            R.id.ayuda -> {
                mostrarAyuda()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}