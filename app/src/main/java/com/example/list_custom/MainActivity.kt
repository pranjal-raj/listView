package com.example.list_custom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val listview = findViewById<ListView>(R.id.list)
        val names = arrayOf("Kachra","Zimbabar","Rohit","Dhoni","Virat","ABD","Ronaldo","Bale").asList()
        val loc = arrayOf("Heaven", "Pakistan", "India", "India", "India", "SA", "Portugal", "Spain").asList()

        val playerlist = ArrayList<Player>()
        for(i in 0..7)
        {
            val player : Player = Player(names[i], loc[i])
            playerlist.add(player)
        }

        val myadapter : Adapter = Adapter(this, playerlist)
        listview.adapter = myadapter

    }
}