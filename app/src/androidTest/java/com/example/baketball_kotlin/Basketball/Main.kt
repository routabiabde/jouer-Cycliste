package com.example.baketball_kotlin.Basketball

fun main() {
    // cree des jouers
    var j1 = jouer("abde",4,100,Equipe.OCS)
    var j2 = jouer("OssamaRoutabi",17,350,Equipe.RCA)
    var j3 = jouer("YahyaJabran",5,100,Equipe.WAC)
    var j4 = jouer("othmane",3,200,Equipe.OCK)
    //creation d'une list des equips
    var equips : MutableList<Equip> = mutableListOf()
    // creation des equipe
    var e1 = Equip(Pays.MAROC)
    var e2 = Equip(Pays.ALGERIE)
    var e3 = Equip(Pays.EGYPTE)
    var e4 = Equip(Pays.TUNISIE)
    // ajouter les equipe a list des des equipe
    equips.add(e1)
    equips.add(e2)
    equips.add(e3)
    equips.add(e4)
    // l'ajoute des jouers a list
    println(e1.ajouter(j1))
    println(e1.ajouter(j2))
    println(e1.ajouter(j2))
    // recherch un jouer qui n'appartiant pas  a la list des jouers
    println(e1.recherch(j4))
    // recherch un jouer qui appartiant a la list des jouers
    println(e1.recherch(j1))
    //suppression d'un jouer qui n'appartiant pas  a la list des jouers
    println(e1.supprimer(j4))
    //suppression d'un jouer qui appartiant a la list des jouers
    println(e1.supprimer(j2))
    e1.setPoint(j1,200)
    println(e1.jouers)
//    println(jouers)

}
