package com.jayesh.bottomnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.core.view.GravityCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigationView.background = null

        fabSearch.setOnClickListener {
            Toast.makeText(this, "Search clicked!", Toast.LENGTH_SHORT).show()
        }

        bottomNavigationView.setOnItemSelectedListener { item ->

            when (item.itemId) {
                R.id.itmHome -> {
                    Toast.makeText(this, "Home Selected!", Toast.LENGTH_SHORT).show()
                    true
                }

                R.id.itmAbout -> {
                    Toast.makeText(this, "About Selected!", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
            }
        }
    }

}