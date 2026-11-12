package com.example.mydemoapplication.practica03

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.mydemoapplication.ui.theme.MyDemoApplicationTheme

class ProfileActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val nombre = intent.getStringExtra("EXTRA_NOMBRE") ?: "Sin Nombre"
        val correo = intent.getStringExtra("EXTRA_CORREO") ?: "Sin Correo"

        setContent {
            MyDemoApplicationTheme {
                ProfileScreen(
                    nombre = nombre,
                    correo = correo,
                    onBackClick = { finish() }
                )
            }
        }
    }
}
