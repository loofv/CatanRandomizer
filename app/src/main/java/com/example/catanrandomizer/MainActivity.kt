package com.example.catanrandomizer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boardTextView = findViewById<TextView>(R.id.tvBoardList)
        val btn = findViewById<Button>(R.id.btnGenerateBoard)
        btn.setOnClickListener {
            getBoard()
        }
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

        Toast.makeText(this, "Board posted in println", Toast.LENGTH_LONG).show()
        printBoard(rows)

        return board
    }

    private fun printBoard(boards: Array<Array<Int>>) {
        var boardCount = 0
        for (board in boards) {
            print("board: ${boardCount.toString()}")
            boardCount++
            for (shape in board) {
                print(shape.toString())
            }
        }
    }
}