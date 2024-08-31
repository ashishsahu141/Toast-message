package com.ashish.toastmessage

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val buttonUpload=findViewById<Button>(R.id.btnUpload)
        val buttonDownload =findViewById<Button>(R.id.btnDownload)

        buttonUpload.setOnClickListener {
            Toast.makeText(applicationContext,"uploading....",Toast.LENGTH_SHORT).show()
        }
        buttonDownload.setOnClickListener{
            Toast.makeText(applicationContext,"Downloading...",Toast.LENGTH_SHORT).show()
            }

            }
        }
