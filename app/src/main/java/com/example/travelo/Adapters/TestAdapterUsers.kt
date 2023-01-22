package com.example.travelo.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.travelo.Models.TestModel
import com.example.travelo.R

class TestAdapterUsers(var context: Context,var list :ArrayList<TestModel>):RecyclerView.Adapter<TestAdapterUsers.MyViewHolder>() {

     class MyViewHolder(view: View) : RecyclerView.ViewHolder(view){

        var bus_name: TextView = itemView.findViewById(R.id.bus_name)
        var initail_time:TextView = itemView.findViewById(R.id.initial_time)
        var destination_time:TextView = itemView.findViewById(R.id.destination_time)
        var category :TextView = itemView.findViewById(R.id.bus_type)
        var initial_location:TextView = itemView.findViewById(R.id.initial_location)
        var destination_location:TextView = itemView.findViewById(R.id.destination_location)
        var route_cost:TextView = itemView.findViewById(R.id.route_cost)
        var route_distance:TextView = itemView.findViewById(R.id.route_distance)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
    val view = LayoutInflater.from(context).inflate(R.layout.user_home_recycleer_item,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val userData = list[position]
        holder.bus_name.text = userData.bus_name
        holder.route_cost.text = userData.route_cost
        holder.initail_time.text = userData.initail_time
        holder.destination_time.text= userData.destination_time
        holder.initial_location.text = userData.initial_location
        holder.destination_location.text = userData.destination_location
        holder.category.text = userData.category
        holder.route_distance.text = userData.route_distance

    }

    override fun getItemCount(): Int {
        return  list.size
    }
}