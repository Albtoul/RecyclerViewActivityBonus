package com.example.recyclerviewactivitybonus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    lateinit var ed1:EditText
    lateinit var ed2:EditText
    lateinit var ed3:EditText
    lateinit var ed4:EditText
    lateinit var bt:Button
    private lateinit var messages: ArrayList<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ed1=findViewById(R.id.fname)
        ed2=findViewById(R.id.sname)
        ed3=findViewById(R.id.tname)
        ed4=findViewById(R.id.lname)
        bt=findViewById(R.id.button)
        messages= arrayListOf()
        bt.setOnClickListener {
            var b = Intent(this, MainActivity2::class.java)
            messages.add(ed1.text.toString())
            messages.add(ed2.text.toString())
            messages.add(ed3.text.toString())
            messages.add(ed4.text.toString())
            b.putExtra("data",messages)
            startActivity(b)

        }
    }
}