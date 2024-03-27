package com.example.fsdcompose

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun MainScreen(name: String, modifier: Modifier = Modifier) {

    var name by remember {
        mutableStateOf("Dark")
    }

    Column {
        Column(
            verticalArrangement = Arrangement.SpaceAround,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .background(Color.Black)
                .fillMaxWidth()
                .height(500.dp)
        ) {
            generalText(name)
            Image(
                painter = painterResource(id = R.drawable.ic_android),
                contentDescription = "Android Image",
                modifier = Modifier
            )
            generalText(name = "Thor")
        }
        Spacer(modifier = Modifier.height(10.dp))

        Row(
            horizontalArrangement = Arrangement.Absolute.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .height(100.dp)
                .width(400.dp)
                .background(Color.Yellow)
        ) {
            Text(text = "Mallika")
            Text(text = "Mallika")
            Text(text = "Mallika")
        }

        Text(text = name)

        Button(
            onClick = {
                print("Button Clicked")
                Log.d("Sample Message", "MainScreen: Button Clicked")
                name = "Changed name"

            },
            modifier = Modifier
                .fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Blue)
        ) {
            Text(text = "Continue")

        }
    }
}