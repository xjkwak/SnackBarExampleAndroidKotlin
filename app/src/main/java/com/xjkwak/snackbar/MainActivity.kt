package com.xjkwak.snackbar

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonInternetConnection.setOnClickListener {
            testInternectConnection()
        }
    }

    private fun testInternectConnection() {
        val snackBar: Snackbar = Snackbar.make(findViewById(R.id.clayout), "No hay Internet", Snackbar.LENGTH_LONG).
        setAction("Reintentar!") {
            Toast.makeText(this, "Reintentando...", Toast.LENGTH_SHORT)
        }
        snackBar.setActionTextColor(Color.RED)
        snackBar.show()
    }
}