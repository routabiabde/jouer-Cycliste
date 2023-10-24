package com.example.baketball_kotlin.Cyclisme

import java.util.Date

sealed class Resultat(
    var temps:Int,
    var classment:Int
){
    data class termine(
        var tempsEffectue:Int,
          var classmenT:Int
    ) : Resultat(tempsEffectue,classmenT)
    data class abondonne(
        var distanceParcoure:Int,
        var raison:String
    ) : Resultat(0,0)
}
