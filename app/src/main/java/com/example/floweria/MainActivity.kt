package com.example.floweria

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvFlowers: RecyclerView
    private var list: ArrayList<Flower> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvFlowers = findViewById(R.id.rv_flowers)
        rvFlowers.setHasFixedSize(true)

        list.addAll(FlowersData.listData)
        showRecyclerCardView()
    }

    private fun showRecyclerCardView() {
        rvFlowers.layoutManager = LinearLayoutManager(this)
        val cardViewFlower = CardViewFlower(list)
        rvFlowers.adapter = cardViewFlower
    }
}