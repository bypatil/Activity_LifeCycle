package com.example.activity_lifecycle

import android.content.Intent
import android.os.Bundle
import android.util.Log
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

        //Toast.makeText(this,"onCreate Called",Toast.LENGTH_SHORT).show()
        Log.d("ActivityA","onCreate Called")

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener{
            val intent = Intent(this,ActivityB::class.java)
            startActivity(intent)

        }
    }

    override fun onStart() {
        super.onStart()
        //Toast.makeText(this,"onStart Called",Toast.LENGTH_SHORT).show()
        Log.d("ActivityA","onStart Called")
    }

    override fun onResume() {
        super.onResume()
        //Toast.makeText(this,"onResume Called",Toast.LENGTH_SHORT).show()
        Log.d("ActivityA","onResume Called")
    }

    override fun onPause() {
        super.onPause()
        //Toast.makeText(this,"onPause Called",Toast.LENGTH_SHORT).show()
        Log.d("ActivityA","onPause Called")
    }

    override fun onStop() {
        super.onStop()
        //Toast.makeText(this,"onStop Called",Toast.LENGTH_SHORT).show()
        Log.d("ActivityA","onStop Called")
    }

    override fun onRestart() {
        super.onRestart()
        //Toast.makeText(this,"onRestart Called",Toast.LENGTH_SHORT).show()
        Log.d("ActivityA","onRestart Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        //Toast.makeText(this,"onDestroy Called",Toast.LENGTH_SHORT).show()
        Log.d("ActivityA","onDestroy Called")
    }
}

open class AppCompatActivity {

}
