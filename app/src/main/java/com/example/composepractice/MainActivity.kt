package com.example.composepractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.composepractice.ui.theme.ComposePracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MessageCard("Subi")
        }
    }
}

@Composable
fun MessageCard(name: String) {
    Text(text = "Hello $name !!!")
}

/**
 * The Preview annotation must only be used on a function that takes no parameters.
 * Hence declare another function & invoke the function to be previewed within it
 */
@Preview
    (name = "Preview Name",
    showBackground = true,
    showSystemUi = true)
@Composable
fun PreviewMessageCard() {
    ComposePracticeTheme {
        MessageCard("Android")
    }
}