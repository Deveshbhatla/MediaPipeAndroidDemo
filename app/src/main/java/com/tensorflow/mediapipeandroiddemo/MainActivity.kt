package com.tensorflow.mediapipeandroiddemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.tensorflow.mediapipeandroiddemo.Fragments.AboutFragment
import com.tensorflow.mediapipeandroiddemo.Fragments.AudioFragment
import com.tensorflow.mediapipeandroiddemo.Fragments.TextFragment
import com.tensorflow.mediapipeandroiddemo.Fragments.VisionFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bottomNav = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomNav.setOnNavigationItemSelectedListener(navListener)


        //I added this if statement to keep the selected fragment when rotating the device
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction().replace(
                R.id.fragment_container,
                VisionFragment()
            ).commit()
            bottomNav.selectedItemId = R.id.navigation_vision

        }
    }
     val navListener =
        BottomNavigationView.OnNavigationItemSelectedListener { item ->
            var selectedFragment: Fragment? = null
            when (item.itemId) {
                R.id.navigation_vision -> selectedFragment = VisionFragment()
                R.id.navigation_text -> selectedFragment = TextFragment()
                R.id.navigation_audio -> selectedFragment = AudioFragment()
                R.id.navigation_about -> selectedFragment = AboutFragment()
            }
            assert(selectedFragment != null)
            supportFragmentManager.beginTransaction().replace(
                R.id.fragment_container,
                selectedFragment!!
            ).commit()
            true
        }
}