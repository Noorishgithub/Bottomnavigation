package com.example.bottomnavigation

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog

class Alertdialog : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alertdialog)





            val builder= AlertDialog.Builder(this)
            builder.setTitle("Are you sure!")
            builder.setMessage("Do you want to close the app")

            builder.setPositiveButton("yes",{ dialogInterface: DialogInterface, i: Int ->

                finish()
            })
            builder.setNegativeButton("No",{ dialogInterface: DialogInterface, i: Int ->

            })
            builder.show()
    }
}