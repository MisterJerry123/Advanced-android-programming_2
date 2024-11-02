package com.alom.androidstudy2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.alom.androidstudy2.databinding.ActivityAddPostBinding

class AddPostActivity:AppCompatActivity() {
    lateinit var binding : ActivityAddPostBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityAddPostBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val backIntent = Intent(this, MainActivity::class.java)
        binding.tvBack.setOnClickListener {
            startActivity(backIntent)
            finish()
        }
    }


}