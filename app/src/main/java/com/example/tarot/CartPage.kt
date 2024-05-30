package com.example.tarot

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.tarot.ui.theme.background


@Composable
fun cartPage(date: String, navController: NavController, num:MutableState<Int>){

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(background),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(modifier = Modifier.fillMaxWidth().padding(top = 20.dp), horizontalArrangement = Arrangement.Absolute.Left){
            Image(
                painter = painterResource(id = R.drawable.img),
                contentDescription = null,
                modifier = Modifier
                    .size(50.dp, 60.dp).clickable(onClick = {navController.navigate(Marshroutes.route1)})
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
                painter = painterResource(id = img(num.value)),
                contentDescription = null,
                modifier = Modifier
                    .size(200.dp, 400.dp)
            )
        }
        Column(horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .padding(bottom = 30.dp)) {
            Text(stringResource(id = name(num.value)), color = Color.White, fontSize = 24.sp)
            Spacer(modifier = Modifier.height(5.dp))
            Text("Подробнее...", color = Color.White, fontSize = 20.sp, modifier = Modifier.clickable(onClick = {navController.navigate(Marshroutes.route3)}))
        }
    }
}


private fun img(num:Int): Int {
    return when (num) {
        1 -> R.drawable.cart1
        2 -> R.drawable.cart2
        3 -> R.drawable.cart3
        4 -> R.drawable.cart4
        5 -> R.drawable.cart5
        6 -> R.drawable.cart6
        7 -> R.drawable.cart7
        8 -> R.drawable.cart8
        9 -> R.drawable.cart9
        10 -> R.drawable.cart10
        11 -> R.drawable.cart11
        12 -> R.drawable.cart12
        13 -> R.drawable.cart13
        14 -> R.drawable.cart14
        15 -> R.drawable.cart15
        16 -> R.drawable.cart16
        17 -> R.drawable.cart17
        18 -> R.drawable.cart18
        19 -> R.drawable.cart19
        20 -> R.drawable.cart20
        21 -> R.drawable.cart21
        22 -> R.drawable.cart22
        else -> R.drawable.cart1
    }
}

private fun name(num:Int): Int {
    return when (num) {
        1 -> R.string.сart1
        2 -> R.string.сart2
        3 -> R.string.сart3
        4 -> R.string.сart4
        5 -> R.string.сart5
        6 -> R.string.сart6
        7 -> R.string.сart7
        8 -> R.string.сart8
        9 -> R.string.сart9
        10 -> R.string.сart10
        11 -> R.string.сart11
        12 -> R.string.сart12
        13 -> R.string.сart13
        14 -> R.string.сart14
        15 -> R.string.сart15
        16 -> R.string.сart16
        17 -> R.string.сart17
        18 -> R.string.сart18
        19 -> R.string.сart19
        20 -> R.string.сart20
        21 -> R.string.сart21
        22 -> R.string.сart22
        else -> R.string.сart1
    }
}