package com.alom.androidstudy2

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.alom.androidstudy2.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val addPostIntent = Intent(this, AddPostActivity::class.java)

        binding.tvAddPost.setOnClickListener {
            startActivity(addPostIntent)
            finish()
        }


        RetrofitClient.instance.getItems(api = BuildConfig.apiKey)
            .enqueue(object : Callback<PostData> {
                override fun onResponse(call: Call<PostData>, response: Response<PostData>) {
                    if (response.isSuccessful) {
                        binding.rcvMarket.adapter = MarketAdapter(response.body()!!.data)
                        binding.rcvMarket.layoutManager = LinearLayoutManager(
                            this@MainActivity,
                            LinearLayoutManager.VERTICAL,
                            false
                        )
                    } else {
                        Toast.makeText(this@MainActivity, "internet error", Toast.LENGTH_SHORT)
                            .show()
                    }
                }

                override fun onFailure(call: Call<PostData>, t: Throwable) {
                    Toast.makeText(this@MainActivity, "internet error", Toast.LENGTH_SHORT).show()
                }

            })


    }
}