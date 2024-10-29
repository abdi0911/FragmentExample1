package com.example.fragmentexample1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragmentexample1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), Coordinator {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onBookChanged(index: Int) {
        val fragment = supportFragmentManager.findFragmentById(R.id.fragment_book_description)
        if (fragment is BookDescription) {
            fragment.changeDescription(index)
        }
    }
}
