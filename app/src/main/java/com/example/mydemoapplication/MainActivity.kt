package com.example.mydemoapplication

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val greetingText = findViewById<TextView>(R.id.greetingText)
        val nameInput = findViewById<TextInputEditText>(R.id.nameInput)
        findViewById<MaterialButton>(R.id.greetButton).setOnClickListener {
            val entered = nameInput.text?.toString()?.trim().orEmpty()
            greetingText.text = getString(R.string.greeting_with_name, entered)
        }
    }
}