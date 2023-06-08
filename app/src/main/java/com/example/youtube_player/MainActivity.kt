package com.example.youtube_player

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.youtube_player.ui.theme.Youtube_playerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Youtube_playerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting(applicationContext)
                }
            }
        }
    }
}

@Composable
fun Greeting(contxt: Context) {
    Column(verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .verticalScroll(rememberScrollState())) {
        Image(
            painterResource(id = R.drawable.smartlogo),
            contentDescription = "",
            modifier = Modifier.size(500.dp,200.dp)
        )

        Image(
            painterResource(id = R.drawable.first),
            contentDescription = "",
            modifier = Modifier.size(600.dp,300.dp)
        )
        Button(onClick = {
            var mine = Intent(contxt,MainActivity1::class.java)
            mine.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            contxt.startActivity(mine)
        }) {
            Text(text = "Click Here To Watch This Video")
        }


        Image(
            painterResource(id = R.drawable.second),
            contentDescription = "",
            modifier = Modifier.size(600.dp,300.dp)
        )
        Button(onClick = {
            var mine2 = Intent(contxt,MainActivity2::class.java)
            mine2.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            contxt.startActivity(mine2)
        }) {
            Text(text = "Click Here To Watch This Video")
        }


        Image(
            painterResource(id = R.drawable.third),
            contentDescription = "",
            modifier = Modifier.size(600.dp,300.dp)
        )
        Button(onClick = {
            var mine3 = Intent(contxt,MainActivity3::class.java)
            mine3.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            contxt.startActivity(mine3)
        }) {
            Text(text = "Click Here To Watch This Video")
        }


        Image(
            painterResource(id = R.drawable.fourth),
            contentDescription = "",
            modifier = Modifier.size(600.dp,300.dp)
        )
        Button(onClick = {
            var mine4 = Intent(contxt,MainActivity4::class.java)
            mine4.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            contxt.startActivity(mine4)
        }) {
            Text(text = "Click Here To Watch This Video")
        }


        Image(
            painterResource(id = R.drawable.fifth),
            contentDescription = "",
            modifier = Modifier.size(600.dp,300.dp)
        )
        Button(onClick = {
            var mine5 = Intent(contxt,MainActivity5::class.java)
            mine5.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            contxt.startActivity(mine5)
        }) {
            Text(text = "Click Here To Watch This Video")
        }
    }
}
