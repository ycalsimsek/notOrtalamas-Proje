package com.umit.notortalamas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.umit.notortalamas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonHesapla.setOnClickListener {
            if (binding.editTextNumber1.text.isNotEmpty()&&binding.editTextNumber2.text.isNotEmpty()){
                var sinav1 = binding.editTextNumber1.text.toString().toInt()
                var sinav2 = binding.editTextNumber2.text.toString().toInt()
                var ortalama:Double = (sinav1+sinav2)/2.toDouble()
                if (ortalama>=50){
                    binding.SonuText.text = ortalama.toString()+" "+"Geçti."
                    binding.SonuText.setTextColor(getColor(R.color.green))
                }else
                {binding.SonuText.text = ortalama.toString()+" "+"Kaldı."
                binding.SonuText.setTextColor(getColor(R.color.green))
            }

                }else{
                binding.SonuText.text = "Sınav Notunuzu Giriniz."
            binding.SonuText.setTextColor(getColor(R.color.red))

        }

            }

    }
}