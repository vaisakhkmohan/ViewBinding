package com.vaisakh.hustler.viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vaisakh.hustler.viewbinding.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

       // binding.name

    }
}