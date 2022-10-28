package com.example.myapplication

import android.app.Activity
import android.content.Intent
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.core.net.toUri
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import java.lang.reflect.Type


class help_adaptor (val activity: Activity, val emercencies:ArrayList<Emercency>):
        RecyclerView.Adapter<help_adaptor.VH>(){
        class VH(view:View): RecyclerView.ViewHolder(view) {
                val parent:CardView=view.findViewById(R.id.parent)
                val iv:ImageView=view.findViewById(R.id.image)
                val text:TextView=view.findViewById(R.id.text)


        }


        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): help_adaptor.VH
        {
                val view=activity.layoutInflater.inflate(R.layout.emergency_list_item,parent,false)
                return VH(view)

        }



        override fun onBindViewHolder(holder:help_adaptor.VH , position: Int) {
                holder.iv.setImageResource(emercencies[position].pic)
                holder.text.text=emercencies[position].name

                holder.parent.setOnClickListener {
                        val i=Intent(Intent.ACTION_DIAL,"tel:${emercencies[position].number} ".toUri())
                        activity.startActivity(i)
                }

        }

        override fun getItemCount()=emercencies.size
}



