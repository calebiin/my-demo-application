package com.example.mydemoapplication

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen(
    onOpenPractica08: () -> Unit,
    onOpenPractica07: () -> Unit,
    onOpenPractica06: () -> Unit,
    onOpenPractica05: () -> Unit,
    onOpenPractica04: () -> Unit,
    onOpenPractica03: () -> Unit,
    onOpenPractica02: () -> Unit,
    onOpenPractica01: () -> Unit,
) {
    Scaffold { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(24.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Text(
                text = "Prácticas",
                style = MaterialTheme.typography.headlineSmall
            )
            Button(
                onClick = onOpenPractica08,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("P08: Room")
            }
            Button(
                onClick = onOpenPractica07,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("P07: Material Design")
            }
            Button(
                onClick = onOpenPractica06,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("P06: Listas dinámicas")
            }
            Button(
                onClick = onOpenPractica05,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("P05: Configuración")
            }
            Button(
                onClick = onOpenPractica04,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("P04: Controles avanzados")
            }
            Button(
                onClick = onOpenPractica03,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("P03: Intents y navegación")
            }
            Button(
                onClick = onOpenPractica02,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("P02: Calculadora")
            }
            Button(
                onClick = onOpenPractica01,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("P01: Hola Mundo")
            }
        }
    }
}
