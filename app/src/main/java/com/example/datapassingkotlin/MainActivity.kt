package com.example.datapassingkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nameEt=findViewById<EditText>(R.id.name);
        val emailEt=findViewById<EditText>(R.id.email);
        val phoneEt=findViewById<EditText>(R.id.phone);
        val addressEt=findViewById<EditText>(R.id.address);
        val usernameEt=findViewById<EditText>(R.id.username);
        val passwordEt=findViewById<EditText>(R.id.password);
        val saveBtn=findViewById<Button>(R.id.save);

        saveBtn.setOnClickListener()
        {
            val name=nameEt.text.toString()
            val email=emailEt.text.toString()
            val phone=phoneEt.text.toString()
            val address=addressEt.text.toString()
            val username=usernameEt.text.toString()
            val password=passwordEt.text.toString()

            val intent=Intent(this@MainActivity,FirstActivity::class.java)
            intent.putExtra("Name",name)
            intent.putExtra("Email",email)
            intent.putExtra("Phone",phone)
            intent.putExtra("Address",address)
            intent.putExtra("Username",username)
            intent.putExtra("Password",password)

            startActivity(intent)

        }

    }
}