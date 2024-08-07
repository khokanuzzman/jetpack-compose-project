package com.example.androidjetpacklearning

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidjetpacklearning.Model.ShayriModel
import com.example.androidjetpacklearning.ui.theme.primaryColor
import com.example.androidjetpacklearning.ui.theme.purpleColor

@Composable
@Preview
fun MainTopBarPreview(){
    MainToolBar(title = "Demo Category",{

    })
}

@Composable
fun MainToolBar(title:String, onClick:()->Unit) {
    Row(modifier = Modifier
        .fillMaxWidth()
        .height(50.dp)
        .padding(horizontal = 20.dp),
        verticalAlignment = Alignment.CenterVertically,)
    {
        Card(shape = RoundedCornerShape(200.dp),
            modifier = Modifier.size(25.dp).clickable {
                onClick.invoke()
            },
            colors = CardDefaults.cardColors(
            primaryColor)) {
            Box(modifier = Modifier
                .fillMaxSize()
                .background(color = purpleColor), contentAlignment = Alignment.Center){
                Icon(painterResource(id = R.drawable.ic_back), tint = Color.White, modifier = Modifier.size(15.dp), contentDescription = null)
            }
        }

        Text(text = title, style = TextStyle(fontSize = 14.sp, color = Color.White,), modifier = Modifier.padding(10.dp))
    }
}

fun getList():List<ShayriModel>{
    return  listOf<ShayriModel>(
        ShayriModel(
            title = "Love",
            listOf(
                "Your love is like a beautiful sunrise, bringing light and warmth to my life.",
                "In your eyes, I've found my home, and in your heart, I've found my love.",
                "Every moment spent with you is like a beautiful dream come true.",
                "Your love is the melody my heart dances to, a song that never ends.",
                "Loving you is the most beautiful thing I've ever done, and I cherish every moment of it."
            )
        ),
        ShayriModel(
            title = "Friendship",
            listOf(
                "Friendship is the golden thread that ties our hearts together.",
                "A true friend is someone who sees the pain in your eyes while everyone else believes the smile on your face.",
                "Friendship isn't about whom you have known the longest; it's about who came and never left your side.",
                "A friend is someone who knows all about you and still loves you.",
                "Good friends are like stars. You don't always see them, but you know they're always there."
            )
        ),
        ShayriModel(
            title = "Nature",
            listOf(
                "The beauty of nature is a reminder of the endless wonders around us.",
                "In every walk with nature, one receives far more than he seeks.",
                "Nature is not a place to visit. It is home.",
                "The earth has music for those who listen.",
                "Look deep into nature, and then you will understand everything better."
            )
        ),
        ShayriModel(
            title = "Life",
            listOf(
                "Life is a journey, and only you hold the map.",
                "Life is what happens when you're busy making other plans.",
                "The purpose of life is not to be happy, but to be useful, honorable, and compassionate.",
                "Life is not measured by the number of breaths we take, but by the moments that take our breath away.",
                "In the end, it's not the years in your life that count, but the life in your years."
            )
        ),
        ShayriModel(
            title = "Motivation",
            listOf(
                "Believe you can, and you're halfway there.",
                "Don't watch the clock; do what it does. Keep going.",
                "The only limit to our realization of tomorrow is our doubts of today.",
                "Success is not the key to happiness. Happiness is the key to success. If you love what you are doing, you will be successful.",
                "The future belongs to those who believe in the beauty of their dreams."
            )
        )
    )
}