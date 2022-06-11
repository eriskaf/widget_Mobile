package com.example.widget

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.widget.databinding.ActivityLoginBinding
import com.example.widget.databinding.ActivityMainBinding

//membuat variable binding
private lateinit var binding: ActivityLoginBinding
class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //inisialisasi binding
        binding = ActivityLoginBinding.inflate(layoutInflater)
        //memanggil layout dengan menggunakan binding.root
        setContentView(binding.root)

        //Login memanggil Activity di project yang sama
        binding.btnLogin.setOnClickListener{
            val dataLogin = ModelLogin(binding.txtUser.text.toString(), binding.txtPass.text.toString())
            val Intent = Intent(this,MainActivity::class.java)
            intent.putExtra("data", dataLogin)
            startActivity(intent)
            finish()
        }


    }
}