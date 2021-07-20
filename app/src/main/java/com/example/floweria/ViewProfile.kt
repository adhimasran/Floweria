package com.example.floweria

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar

class ViewProfile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.view_profile)

        val actionBar : ActionBar? = supportActionBar
        actionBar!!.setDisplayHomeAsUpEnabled(true)
        actionBar.setDisplayShowHomeEnabled(true)
        actionBar.title = "Profile"
    }
}