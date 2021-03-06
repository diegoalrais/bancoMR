package com.diegoalrais.bancomr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.diegoalrais.bancomr.databinding.ActivityPixBinding
import com.diegoalrais.bancomr.databinding.ActivityTransferenciaComumBinding

class Pix : AppCompatActivity() {
    private lateinit var binding: ActivityPixBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPixBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.hide()

        val toolbar = binding.toolbarPix
        toolbar.title = "PIX"
        toolbar.setTitleTextColor(getColor(R.color.white))
        toolbar.setTitleMargin(200,0, 200, 0)
        toolbar.setBackgroundColor(getColor(R.color.light_blue))
        toolbar.setNavigationIcon(getDrawable(R.drawable.ic_voltar))
        toolbar.setNavigationOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        binding.btnPixConfirma.setOnClickListener {
            val pago = binding.txtPix
            pago.setText("Operação realizada com sucesso!")
        }

        binding.btnPixCancel.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}