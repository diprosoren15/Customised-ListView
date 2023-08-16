package com.example.customisedlistview

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class MyAdapter (val context : Activity, val arraylist : ArrayList<User>) :
    ArrayAdapter<User>(context, R.layout.listviewitems, arraylist){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.listviewitems, null)

        val img = view.findViewById<CircleImageView>(R.id.profile_image)
        val name = view.findViewById<TextView>(R.id.nametv)
        val lastmsg = view.findViewById<TextView>(R.id.lastmsgtv)
        val time = view.findViewById<TextView>(R.id.timetv)

        img.setImageResource(arraylist[position].imgid)
        name.text = arraylist[position].Name
        lastmsg.text = arraylist[position].LastMessage
        time.text = arraylist[position].LastMsgTime

        return view
    }
}