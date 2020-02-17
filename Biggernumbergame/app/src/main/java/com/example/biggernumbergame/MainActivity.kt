package com.example.biggernumbergame

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import coil.api.load
import java.io.InputStream
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
    var points = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        pickRandomNumbers()
    }

    fun leftButtonOnClick(view: View) {
        val leftButton = findViewById<Button>(R.id.left_button)
        val rightButton = findViewById<Button>(R.id.right_button)
        val leftNum = leftButton.text.toString().toInt()
        val rightNum = rightButton.text.toString().toInt()

        if (leftNum >= rightNum) {
            points++
        }
        else {
            points = 0
        }
        val pointsView = findViewById<TextView>(R.id.Points)
        pointsView.text = "Points: $points"
        pickRandomNumbers()
    }

    fun rightButtonOnClick(view: View) {
        val leftButton = findViewById<Button>(R.id.left_button)
        val rightButton = findViewById<Button>(R.id.right_button)
        val leftNum = leftButton.text.toString().toInt()
        val rightNum = rightButton.text.toString().toInt()

        if (rightNum >= leftNum) {
            points++
        }
        else {
            points = 0
        }
        val pointsView = findViewById<TextView>(R.id.Points)
        pointsView.text = "Points: $points"
        pickRandomNumbers()
    }

    fun downloadButtonOnClick(view: View) {
        val image = findViewById<ImageView>(R.id.netImage)
        val random = Random
        val imageSeed = random.nextInt(1050).toString()
        val url = "https://picsum.photos/" + imageSeed + "/picsum/400/200"
        val toast = Toast.makeText(applicationContext, url, Toast.LENGTH_LONG)
        //toast.show()

        //image.load(url)
        image.load("https://i.ibb.co/TRTpb0N/download.png")
    }

    fun pickRandomNumbers() {
        val leftButton = findViewById<Button>(R.id.left_button)
        val rightButton = findViewById<Button>(R.id.right_button)

        val random = Random
        val num1 = random.nextInt(10)
        val num2 = random.nextInt(10)

        leftButton.text = "$num1"
        rightButton.text = "$num2"

    }
}

