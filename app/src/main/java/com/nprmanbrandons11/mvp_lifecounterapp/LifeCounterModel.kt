package com.nprmanbrandons11.mvp_lifecounterapp

class LifeCounterModel(presenter: LifeCounterPresenter) : LifeCounter.Model {

   var presenter:LifeCounter.Presenter

   init {
       this.presenter = presenter
   }

    override fun incLife(life:String,player:Boolean) {
         val newLife = life.toInt() + 1
        presenter.changeLife(newLife.toString(),player)
    }

    override fun decLife(life: String, player: Boolean) {
        val newLife = life.toInt() - 1
        presenter.changeLife(newLife.toString(),player)
    }
}