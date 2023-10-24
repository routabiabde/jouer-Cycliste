package com.example.baketball_kotlin.Basketball

import android.text.BoringLayout

class Equip(
    var paye:Pays,
    var jouers: MutableList<jouer> = mutableListOf()
) {
   fun ajouter(j:jouer):Boolean{
       if (!jouers.contains(j)){
           jouers.add(j)
           return true
       }
       return false
   }
    fun recherch(j:jouer):Int{
         for (i in 0..jouers.size-1){
             if (jouers[i].nom == j.nom){
                 return i
                 continue
             }

         }
        return -1

    }
    fun supprimer(j:jouer):Boolean{
        var index = recherch(j)
        when(recherch(j)){
            -1 -> return false
            else -> {jouers.removeAt(index)
             return true
            }
        }
    }

    fun  setPoint(j:jouer,pnts:Int):Boolean{
        var index = recherch(j)
        when(recherch(j)){
            -1 -> return false
            else -> { jouers[index].nbrPointCompit = pnts
                return true
            }
        }
    }

}

