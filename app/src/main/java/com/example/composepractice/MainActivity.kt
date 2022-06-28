package com.example.composepractice

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
            ComposePracticeTheme() {
                MessageCard(Message("Subind", "JetpackCompose"))
            }
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
                .clip(CircleShape)
                .border(2.dp, MaterialTheme.colors.secondaryVariant, CircleShape),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.width(10.dp))

        Column() {
            Spacer(modifier = Modifier.height(25.dp))
            Text(text = "Author: ${msg.author}", color = MaterialTheme.colors.secondaryVariant, style = MaterialTheme.typography.body1)
            Spacer(modifier = Modifier.height(10.dp))
            //Provides shape
            Surface(shape = MaterialTheme.shapes.medium, elevation = 2.dp) {
                Text(text = "Body: ${msg.body}", style = MaterialTheme.typography.body2, modifier = Modifier.padding(2.dp))
            }
        }
    }
}

/**
 * The Preview annotation must only be used on a function that takes no parameters.
 * Hence declare another function & invoke the function to be previewed within it
 */
@Preview
    (
    name = "Light mode",
    showBackground = true
)
@Preview
    (
    name = "Dark mode",
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES
)
@Composable
fun PreviewMessageCard() {
    ComposePracticeTheme {
        MessageCard(Message("TestAuthor", "TestBody"))
    }
}