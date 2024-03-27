package com.example.fsdcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fsdcompose.ui.theme.FSDComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen("Mallika")
//            Weather()
//            ProductScreenView()



        }
    }
}




@Composable
fun w(day: String, temp: String) {

    Column {
        Text(text = day, fontSize = 20.sp, color = Color.White, fontWeight = FontWeight(300))
        Text(text = temp, fontSize = 30.sp, color = Color.White, fontWeight = FontWeight(300))
    }
}

//extracted Composable
@Composable
fun generalText(name: String) {
    Text(
        text = "Hello $name!",
        color = Color.Blue,
        fontSize = 30.sp,
        modifier = Modifier
            .width(200.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(Color.Gray)
            .border(10.dp, Color.Blue)
            .padding(30.dp)
    )
}


data class Version(
    @DrawableRes val imageResourceId: Int, val name: String, val release: String
)

@Composable
fun DisplayList() {

    var userName = remember {
        mutableStateOf("")
    }

    val fruits = listOf(
        Version(R.drawable.ic_android, "Android", "2nd Jan"),
        Version(R.drawable.ic_file, "Finder", "24nd Jan"),
        Version(R.drawable.ic_mac, "Mac", "12nd Jan"),
        Version(R.drawable.ic_microsoft, "Microsoft", "13nd Aug"),
        Version(R.drawable.ic_android, "Android", "2nd Feb")
    )

    Column {
        LazyRow {
            items(fruits) { item ->
                Column(
                    modifier = Modifier.padding(8.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        modifier = Modifier
                            .padding(8.dp)
                            .size(64.dp)
                            .clip(RoundedCornerShape(50)),
                        painter = painterResource(id = item.imageResourceId),
                        contentDescription = null
                    )
                    Text(text = item.name)
                }
                Divider()
            }
        }

        TextField(value = userName.value, onValueChange = { updatedName ->
            userName.value = updatedName
        }, label = { Text("Enter your Name") })

        Button(onClick = {
            println("UserName: ${userName.value}")
            println("Button CLicked")
        }) {
            Text(text = "Continue")
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    FSDComposeTheme {
//        MainScreen("Android")
        Weather()
    }
}