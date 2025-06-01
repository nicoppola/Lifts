package com.coppola.lifts

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import com.coppola.lifts.main.MainScreen
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.KoinContext
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
@Preview
fun App() {
    MaterialTheme {
        KoinContext{
            NavHost(
                navController = rememberNavController(),
                startDestination = Destination.MAIN.name
            ){
                composable(route = Destination.MAIN.name) {
                    MainScreen()
                }
            }
        }
    }
}

enum class Destination {
    MAIN
}