package com.example.chatapp.presentation.homeScreen


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer

import androidx.compose.foundation.layout.fillMaxWidth

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider

import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.chatapp.R
import com.example.chatapp.presentation.bottomNavigation.bottomNavigation
import com.example.chatapp.presentation.chat_box.chatListModel



@Composable
@Preview(showSystemUi = true)

fun homeScreen(){



    val chatData = listOf(
        chatListModel(

        R.drawable.kanye,
        message = "hello",
        time = "10:00 AM",
        name = "Kanye West"
    ),
        chatListModel(

            R.drawable.messi,
            message = "Wanna play Football",
            time = "9:00 PM",
            name = "Messi"),
        chatListModel(

            R.drawable.stephen,
            message = "Wanna play basketball",
            time = "4:39 PM",
            name = "Stephen Curry"),
        chatListModel(

            R.drawable.zayn,
            message = "how are you",
            time = "5:35 PM",
            name = "zayn malik")


    )





    Scaffold(
        floatingActionButton = {

            FloatingActionButton(onClick = {}, containerColor = colorResource(id= R.color.purple_200),
                modifier = Modifier.size(70.dp),
                contentColor = Color.White) {


                Icon(painter = painterResource(id = R.drawable.chat1), contentDescription = null,
                    modifier = Modifier.padding(17.dp))


            }
        },
        bottomBar = {bottomNavigation()}
    ) {
        Column(modifier = Modifier.padding(it)) {
            Box(modifier = Modifier.fillMaxWidth()){
                Text("ChatApp", fontSize = 28.sp,
                    color = (colorResource(id = R.color.purple_200)),
                    modifier = Modifier.align(Alignment.TopStart).padding(start = 16.dp,top = 16.dp)
                    , fontWeight = FontWeight.Bold



                    )
                Row(modifier = Modifier.align(Alignment.TopEnd).padding(end = 16.dp, top = 16.dp))
                {
                    IconButton(onClick = {}) {
                        Icon(painter = painterResource(id = R.drawable.camera),contentDescription = null,
                            modifier = Modifier.size(30.dp)
                        )
                    }


                    Spacer(modifier = Modifier.size(5.dp))




                    IconButton(onClick = {}) {

                        Icon(painter = painterResource(id = R.drawable.search), contentDescription = null,
                            modifier = Modifier.size(27.dp)
                        )
                    }
                    IconButton(onClick = {}) {
                        Icon(painter = painterResource(id = R.drawable.three),
                            contentDescription = null,
                            modifier = Modifier.size(30.dp)
                        )
                    }


                }


            }
            HorizontalDivider()
            LazyColumn {
                items(chatData){
                    chatDesign(chatListModel = it)
                }


            }






        }


    }
}