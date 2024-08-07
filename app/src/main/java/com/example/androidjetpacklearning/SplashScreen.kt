package com.example.androidjetpacklearning

import android.os.Handler
import android.os.Looper
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.androidjetpacklearning.Routing.RoutingItem
import com.example.androidjetpacklearning.ui.theme.primaryColor
import com.example.androidjetpacklearning.ui.theme.purpleColor

@Composable
fun SplashScreen(navController: NavController){
    Surface {
        Box(modifier = Modifier
            .fillMaxSize()
            .background(color = primaryColor)){
            Box(modifier = Modifier
                .fillMaxSize(), contentAlignment = Alignment.Center
            ){
                Image(painterResource(id = R.drawable.logo), modifier = Modifier.size(100.dp), contentDescription = null)
            }
            Box(modifier = Modifier.fillMaxSize().padding(bottom = 100.dp), contentAlignment = Alignment.BottomCenter){
                CircularProgressIndicator(modifier = Modifier.size(50.dp), strokeWidth = 5.dp, color = purpleColor)
            }
        }

        Handler(Looper.getMainLooper()).postDelayed({
            navController.navigate(RoutingItem.categoryScreen.route)
        }, 2000)
    }
}