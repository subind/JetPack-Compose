package com.example.composepractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composepractice.ui.theme.ComposePracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MessageCard(Message("Subind", "JetpackCompose"))
        }
    }
}

data class Message(val author: String, val body: String)

@Composable
fun MessageCard(msg: Message) {
    Row(modifier = Modifier.padding(10.dp)) {
        Image(
            painter = painterResource(id = R.drawable.pro_pic),
            contentDescription = "Contact Profile Pic",
            modifier = Modifier
                .size(100.dp)
                .clip(CircleShape),
        contentScale = ContentScale.Crop)
        
        Spacer(modifier = Modifier.width(10.dp))
        
        Column() {
            Spacer(modifier = Modifier.height(25.dp))
            Text(text = "Author: ${msg.author}")
            Spacer(modifier = Modifier.height(10.dp))
            Text(text = "Body: ${msg.body}")
        }
    }
}

/**
 * The Preview annotation must only be used on a function that takes no parameters.
 * Hence declare another function & invoke the function to be previewed within it
 */
@Preview
    (
    name = "Preview Name",
    showBackground = true,
    showSystemUi = true
)
@Composable
fun PreviewMessageCard() {
    ComposePracticeTheme {
        MessageCard(Message("TestAuthor", "TestBody"))
    }
}