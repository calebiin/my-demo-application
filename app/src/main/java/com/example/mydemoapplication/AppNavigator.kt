package com.example.mydemoapplication

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mydemoapplication.practica01.Practica01Nav
import com.example.mydemoapplication.practica02.CalculatorScreen
import com.example.mydemoapplication.practica03.MainScreen
import com.example.mydemoapplication.practica04.FormScreen
import com.example.mydemoapplication.practica05.FormScreen as SettingsScreen
import com.example.mydemoapplication.practica06.ListaScreen
import com.example.mydemoapplication.practica07.MainScreen as MaterialScreen
import com.example.mydemoapplication.practica08.presentation.MainScreen as UsuariosScreen
import com.example.mydemoapplication.practica09.GaleriaScreen

@Composable
fun AppNavigator() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "home"
    ) {
        composable("home") {
            HomeScreen(
                onOpenPractica09 = { navController.navigate("practica09") },
                onOpenPractica08 = { navController.navigate("practica08") },
                onOpenPractica07 = { navController.navigate("practica07") },
                onOpenPractica06 = { navController.navigate("practica06") },
                onOpenPractica05 = { navController.navigate("practica05") },
                onOpenPractica04 = { navController.navigate("practica04") },
                onOpenPractica03 = { navController.navigate("practica03") },
                onOpenPractica02 = { navController.navigate("practica02") },
                onOpenPractica01 = { navController.navigate("practica01") }
            )
        }

        composable("practica09") {
            GaleriaScreen()
        }

        composable("practica08") {
            UsuariosScreen()
        }

        composable("practica07") {
            MaterialScreen()
        }

        composable("practica06") {
            ListaScreen()
        }

        composable("practica05") {
            SettingsScreen()
        }

        composable("practica04") {
            FormScreen()
        }

        composable("practica03") {
            MainScreen()
        }

        composable("practica02") {
            CalculatorScreen()
        }

        composable("practica01") {
            Practica01Nav()
        }
    }
}
