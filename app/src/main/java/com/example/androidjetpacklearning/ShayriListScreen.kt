package com.example.androidjetpacklearning

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.androidjetpacklearning.ui.theme.primaryColor

@Composable
@Preview
fun ShayriListScreenPreview(){
    ShayriListScreen(title = "Demo Title")
}


@Composable
fun ShayriListScreen(navHostController: NavHostController? = null, title: String?) {
    Surface {
        Box(modifier = Modifier
            .fillMaxSize()
            .background(color = primaryColor),
        ){
            Column {
                MainToolBar(title = title.toString()) {

                }
                val dataList = getList().filter { title == it.title }
                println(dataList[0].list)
                val finalList = dataList[0]
                finalList.list?.let { data->
                    LazyColumn {
                        items(data){
                            item ->
                                Card(shape = RoundedCornerShape(20),
                                    modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp, vertical = 15.dp)
                                ){
                                    Text(text = item.toString(), color = Color.Black,
                                        modifier = Modifier.padding(all = 10.dp),
                                        style = TextStyle(textAlign = TextAlign.Center, fontSize = 16.sp)
                                    )
                                }
                            }
                        }
                    }
                }

            }

        }
    }