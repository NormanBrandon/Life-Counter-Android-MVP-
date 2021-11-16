package com.nprmanbrandons11.mvp_lifecounterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nprmanbrandons11.mvp_lifecounterapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),LifeCounter.View {
    lateinit var binding : ActivityMainBinding
    lateinit var presenter: LifeCounter.Presenter
    lateinit var life:String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root

        setContentView(view)
        presenter =LifeCounterPresenter(this)
        binding.btnPlus2.setOnClickListener{
            life = binding.tvLifeNormal.text.toString()
            presenter.incLife(life,true)
        }
        binding.btnPlus.setOnClickListener {
            life = binding.tvLifeRotate.text.toString()
            presenter.incLife(life,false)
        }
        binding.btnMinus2.setOnClickListener{
            life = binding.tvLifeNormal.text.toString()
            presenter.decLife(life,true)
        }
        binding.btnMinus.setOnClickListener {
            life = binding.tvLifeRotate.text.toString()
            presenter.decLife(life,false)
        }
    }

    override fun changeLife(life:String,player:Boolean) {
        if (player) binding.tvLifeNormal.text = life
        else binding.tvLifeRotate.text = life

    }
}