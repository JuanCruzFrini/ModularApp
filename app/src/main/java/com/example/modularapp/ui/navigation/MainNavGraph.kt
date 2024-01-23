package com.example.modularapp.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.help.ui.navigation.HelpNavGraph
import com.example.ui.navigation.ProfileNavGraph

@Composable
fun MainNavGraph() {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "home"){

        composable(route = "home") { HomeNavGraph(navController) }

        composable(route = "help") { HelpNavGraph() }

        composable(route = "profile") { ProfileNavGraph() }
    }
}