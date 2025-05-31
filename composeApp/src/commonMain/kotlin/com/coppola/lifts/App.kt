package com.coppola.lifts

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import com.coppola.lifts.main.MainScreen
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
       MainScreen()
    }
}