package com.example.modularapp.ui.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavHostController

@Composable
internal fun HomeScreen(mainController: NavHostController) {
    Column(modifier = Modifier.fillMaxSize()) {
        Button(onClick = {
            mainController.navigate("profile")
        }) {
            Text(textAlign = TextAlign.Center, text = "profile Screen")
        }

        Button(onClick = {
            mainController.navigate("help")
        }) {
            Text(textAlign = TextAlign.Center, text = "help Screen")
        }
    }
}