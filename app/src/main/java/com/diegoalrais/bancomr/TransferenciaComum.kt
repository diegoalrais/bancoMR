package com.diegoalrais.bancomr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.diegoalrais.bancomr.databinding.ActivityTransferenciaComumBinding

class TransferenciaComum : AppCompatActivity() {

    private lateinit var binding: ActivityTransferenciaComumBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTransferenciaComumBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.hide()

        val toolbar = binding.toolbarTransferenciaComum
        toolbar.title = "TansferĂȘncia Comum"
        toolbar.setTitleTextColor(getColor(R.color.white))
        toolbar.setTitleMargin(100,0, 100, 0)
        toolbar.setBackgroundColor(getColor(R.color.light_blue))
        toolbar.setNavigationIcon(getDrawable(R.drawable.ic_voltar))
        toolbar.setNavigationOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        binding.btnTransfereComum.setOnClickListener {
            val transfereComum = binding.txtTransfereComum
            transfereComum.setText("TransferĂȘncia realizada com sucesso!")
        }

        binding
    }
}