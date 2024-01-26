package com.example.fatma_jobshet13

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class jobshet13activity: AppCompatActivity() {
        private lateinit var namaView: TextView
        private lateinit var kelasView: TextView
        private lateinit var nisView: TextView

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)

            setContentView(R.layout.activity_jobshet13)
            namaView = findViewById(R.id.namaView)
            kelasView = findViewById(R.id.kelasView)
            nisView = findViewById(R.id.nisView)

            val extras = intent.extras
            namaView.text = extras?.getString("nama")
            kelasView.text = extras?.getString("kelas")
            nisView.text = extras?.getString("nis")
        }
    }
