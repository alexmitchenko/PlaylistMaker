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

        val btnSearchClickListener: View.OnClickListener = object : View.OnClickListener {
            override fun onClick(v: View?) {
                Toast.makeText(this@MainActivity, "Нажата кнопка Поиск", Toast.LENGTH_LONG).show()
            }
        }
        btnSearch = findViewById<Button?>(R.id.btn_search).apply {
            setOnClickListener(btnSearchClickListener)
        }

        btnMedia = findViewById<Button?>(R.id.btn_media).apply {
            setOnClickListener {
                Toast.makeText(this@MainActivity, "Нажата кнопка Медиатека", Toast.LENGTH_LONG).show()
            }
        }

        btnSettings = findViewById<Button?>(R.id.btn_settings).apply {
            setOnClickListener {
                startActivity(Intent(this@MainActivity, SettingsActivity::class.java))
            }
        }
    }
}