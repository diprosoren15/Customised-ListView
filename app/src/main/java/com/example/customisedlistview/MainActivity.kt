package com.example.customisedlistview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity(){
    lateinit var userinfoarraylist : ArrayList<User>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val name = arrayOf("Dipro", "Mahesh", "Shiv")
        val lastmsg = arrayOf("How you doin", "good", "Well done")
        val lastmsgtime = arrayOf("9:37 pm", "10:25 am", "6:53 am")
        val imgid = intArrayOf(R.drawable.whatsappdp, R.drawable.pic0, R.drawable.pic1)
        val phnnmbr = arrayOf("7586553221", "9146546154", "7564835445")

        userinfoarraylist = ArrayList()

        for (eachIndex in name.indices) {
            val userinfo = User(name[eachIndex], lastmsg[eachIndex], lastmsgtime[eachIndex], imgid[eachIndex])
            userinfoarraylist.add(userinfo)
        }

        val listview = findViewById<ListView>(R.id.customlistview)
        listview.isClickable = true
        listview.adapter = MyAdapter(this, userinfoarraylist)
        
        listview.setOnItemClickListener { adapterView, view, i, l ->

            val Name = name[i]
            val phone = phnnmbr[i]
            val image = imgid[i]

            val intent = Intent(this, ContactDetailsActivity::class.java)
            intent.putExtra("name", Name)
            intent.putExtra("phonekey", phone)
            intent.putExtra("imgkey", image)
            startActivity(intent)
        }
    }
}