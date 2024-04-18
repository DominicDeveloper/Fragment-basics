package com.asadbek.fragmentbasics

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var btn:Button
    lateinit var replace:Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn = findViewById(R.id.btnGet)

        replace = findViewById(R.id.btnReplace)


        val firstFragment = FirstFragment()
        val finalFragment = FinalFragment()
        val fragmentManager = supportFragmentManager
        val transaction = fragmentManager.beginTransaction()

        btn.setOnClickListener {
            transaction.add(R.id.container,firstFragment)
            transaction.commit()
            btn.visibility = View.INVISIBLE
            replace.visibility = View.VISIBLE
        }

        replace.setOnClickListener {
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.container,finalFragment)
            transaction.commit()
            //transaction.replace(R.id.container,finalFragment)

        }
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onBackPressed() {
        super.onBackPressed()

    }
}