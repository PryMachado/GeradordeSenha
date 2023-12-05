package com.example.geradorsenha

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.geradorsenha.databinding.ActivityMainBinding
import kotlin.random.Random
import kotlin.random.nextInt

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val alfabeto = arrayOf(
        "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O",
        "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btGerarSenha.setOnClickListener {
            val letraAleatoria1 = alfabeto.random()
            val letraAleatoria2 = alfabeto.random()
            val numero = Random.nextInt(1000..9999)

            binding.txtSenha.text = "$letraAleatoria1$letraAleatoria2-$numero"
        }
    }
}