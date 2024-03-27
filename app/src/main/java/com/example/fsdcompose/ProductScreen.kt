package com.example.fsdcompose

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.fsdcompose.ui.theme.FSDComposeTheme

@Composable
fun ProductScreenView() {

    val names = listOf("Mallika", "Radhika", "Swapnil", "Vinayak", "Akash", "Sampada", "Mallika", "Radhika", "Swapnil", "Vinayak", "Akash", "Sampada","Mallika", "Radhika", "Swapnil", "Vinayak", "Akash", "Sampada")

    LazyColumn (modifier = Modifier.height(500.dp)){
        items(names) { name ->
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.LightGray)
                    .border(1.dp, Color.DarkGray)
                    .padding(20.dp)
            ) {
                Text(name)
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ProductScreen() {
    FSDComposeTheme {
//        MainScreen("Android")
        ProductScreenView()
    }
}