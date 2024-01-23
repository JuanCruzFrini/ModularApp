package com.example.ui.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavHostController


@Composable
internal fun ProfileScreen(navController: NavHostController) {
    Column(modifier = Modifier.fillMaxSize()){
        Text(textAlign = TextAlign.Center, text = "ProfileScreen")

        Button(onClick = { navController.navigate("data") }) {
            Text(textAlign = TextAlign.Center, text = "data Screen")
        }
    }
}