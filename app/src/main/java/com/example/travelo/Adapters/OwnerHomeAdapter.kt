package com.example.travelo.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.travelo.Models.OwnerTestModel
import com.example.travelo.R

class OwnerHomeAdapter(val context: Context, val dataList :ArrayList<OwnerTestModel>): RecyclerView.Adapter<OwnerHomeAdapter.OwnerViewHolder>() {

    class OwnerViewHolder( val itemView: View):RecyclerView.ViewHolder(itemView) {
         val bus_name:TextView=itemView.findViewById(R.id.bus_name)
        val placeFrom : TextView=itemView.findViewById(R.id.place_from)
        val placeTo : TextView=itemView.findViewById(R.id.place_to)
        val date : TextView=itemView.findViewById(R.id.date)
        val imgDot:ImageView=itemView.findViewById(R.id.three_dots)
        val textTo:TextView=itemView.findViewById(R.id.text_to)
        val textFrom:TextView=itemView.findViewById(R.id.text_from)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OwnerViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.owner_home_recycler_item,parent,false)
        return OwnerViewHolder(view)
    }

    override fun onBindViewHolder(holder: OwnerViewHolder, position: Int) {
        holder.bus_name.text=dataList[position].bus_name
        holder.imgDot.setImageResource(dataList[position].imgDot)
        holder.textFrom.text=dataList[position].textFrom
        holder.placeFrom.text=dataList[position].placeFrom
        holder.textTo.text=dataList[position].textTo
        holder.placeTo.text=dataList[position].placeTo
        holder.date.text=dataList[position].date

    }

    override fun getItemCount(): Int {
     return dataList.size
    }
}