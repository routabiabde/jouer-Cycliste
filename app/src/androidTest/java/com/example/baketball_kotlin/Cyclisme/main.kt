package com.example.baketball_kotlin.Cyclisme


fun main() {
    var c1 = Cycliste("Routabi","abde","moroccane",18)
    var e1 = Etape("Paris",22-5-2022,23-5-2022,20,Difficulte.DIFFICILE)
    var e2 = Etape("Rabat",5-6-2022,3-6-2022,5,Difficulte.FACILE)
    var e3 = Etape("monaco",5-7-2022,3-7-2022,23,Difficulte.DIFFICILE)
    var e4 = Etape("casa",14-9-2022,15-9-2022,8,Difficulte.FACILE)
    c1.nouvelleEtape(e1, Resultat.abondonne(12, "injury"))
    c1.nouvelleEtape(e2, Resultat.termine(12, 1))
    c1.nouvelleEtape(e3,Resultat.termine(20,3))
    c1.nouvelleEtape(e4,Resultat.abondonne(20,"injury"))
    println(c1.etape_result.toString())
    println(c1.toString())
}