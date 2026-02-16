package com.example.chatapp.presentation.updateScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size

import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll

import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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


@Preview(showSystemUi = true)
@Composable

fun UpdateScreen() {

    val scrollState = rememberScrollState()
    val sampleStatus = listOf(
        statusData(image = R.drawable.kanye, name = "Kanye West", time = "10 minutes ago"),
        statusData(image = R.drawable.messi, name = "Messi", time = "Just now"),
        statusData(image = R.drawable.stephen, name = "Stephen Curry", time = "1 hour ago"),
        statusData(image = R.drawable.zayn, name = "zayn malik", time = "5:35 PM")


    )
    val sampleChannels = listOf(
        channels(image = R.drawable.valorant, name = "Valorant", description = "daily game updates"),
        channels(image = R.drawable.fifa, name = "Fifa", description = "daily FIFA updates")

    )



    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                onClick = {/*TODO*/ },
                containerColor = colorResource(id = R.color.purple_200),
                modifier = Modifier.size(65.dp),
                contentColor = Color.White
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.camera1), contentDescription = null,
                    modifier = Modifier.size(39.dp)
                )


            }


        },
        bottomBar = {
            bottomNavigation()

        },
        topBar = {
            TopBar()

        }
    ) {
        Column(modifier = Modifier.padding(it).fillMaxSize().verticalScroll(scrollState)) {

            Text(
                text = "Status",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp)
            )


            myStatus()


            sampleStatus.forEach { data ->
                statusItem(statusData = data)


            }
            HorizontalDivider(
                color = Color.Gray
            )
            Text(text = "Channels", fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp)
                )
            Column(modifier = Modifier.padding(horizontal = 12.dp)){

                Text(text = " stay updated on topics that matter to you. Find channels to")
                Text(text = " follow below")

                Spacer(modifier = Modifier.height(32.dp))

                Text(text = "Find channels to follow")


            }
            Spacer(modifier = Modifier.height(16.dp))

            sampleChannels.forEach {
                channelItemDesign(channels = it)


            }


        }

    }
}