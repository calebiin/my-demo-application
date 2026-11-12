package com.example.mydemoapplication

import android.net.Uri
import androidx.compose.runtime.Composable
import com.example.mydemoapplication.practica02.CalculatorScreen
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

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
                onOpenPractica01 = { navController.navigate("first_screen") }
            )
        }

        composable("practica02") {
            CalculatorScreen()
        }

        composable("first_screen") {
            FirstScreen(onNavigateToSecondScreen = { texto ->
                navController.navigate("second_screen/${Uri.encode(texto)}")
            })
        }

        composable(
            route = "second_screen/{texto}",
            arguments = listOf(navArgument("texto") { type = NavType.StringType })
        ) { backStackEntry ->
            val textoRecibido = backStackEntry.arguments?.getString("texto") ?: ""
            SecondScreen(
                mensaje = textoRecibido,
                onBack = { navController.popBackStack() }
            )
        }
    }
}
