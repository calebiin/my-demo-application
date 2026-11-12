package com.example.mydemoapplication.practica12

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mydemoapplication.practica12.presentation.PokeViewModel
import com.example.mydemoapplication.practica12.presentation.PokemonDetailScreen
import com.example.mydemoapplication.practica12.presentation.PokemonsByTypeScreen
import com.example.mydemoapplication.practica12.presentation.TiposScreen

@Composable
fun Practica12Nav(viewModel: PokeViewModel = viewModel()) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "tipos") {
        composable("tipos") {
            TiposScreen(viewModel) { id ->
                navController.navigate("pokemons/$id")
            }
        }
        composable("pokemons/{id}") { backStackEntry ->
            val id = backStackEntry.arguments?.getString("id") ?: ""
            PokemonsByTypeScreen(viewModel, id) { pokeId ->
                navController.navigate("detalle/$pokeId")
            }
        }
        composable("detalle/{id}") { backStackEntry ->
            val id = backStackEntry.arguments?.getString("id") ?: ""
            PokemonDetailScreen(viewModel, id)
        }
    }
}
