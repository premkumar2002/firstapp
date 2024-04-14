package com.example.firstapp

import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.firstapp.R.color
import com.example.firstapp.ui.theme.FirstappTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonHot = findViewById<Button>(R.id.btnhot)
        val buttonCool = findViewById<Button>(R.id.btncool)
        val linearLayout = findViewById<LinearLayout>(R.id.linearLayout)
        val blackColor = ContextCompat.getColor(this, R.color.black)
        val blueColor = ContextCompat.getColor(this, R.color.blue)
        buttonHot.setOnClickListener {
            linearLayout.setBackgroundColor(blackColor)
        }

        buttonCool.setOnClickListener {
            linearLayout.setBackgroundColor(blueColor)
        }
    }
}
