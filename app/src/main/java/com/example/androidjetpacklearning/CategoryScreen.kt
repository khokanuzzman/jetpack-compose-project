package com.example.androidjetpacklearning

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.androidjetpacklearning.Routing.RoutingItem
import com.example.androidjetpacklearning.ui.theme.primaryColor

@Composable
fun CategoryScreen(navHostController: NavHostController) {
    Surface {
        Box(modifier = Modifier
            .fillMaxSize()
            .background(color = primaryColor)){
            Column {
                MainToolBar("category",{

                })
                LazyColumn {
                    items(getList()){ item->
                        Card(shape = RoundedCornerShape(20.dp),
                            modifier = Modifier
                                .fillMaxSize()
                                .height(80.dp)
                                .padding(10.dp)
                                .clickable {
                                    navHostController.navigate(RoutingItem.routingListScreen.route+"/${item.title.toString()}")
                                },
                            colors = CardDefaults.cardColors(containerColor = Color.White))
                        {
                            Box(modifier = Modifier.fillMaxSize(), Alignment.Center){
                                Text(
                                    text = item.title.toString(),
                                    style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 16.sp, color = Color.Black)
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}