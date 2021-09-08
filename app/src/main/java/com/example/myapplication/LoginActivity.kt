package com.example.management

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.myapplication.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val registerNumber = findViewById<TextView>(R.id.Reg_no)

        login.setOnClickListener {

                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)

            }








    }
}
