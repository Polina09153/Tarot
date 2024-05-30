package com.example.tarot

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.tarot.ui.theme.background
import com.example.tarot.ui.theme.line

@Composable
fun details(date: String, navController: NavController, num:MutableState<Int>){
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
                text = stringResource(id = meaning(num.value)),
                textAlign = TextAlign.Center,
                color = Color.White,
                fontSize = 18.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 200.dp)
            )
        }
        Column(horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom,
            modifier = Modifier
                .padding(bottom = 90.dp)
                .fillMaxSize()) {
            Button(onClick = { navController.navigate(Marshroutes.route2)},
                colors = ButtonDefaults.buttonColors(
                    containerColor = background,
                    contentColor = Color.White
                ),
                modifier = Modifier
                    .width(155.dp)
                    .height(50.dp)
                    .border(width = 2.dp, color = line)
            ) {
                Text(
                    text = "Назад",
                    textAlign = TextAlign.Center,
                    fontSize = 24.sp
                )
            }

        }
    }
}

private fun meaning(num:Int): Int {
    return when (num) {
        1 -> R.string.mean1
        2 -> R.string.mean2
        3 -> R.string.mean3
        4 -> R.string.mean4
        5 -> R.string.mean5
        6 -> R.string.mean6
        7 -> R.string.mean7
        8 -> R.string.mean8
        9 -> R.string.mean9
        10 -> R.string.mean10
        11 -> R.string.mean11
        12 -> R.string.mean12
        13 -> R.string.mean13
        14 -> R.string.mean14
        15 -> R.string.mean15
        16 -> R.string.mean16
        17 -> R.string.mean17
        18 -> R.string.mean18
        19 -> R.string.mean19
        20 -> R.string.mean20
        21 -> R.string.mean21
        22 -> R.string.mean22
        else -> R.string.mean1
    }
}