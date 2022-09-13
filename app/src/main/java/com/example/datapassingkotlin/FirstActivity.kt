package com.example.datapassingkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)


        val intent=intent
        val name=intent.getStringExtra("Name")
        val email=intent.getStringExtra("Email")
        val phone=intent.getStringExtra("Phone")
        val address=intent.getStringExtra("Address")
        val username=intent.getStringExtra("Username")
        val password=intent.getStringExtra("Password")

        val result=findViewById<TextView>(R.id.result)

        result.text="Name: "+name + "\n Email: " + email + "\n Phone: " +phone+ "\n Address: " +address+
                "\nUsername: "+username+"\nPassword: "+password
    }
}