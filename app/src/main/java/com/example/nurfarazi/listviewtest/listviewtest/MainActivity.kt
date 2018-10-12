package com.example.nurfarazi.listviewtest.listviewtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)

        val users = ArrayList<User>()

        users.add(User("farazi", "dhaka", "12312312"))
        users.add(User("farazi", "dhaka", "12312312"))
        users.add(User("farazi", "dhaka", "12312312"))
        users.add(User("farazi", "dhaka", "12312312"))
        users.add(User("farazi", "dhaka", "12312312"))

        recyclerView.adapter = CustomAdapter(users)
    }
}
