package com.example.mydemoapplication

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mydemoapplication.practica01.Practica01Nav
import com.example.mydemoapplication.practica02.CalculatorScreen

@Composable
fun AppNavigator() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "home"
    ) {
        composable("home") {
            HomeScreen(
                onOpenPractica02 = { navController.navigate("practica02") },
                onOpenPractica01 = { navController.navigate("practica01") }
            )
        }

        composable("practica02") {
            CalculatorScreen()
        }

        composable("practica01") {
            Practica01Nav()
        }
    }
}
