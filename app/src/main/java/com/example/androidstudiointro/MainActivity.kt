package com.example.androidstudiointro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    //    val resultTextView: TextView = findViewById(R.id.RandomDiceDisplay)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            rollDice()
        }
        Log.d("!!!", "Nu körs onCreate!")
    }

    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val resultTextView: TextView = findViewById(R.id.RandomDiceDisplay)
        resultTextView.text = diceRoll.toString()
    }


}

class Dice(val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }


}