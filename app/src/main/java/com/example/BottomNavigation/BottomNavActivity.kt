package com.example.BottomNavigation

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.recyclerview.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class BottomNavActivity : AppCompatActivity() {

    private lateinit var bottomNavigationView: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_nav)

        bottomNavigationView = findViewById(R.id.bottom_navigation)


        bottomNavigationView.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.bottom_home -> {
                    replaceFragment(HomeFragment())
                    true
                }

                R.id.bottom_search -> {
                    replaceFragment(SearchFragment())
                    true
                }

                R.id.bottom_add -> {
                    Toast.makeText(this, "Upload Something", Toast.LENGTH_SHORT).show()
                    true
                }

                R.id.bottom_profile -> {
                    replaceFragment(ProfileFragment())
                    true

                }

                R.id.bottom_reels ->{
                    replaceFragment(ReelsFragment())
                    true
                }

                else -> false // Handle any other cases if needed
            }
        }

        replaceFragment(HomeFragment())

    }

    private fun replaceFragment(fragment: Fragment) {

        supportFragmentManager.beginTransaction().replace(R.id.frame_container, fragment).commit()
    }


}