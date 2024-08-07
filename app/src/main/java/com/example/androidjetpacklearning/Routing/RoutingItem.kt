package com.example.androidjetpacklearning.Routing

sealed class RoutingItem (val route:String){
    data object splashScreen: RoutingItem(route = "splash")
    data object categoryScreen: RoutingItem(route = "category")
    data object routingListScreen: RoutingItem(route = "routing_list")
}