package com.example.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.ui.view.DataScreen
import com.example.ui.view.ProfileScreen

@Composable
fun ProfileNavGraph() {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "profile"){
        composable(route = "profile"){ ProfileScreen(navController) }
        composable(route = "data"){ DataScreen() }
    }
}


