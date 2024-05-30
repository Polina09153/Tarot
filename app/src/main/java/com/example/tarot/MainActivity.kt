package com.example.tarot

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tarot.ui.theme.background
import java.util.Calendar

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val calendar = Calendar.getInstance()
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH) + 1
        val day = calendar.get(Calendar.DAY_OF_MONTH)
        var date = "$day.$month.$year"
        if (month < 10)
            date = "$day.0$month.$year"
        setContent {
        //    var screen = remember{mutableStateOf(0)}
            var num = remember { mutableStateOf(0) }
//            when (screen.value){
//                0 -> MainScreen(date = date, screen)
//                1 -> {random(num)
//                    cartPage(date = date, screen, num.value)}
//                2 -> details(date = date, screen, num.value)
//            }
            Navigation.Navigate(date = date, num = num)


        }
    }
}

//fun random(num: MutableState<Int>){
//    num.value = kotlin.random.Random.nextInt(0, 23)
//}


@Composable
fun cart(date: String){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(background),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(top = 20.dp), horizontalArrangement = Arrangement.Absolute.Left){
            Image(
                painter = painterResource(id = R.drawable.img),
                contentDescription = null,
                modifier = Modifier
                    .size(50.dp, 60.dp)
                    .clickable(onClick = {})
            )
        }
        Box(modifier = Modifier.fillMaxWidth()) {
            Text(
                text = date,
                textAlign = TextAlign.Center,
                color = Color.White,
                fontSize = 18.sp,
                modifier = Modifier
                    .fillMaxWidth()

            )
            Text(
                text = "Ваша карта дня",
                textAlign = TextAlign.Center,
                color = Color.White,
                fontSize = 34.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 50.dp)
            )
        }
        Box(modifier = Modifier
            .fillMaxWidth()
            .padding(25.dp), contentAlignment = Alignment.Center){
            Image(
                painter = painterResource(id = R.drawable.cart1),
                contentDescription = null,
                modifier = Modifier
                    .size(250.dp, 450.dp)
            )
        }
        Column(horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .padding(bottom = 40.dp)) {
            Text("Подробнее...", color = Color.White, fontSize = 20.sp, modifier = Modifier.clickable(onClick = {}))
        }
    }
}

@Preview
@Composable
fun preview(){
    cart(date = "DATA")
}


