package com.example.nurfarazi.listviewtest.listviewtest

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class CustomAdapter(val userList: ArrayList<User>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    override fun onBindViewHolder(p0: CustomAdapter.ViewHolder, p1: Int) {
        val user : User = userList[p1]
        p0?.textViewName?.text = user.name
        p0?.textViewAddress?.text = user.address
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): CustomAdapter.ViewHolder {
        val v = LayoutInflater.from(p0?.context).inflate(R.layout.list_layout,p0,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val textViewName = itemView.findViewById(R.id.textViewName) as TextView
        val textViewAddress = itemView.findViewById(R.id.textViewAddress) as TextView
    }
}
