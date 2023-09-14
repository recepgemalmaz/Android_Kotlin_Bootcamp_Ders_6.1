package com.recepgemalmaz.calismayapisi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.recepgemalmaz.calismayapisi.databinding.ActivityDetayBinding

class DetayActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetayBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetayBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //binding.textViewBilgi.text = "Detay Sayfa"
        val gelenAd = intent.getStringExtra("ad")
        val gelenYas = intent.getIntExtra("yas", 0)
        val gelenBoy = intent.getDoubleExtra("boy", 0.0)
        val gelenMedeniHal = intent.getBooleanExtra("medeniHal", false)

        binding.textViewBilgi.text = "Ad: $gelenAd\nYaş: $gelenYas\nBoy: $gelenBoy\nMedeni Hal: $gelenMedeniHal"
    }

}