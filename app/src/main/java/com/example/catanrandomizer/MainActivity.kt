package com.example.catanrandomizer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun getBoard() : String {
        var board: String = ""
        // catan board is 3, 4, 5, 4, 3 rows top to bottom
        var row1 = arrayOf(0, 0, 0)
        var row2 = arrayOf(0, 0, 0, 0)
        var row3 = arrayOf(0, 0, 0, 0, 0)
        var row4 = arrayOf(0, 0, 0, 0)
        var row5 = arrayOf(0, 0, 0)

        var rows = arrayOf(row1, row2, row3, row4, row5)

        var values = arrayOf(2,3,3,4,4,5,5,6,6,8,8,9,9,10,10,11,11,12)

        println("Board: $rows")

        return board
    }
}