package com.example.exercicio2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.text.isDigitsOnly
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.exercicio2.adapter.MainAdapter
import com.example.exercicio2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var binding: ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding?.root)

        binding?.btnItem?.setOnClickListener {
            val input = binding?.etItem?.text
            val splitedInput = input?.split(" ")
            val numbers = ArrayList<String>()
            binding?.tvItem?.text = input
            splitedInput?.forEach {
                if(it.isDigitsOnly()) numbers.add(it)
            }

            binding?.rvMain?.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
            binding?.rvMain?.adapter = MainAdapter(numbers)


        }


    }
}