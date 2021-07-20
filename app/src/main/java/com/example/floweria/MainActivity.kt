package com.example.floweria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
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
        val cardViewFlower = CardViewFlower(list, this)
        rvFlowers.adapter = cardViewFlower
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_action_bar, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean =
        when (item.itemId) {
            R.id.action_about -> {
                val intent = Intent(this, ViewProfile::class.java)
                startActivity(intent)
                true
            }
            else -> {
                super.onOptionsItemSelected(item)
            }
        }
}