package com.ericg.monsta

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ericg.monsta.databinding.SplashScreenBinding

class SplashScreen : AppCompatActivity() {
    private var _binding: SplashScreenBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        _binding = SplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}