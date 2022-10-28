package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.DrawableRes
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val  emercencies= arrayListOf<Emercency>()
        emercencies.add(Emercency(R.drawable.child,getString(R.string.child),"16000"))
        emercencies.add(Emercency(R.drawable.blod,getString(R.string.blod),"0643103837"))
        emercencies.add(Emercency(R.drawable.fire,getString(R.string.fire),"180"))
        emercencies.add(Emercency(R.drawable.help,getString(R.string.help),"16525"))
        emercencies.add(Emercency(R.drawable.ic_police,getString(R.string.police),"122"))
        emercencies.add(Emercency(R.drawable.medical,getString(R.string.medical),"123"))
        emercencies.add(Emercency(R.drawable.boat,getString(R.string.marine),"112"))
        emercencies.add(Emercency(R.drawable.land,getString(R.string.flight),"999"))



        val adapter=help_adaptor(this,emercencies)
        val rv:RecyclerView=findViewById(R.id.rv)
        rv.adapter=adapter


    }

    override fun onBackPressed() {
        val exit=Exitdialog()
        exit.isCancelable=false
        exit.show(supportFragmentManager,null)

    }
}