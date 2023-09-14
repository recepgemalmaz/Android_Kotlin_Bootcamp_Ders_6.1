package com.recepgemalmaz.calismayapisi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.recepgemalmaz.calismayapisi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)//inflate: tasarimi kod ile baglama
        setContentView(binding.root)//root: tasarimin en disindaki layout


        binding.buttonDetay.setOnClickListener {
            //binding.textViewAnasayfa.text = "Merhaba"
            val intent = Intent (this@MainActivity, DetayActivity::class.java)
            intent.putExtra("ad", "recep")
            intent.putExtra("yas", 22)
            intent.putExtra("boy", 1.80)
            intent.putExtra("medeniHal", false)
            startActivity(intent)
        }
    }
}