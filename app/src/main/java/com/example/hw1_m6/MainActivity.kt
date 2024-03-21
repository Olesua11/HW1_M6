package com.example.hw1_m6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.hw1_m6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val viewModel: CounterViewModel by lazy{
        ViewModelProvider(this)[CounterViewModel::class.java]
    }
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        with(binding){
            btnPlus.setOnClickListener {
                viewModel.inc()
            }
            btnMinus.setOnClickListener {
                viewModel.dec()
            }
            viewModel.publicList.observe(this@MainActivity){
                tvResult.text = it.toString()
            }
        }
    }
}