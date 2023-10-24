package com.example.baketball_kotlin.Cyclisme

import java.util.Objects

class Cycliste(
    var nom:String,
    var prenom:String,
    var nationalite:String,
    var age:Int,
    var etapes : ArrayList<Etape> = arrayListOf(),
    var etape_result:HashMap<Etape,Resultat> = hashMapOf()
) {
    fun nouvelleEtape(et:Etape,res:Resultat){
        if (!etape_result.containsKey(et)){
              etape_result[et] = res
        }
}

    override fun toString(): String {
        return "non : $nom ;prenom : $prenom ;nationalite  : $nationalite ;age : $age; "
    }

}