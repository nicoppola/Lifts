package com.coppola.lifts

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.coppola.lifts.main.MainScreen
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.KoinContext
import com.coppola.lifts.theme.AppTheme

@Composable
@Preview
fun App() {
    AppTheme {
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