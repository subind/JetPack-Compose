package com.example.composepractice

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composepractice.ui.theme.ComposePracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposePracticeTheme {
                Column(
                    modifier = Modifier
                        .background(color = Color.Red)
                        .fillMaxSize(1f)
                        .border(5.dp, Color.Black)
                        .padding(5.dp)
                ) {
                    Text(
                        text = "first",
                        modifier = Modifier
                            .border(width = 5.dp, color = Color.Yellow)
                            .padding(10.dp)
                            .clickable(onClick = { Toast.makeText(this@MainActivity, "Tapped !!!", Toast.LENGTH_LONG).show() })
                    )
                    Text(text = "Second")
                    Text(text = "Third")
                }
            }
        }
    }
}


/*@Preview(showSystemUi = true)
@Composable
fun ComposablePreview() {

}*/

