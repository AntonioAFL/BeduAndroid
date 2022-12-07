package com.example.mysonflowerapp.data

import com.example.mysonflowerapp.R
import com.example.mysonflowerapp.model.Planta

class Datasource {
    fun cargarPlantas(): List<Planta> {
        return listOf<Planta>(
            Planta(R.string.maluspumila),
            Planta(R.string.betavulgaris),
            Planta(R.string.coriandrumastivum),
            Planta(R.string.solanumlycopersicum),
            Planta(R.string.perseaamericana),
            Planta(R.string.pyruscommunis),
            Planta(R.string.solanummelongena),
            Planta(R.string.vitisvinifera),
            Planta(R.string.mangiferaindica),
            Planta(R.string.citrusxsinensis),
            Planta(R.string.helianthusannuus),
            Planta(R.string.citrulluslanatus),
            Planta(R.string.hibiscusrosasinensis),
            Planta(R.string.cyperipediumreginae),
            Planta(R.string.aquilegiacoerulea),
            Planta(R.string.magnoliadenudata),
            Planta(R.string.bougainvilleaglabra)
        )
    }
}