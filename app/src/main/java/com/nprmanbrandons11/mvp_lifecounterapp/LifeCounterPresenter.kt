package com.nprmanbrandons11.mvp_lifecounterapp

class LifeCounterPresenter(view:LifeCounter.View): LifeCounter.Presenter {
    var view : LifeCounter.View
    var model : LifeCounter.Model

    init {
        this.view = view
        this.model = LifeCounterModel(this)
    }

    override fun changeLife(life:String,player: Boolean) {
        if (player) view.changeLife(life,true)
        else  view.changeLife(life,false)

    }

    override fun incLife(life: String,player:Boolean) {
        model.incLife(life,player)
    }

    override fun decLife(life: String, player: Boolean) {
        model.decLife(life,player)
    }

}