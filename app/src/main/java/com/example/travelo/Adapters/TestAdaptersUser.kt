package com.example.travelo.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.travelo.R

class TestAdaptersUser(val context: Context,val data: ArrayList<TestAdaptersUser>):RecyclerView.Adapter<TestAdaptersUser.MyViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view= LayoutInflater.from(context).inflate(R.layout.user_home_recycleer_item,parent,false)
        return  MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
//        holder.title.text =data.title
//        holder.notes.text = data.notes
//        holder.dateTime.text = data.date_time

        val userData = data[position]


        //onClickListener For parent touch


    }

    override fun getItemCount(): Int {
       return  data.size
    }


    inner  class  MyViewHolder(itemView:View): RecyclerView.ViewHolder(itemView){
        // var title:TextView


        var bus_name:TextureView
        var initail_time:TextureView
        var destination_time:TextureView
        var category :TextureView
        var initial_location:TextureView
        var destination_location:TextureView
        var route_cost:TextureView
        var route_distance:TextureView

        init {
          bus_name = itemView.findViewById(R.id.bus_name)
            initail_time= itemView.findViewById(R.id.initial_time)
            destination_time = itemView.findViewById(R.id.destination_time)
            category = itemView.findViewById(R.id.bus_type)
            initial_location= itemView.findViewById(R.id.initial_location)
            destination_location= itemView.findViewById(R.id.destination_location)
            route_cost = itemView.findViewById(R.id.route_cost)
            route_distance= itemView.findViewById(R.id.route_distance)

        }

     }



}