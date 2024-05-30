package com.example.tarot

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.tarot.ui.theme.background
import com.example.tarot.ui.theme.line

@Composable
fun MainScreen(date: String, navController: NavController, num:MutableState<Int>) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(background),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(modifier = Modifier.fillMaxWidth()) {
            Text(
                text = date,
                textAlign = TextAlign.Center,
                color = Color.White,
                fontSize = 18.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(82.dp)
            )
            Text(
                text = "Ваша карта дня",
                textAlign = TextAlign.Center,
                color = Color.White,
                fontSize = 34.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 150.dp)
            )
            Text(
                text = "Что принесет наступающий день?",
                textAlign = TextAlign.Center,
                color = Color.White,
                fontSize = 20.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 207.dp)
            )

        }
        Spacer(modifier = Modifier.height(20.dp))
        Box(modifier = Modifier
            .height(2.dp)
            .width(305.dp)
            .background(color = line)

        )
        Spacer(modifier = Modifier.height(23.dp))
        Box(
            modifier = Modifier
                .height(2.dp)
                .width(130.dp)
                .background(color = line)
        )
        Spacer(modifier = Modifier.height(24.dp))
        Box(
            modifier = Modifier
                .width(60.dp)
                .height(2.dp)
                .background(color = line)
        )
        Spacer(modifier = Modifier.height(20.dp))
        Box(
            modifier = Modifier
                .width(5.dp)
                .height(2.dp)
                .background(color = line)
        )

        Column(horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom,
            modifier = Modifier.padding(bottom = 90.dp).fillMaxSize()) {
            Button(onClick = { navController.navigate(Marshroutes.route2)
                             random(num) },
                colors = ButtonDefaults.buttonColors(
                    containerColor = background,
                    contentColor = Color.White
                ),
                modifier = Modifier
                    .width(155.dp).height(50.dp).border(width = 2.dp, color = line)
            ) {
                Text(
                    text = "Начать",
                    textAlign = TextAlign.Center,
                    fontSize = 24.sp
                )
            }

        }
    }
}

fun random(num: MutableState<Int>){
    num.value = kotlin.random.Random.nextInt(0, 23)
}