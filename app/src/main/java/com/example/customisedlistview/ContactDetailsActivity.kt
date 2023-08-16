package com.example.customisedlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.customisedlistview.databinding.ActivityContactDetailsBinding

class ContactDetailsActivity : AppCompatActivity() {
    lateinit var view : ActivityContactDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        view = ActivityContactDetailsBinding.inflate(layoutInflater)
        setContentView(view.root)


        val name = intent.getStringExtra("name")
        val phone = intent.getStringExtra("phonekey")
        val img = intent.getIntExtra("imgkey", R.drawable.ic_launcher_foreground)

        view.profileImage.setImageResource(img)
        view.phonenotv.text = phone
        view.nameTV.text = name

    }
}