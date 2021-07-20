package com.example.floweria

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.ActionBar

class ViewDetail : AppCompatActivity() {
    companion object {
        const val photo = "photo"
        const val name = "name"
        const val detail = "detail"
        const val genus = "genus"
        const val order = "order"
        const val family = "family"

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.view_detail)

        val photo = intent.getIntExtra(photo, 0)
        val name = intent.getStringExtra(name)
        val detail = intent.getStringExtra(detail)
        val genus = intent.getStringExtra(genus)
        val order = intent.getStringExtra(order)
        val family = intent.getStringExtra(family)

        val imgPhoto: ImageView = findViewById(R.id.img_item_photo)
        val tvName: TextView = findViewById(R.id.tv_item_name)
        val tvDetail: TextView = findViewById(R.id.tv_item_detail)
        val tvGenus: TextView = findViewById(R.id.tv_item_genus)
        val tvOrder: TextView = findViewById(R.id.tv_item_order)
        val tvFamily: TextView = findViewById(R.id.tv_item_family)

        imgPhoto.setImageResource(photo)
        tvName.text = name
        tvDetail.text = detail
        tvGenus.text = genus
        tvOrder.text = order
        tvFamily.text = family

        val actionBar : ActionBar? = supportActionBar
        actionBar!!.setDisplayHomeAsUpEnabled(true)
        actionBar.setDisplayShowHomeEnabled(true)

        actionBar.title = name
    }
}