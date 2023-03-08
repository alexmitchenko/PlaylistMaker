package ru.alexmitchenko.playlistmaker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var btnSearch: Button
    private lateinit var btnMedia: Button
    private lateinit var btnSettings: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSearch = findViewById<Button?>(R.id.btn_search).apply {
            setOnClickListener {
                startActivity(Intent(this@MainActivity, SearchActivity::class.java))
            }
        }

        btnMedia = findViewById<Button?>(R.id.btn_media).apply {
            setOnClickListener {
                startActivity(Intent(this@MainActivity, MediaActivity::class.java))
            }
        }

        btnSettings = findViewById<Button?>(R.id.btn_settings).apply {
            setOnClickListener {
                startActivity(Intent(this@MainActivity, SettingsActivity::class.java))
            }
        }

    }
}