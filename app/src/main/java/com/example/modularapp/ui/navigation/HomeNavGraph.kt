package com.example.modularapp.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.modularapp.ui.view.HomeScreen


@Composable
fun HomeNavGraph(
    mainController:NavHostController = rememberNavController()
) {
    val homeController = rememberNavController()
    NavHost(navController = homeController, startDestination = "home"){
        composable(route = "home"){ HomeScreen(mainController) }
    }
}