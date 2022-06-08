package com.example.calculadora

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.calculadora.databinding.ActivityMainBinding

class MainActivity : Activity() {

private lateinit var binding: ActivityMainBinding
    var n1:Double = 0.0
    var n2:Double = 0.0
    var operation:String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

     binding = ActivityMainBinding.inflate(layoutInflater)
     setContentView(binding.root)

        //specials
        val btnEqual:Button = binding.equal

        val btnReset:Button = binding.reset
        btnReset.setOnClickListener{
            binding.memory.text = "0"
        }



    }
    fun operators(view:View){
        when(view.id){
            R.id.add -> operation ="add"
            R.id.minus -> operation = "minus"
            R.id.divider -> operation = "divider"
            R.id.multiplier -> operation = "multiplier"
        }
    }
    fun numbers(view: View){
        var currentMemory:String = binding.memory.text.toString()
        when(view.id){
            R.id.number0 -> binding.memory.text = currentMemory+"0"
            R.id.number1 -> binding.memory.text = currentMemory+"1"
            R.id.number2 -> binding.memory.text = currentMemory+"2"
            R.id.number3 -> binding.memory.text = currentMemory+"3"
            R.id.number4 -> binding.memory.text = currentMemory+"4"
            R.id.number5 -> binding.memory.text = currentMemory+"5"
            R.id.number6 -> binding.memory.text = currentMemory+"6"
            R.id.number7 -> binding.memory.text = currentMemory+"7"
            R.id.number8 -> binding.memory.text = currentMemory+"8"
            R.id.number9 -> binding.memory.text = currentMemory+"9"

        }
    }

}