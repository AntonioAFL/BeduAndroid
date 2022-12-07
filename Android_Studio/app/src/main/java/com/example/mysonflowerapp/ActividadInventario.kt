package com.example.mysonflowerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.mysonflowerapp.adapter.ItemAdapter
import com.example.mysonflowerapp.data.Datasource

class ActividadInventario : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad_inventario)

        val misPlantas = Datasource().cargarPlantas()

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(this, misPlantas)
    }

}