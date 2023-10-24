package com.example.baketball_kotlin.Cyclisme

import java.util.Date

data class Etape(
    var nom:String,
    var dateDebut: Int,
    var dateFin:Int,
    var distance:Int,
    var difficulte:Difficulte
) {
}