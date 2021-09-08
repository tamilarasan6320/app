 package com.example.management


import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_mark.*
import kotlinx.android.synthetic.main.layout_filter.*


class MarkActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mark)


        Internal.setOnClickListener {
            val intent = Intent(this, Internal_markActivity::class.java)
            startActivity(intent)
        }


        External.setOnClickListener {
            showFilterDialog()
        }
    }


    private fun showFilterDialog() {
        val builder = AlertDialog.Builder(this)
        //set title for alert dialog
        val inflater = this.layoutInflater
        builder.setView(R.layout.layout_filter)

        builder.setPositiveButton("Yes") { dialogInterface, which ->
            val intent = Intent(this, External_markActivity::class.java)
            startActivity(intent)
        }
        builder.setNegativeButton("No") { dialogInterface, which ->
            Toast.makeText(applicationContext, "clicked No", Toast.LENGTH_LONG).show()
        }


        builder.show()
    }
}



