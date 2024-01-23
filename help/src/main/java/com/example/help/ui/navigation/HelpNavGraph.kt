package com.example.help.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.help.ui.view.HelpScreen

@Composable
fun HelpNavGraph() {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "help"){
        composable(route = "help"){ HelpScreen() }
    }
}

