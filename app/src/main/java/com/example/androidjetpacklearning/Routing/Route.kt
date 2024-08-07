package com.example.androidjetpacklearning.Routing

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.androidjetpacklearning.CategoryScreen
import com.example.androidjetpacklearning.ShayriListScreen
import com.example.androidjetpacklearning.SplashScreen

@Composable
fun MainRoute(navHostController: NavHostController){
    NavHost(navController = navHostController, startDestination = RoutingItem.splashScreen.route) {
        composable(route = RoutingItem.categoryScreen.route){
            CategoryScreen(navHostController)
        }
        composable(route = RoutingItem.splashScreen.route){
            SplashScreen(navHostController)
        }
        composable(route = RoutingItem.routingListScreen.route+"/{title}"){
            val title = it.arguments?.getString("title")
            ShayriListScreen(navHostController,title)
        }
    }
}