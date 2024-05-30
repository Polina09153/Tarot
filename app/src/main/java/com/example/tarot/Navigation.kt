package com.example.tarot

import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import java.util.Calendar

object Navigation {
    @Composable
    fun Navigate(date: String, num: MutableState<Int>){
        val navController = rememberNavController()
        NavHost(navController = navController, startDestination = Marshroutes.route1){
            composable(route = Marshroutes.route1){
                MainScreen(date = date, navController, num)
            }
            composable(route = Marshroutes.route2){
                cartPage(date = date, navController, num)
            }
            composable(route = Marshroutes.route3){
                details(date = date, navController, num)
            }
        }
    }
}