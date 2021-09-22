package com.diegoalrais.bancomr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.diegoalrais.bancomr.databinding.ActivityTransferenciaBinding
import com.diegoalrais.bancomr.databinding.ActivityTransferenciaComumBinding

class Transferencia : AppCompatActivity() {

    private lateinit var binding: ActivityTransferenciaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTransferenciaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.hide()

        val toolbar = binding.toolbarTransferencia
        toolbar.title = "Tansferência"
        toolbar.setTitleTextColor(getColor(R.color.white))
        toolbar.setTitleMargin(200,0, 200, 0)
        toolbar.setBackgroundColor(getColor(R.color.light_blue))
        toolbar.setNavigationIcon(getDrawable(R.drawable.ic_voltar))
        toolbar.setNavigationOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        binding.btnTransferencia.setOnClickListener {
            val intent = Intent(this, TransferenciaComum::class.java)
            startActivity(intent)
            finish()
        }

        binding.btnPix.setOnClickListener {
            val intent = Intent(this, Pix::class.java)
            startActivity(intent)
            finish()
        }
    }
}