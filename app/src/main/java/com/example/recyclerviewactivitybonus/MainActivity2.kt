package com.example.recyclerviewactivitybonus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity2 : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
       val messages = intent.extras?.getStringArrayList("data")
        recyclerView = findViewById(R.id.RV)
        recyclerView.adapter = MessageAdapter(this, messages)
        recyclerView.layoutManager = LinearLayoutManager(this)



    }
}