package com.nprmanbrandons11.mvp_lifecounterapp

interface LifeCounter {
    interface View{
        fun changeLife(result:String,player:Boolean)
    }
    interface Presenter{
        fun changeLife(result:String,player: Boolean)
        fun incLife(life:String,player: Boolean)
        fun decLife(life:String,player: Boolean)
    }
    interface Model{
        fun incLife(life:String,player: Boolean)
        fun decLife(life:String,player: Boolean)
    }
}