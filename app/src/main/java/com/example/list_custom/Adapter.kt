package com.example.list_custom

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class Adapter(val context : Activity, val arrayList: ArrayList<Player> ) : ArrayAdapter<Player>(context, R.layout.list_item, arrayList) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflater : LayoutInflater = LayoutInflater.from(context)
        val view : View = inflater.inflate(R.layout.list_item,null)

        val name = view.findViewById<TextView>(R.id.name)
        val loc = view.findViewById<TextView>(R.id.loc)

        name.text = arrayList.get(position).name
        loc.text = arrayList.get(position).location

        return view


    }
}