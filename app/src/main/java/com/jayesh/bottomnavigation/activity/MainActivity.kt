package com.jayesh.bottomnavigation.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jayesh.bottomnavigation.R
import com.jayesh.bottomnavigation.fragments.AboutFragment
import com.jayesh.bottomnavigation.fragments.HomeFragment
import com.jayesh.bottomnavigation.fragments.SearchFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigationView.background = null

        fabSearch.setOnClickListener {
            //Toast.makeText(this, "Search clicked!", Toast.LENGTH_SHORT).show()
            supportFragmentManager.beginTransaction()
                .replace(R.id.frameLayout, SearchFragment())
                .commit()

        }

        bottomNavigationView.setOnItemSelectedListener { item ->

            when (item.itemId) {
                R.id.itmHome -> {
                    //Toast.makeText(this, "Home Selected!", Toast.LENGTH_SHORT).show()
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.frameLayout, HomeFragment())
                        .commit()
                    true
                }

                R.id.itmAbout -> {
                    //Toast.makeText(this, "About Selected!", Toast.LENGTH_SHORT).show()
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.frameLayout, AboutFragment())
                        .commit()
                    true
                }
                else -> false
            }
        }
    }

}