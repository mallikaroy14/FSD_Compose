package com.example.fsdcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Weather() {
    Column(
        verticalArrangement = Arrangement.Top, horizontalAlignment = Alignment.CenterHorizontally,

        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(Color(0xFF303644))
    ) {
        Spacer(modifier = Modifier.height(15.dp))
        Text(text = "Pune", fontSize = 30.sp, color = Color.White, fontWeight = FontWeight(800))
        Text(text = "Today", fontSize = 30.sp, color = Color.White)

        Spacer(modifier = Modifier.height(40.dp))

        Image(
            painter = painterResource(id = R.drawable.ic_cloud),
            contentDescription = "",
            colorFilter = ColorFilter.tint(Color.White),
            modifier = Modifier.height(150.dp)

        )

        Text(text = "-4°", fontSize = 50.sp, color = Color.White, fontWeight = FontWeight(1000))

        Spacer(modifier = Modifier.height(40.dp))

        Text(
            text = "Tomorrow",
            fontSize = 30.sp,
            modifier = Modifier.height(50.dp),
            color = Color.White,
            fontWeight = FontWeight(800)
        )

        Spacer(modifier = Modifier.height(15.dp))


        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.height(80.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_cloud),
                contentDescription = "",
                colorFilter = ColorFilter.tint(Color.White)
            )

            Text(text = "-4°", fontSize = 40.sp, color = Color.White, fontWeight = FontWeight(500))

        }
        Spacer(modifier = Modifier.height(60.dp))

        Row(horizontalArrangement = Arrangement.SpaceAround, modifier = Modifier.fillMaxWidth()) {
            w("SUN", "-4°")
            w("MON", "3°")
            w("TUE", "-2°")
            w("WED", "8°")
            w("THRU", "9°")
            w("FRI", "10°")
        }
    }
}