package com.example.imagedownloader

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import coil.api.load
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onDownloadButtonClick(view:View) {
        val image = findViewById<ImageView>(R.id.downloadedImage)
        val imageSeed = Random.nextInt(1050).toString()

        val url = "https://i.picsum.photos/id/${imageSeed}/1000/1000.jpg"
        Toast.makeText(applicationContext, url, Toast.LENGTH_SHORT).show()

        image.load(url)
    }
}
