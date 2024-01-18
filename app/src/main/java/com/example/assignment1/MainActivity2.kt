package com.example.assignment1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val callMeButton = findViewById<Button>(R.id.CallButton)
        callMeButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.setData(Uri.parse("tel:9800974479"))
//            if (intent.resolveActivity(packageManager) != null) {
//                startActivity(intent)
//            } else {
//                // Handle the case where no phone app is available
//                Toast.makeText(this, "No phone app found", Toast.LENGTH_SHORT).show()
//            }
            startActivity(intent)
        }
    }
}