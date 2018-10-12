package com.example.nurfarazi.listviewtest.listviewtest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)

        val users = ArrayList<User>()

        users.add(User("farazi", "dhaka", "12312312"))
        users.add(User("farazi", "dhaka", "12312312"))
        users.add(User("farazi", "dhaka", "12312312"))
        users.add(User("farazi", "dhaka", "12312312"))
        users.add(User("farazi", "dhaka", "12312312"))

        recyclerView.adapter = CustomAdapter(users)
    }
}
