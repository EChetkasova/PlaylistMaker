// SettingsActivity.kt
package com.practicum.playlistmaker

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ctivity_settings)

        val backButton = findViewById<ImageView>(R.id.ivBack)
        backButton.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}
