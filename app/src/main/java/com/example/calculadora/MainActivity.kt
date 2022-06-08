package com.example.calculadora

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import com.example.calculadora.databinding.ActivityMainBinding

class MainActivity : Activity() {

private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

     binding = ActivityMainBinding.inflate(layoutInflater)
     setContentView(binding.root)
        //operators
        val btnAdd:Button = binding.add
        val btnMinus:Button = binding.minus
        val btnMultiplier:Button = binding.multiplier
        val btnDivider:Button = binding.divider

        //specials
        val btnEqual:Button = binding.equal
        val btnReset:Button = binding.reset

        //numbers
        val number0:Button = binding.number0
        val number1:Button = binding.number1
        val number2:Button = binding.number2
        val number3:Button = binding.number3
        val number4:Button = binding.number4
        val number5:Button = binding.number5
        val number6:Button = binding.number6
        val number7:Button = binding.number7
        val number8:Button = binding.number8
        val number9:Button = binding.number9

    }
}