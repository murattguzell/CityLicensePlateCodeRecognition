package com.muratguzel.citypatecoderrcognition

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.muratguzel.citypatecoderrcognition.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }

        binding.findButton.setOnClickListener {
            if (binding.cityPlateCodeText.text.isNotEmpty()) {
                var cityPlateCode = binding.cityPlateCodeText.text.toString().toInt()
                when (cityPlateCode) {
                    35 -> binding.cityText.text = "İzmir"
                    34 -> binding.cityText.text = "İstanbul"
                    31 -> binding.cityText.text = "Hatay"
                    1 -> binding.cityText.text = "Adana"
                    9 -> binding.cityText.text = "Aydın"
                    3 -> binding.cityText.text = "Afyonkarahisar"
                    33 -> binding.cityText.text = "Mersin"
                    else -> binding.cityText.text = "Şehir plaka kodu Bulunamadı"
                }
            } else {
                binding.cityText.text = "Şehir plaka kodunu giriniz"
            }
            binding.cityPlateCodeText.setText("")
        }
    }
}