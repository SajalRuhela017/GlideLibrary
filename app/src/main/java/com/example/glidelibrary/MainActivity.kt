package com.example.glidelibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.example.glidelibrary.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn.setOnClickListener{
            val URL = "https://picsum.photos/300"
            Glide.with(this).load(URL).fitCenter().skipMemoryCache(true)
                .diskCacheStrategy(DiskCacheStrategy.NONE).placeholder(R.drawable.noimg)
                .into(binding.img)
        }
    }
}