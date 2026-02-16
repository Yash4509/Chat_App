package com.example.chatapp.presentation.bottomNavigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.chatapp.R



@Composable

@Preview(showSystemUi = true)

fun bottomNavigation(){
    BottomAppBar(tonalElevation = 12.dp, containerColor = Color.White) {
        Row(modifier = Modifier.fillMaxWidth(),horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Column(modifier = Modifier.padding(horizontal = 16.dp)) {

                Icon(painter = painterResource(id = R.drawable.chat2), contentDescription = null,
                    modifier = Modifier.size(28.dp)
                )
                Spacer(modifier = Modifier.size(5.dp))
                Text(text = "Chats", fontWeight  = FontWeight.Bold)

            }
            Column(modifier = Modifier.padding(horizontal = 16.dp)){
                Icon(painter = painterResource(id = R.drawable.update), contentDescription = null,
                    modifier = Modifier.size(28.dp)
                )
                Spacer(modifier = Modifier.size(5.dp))
                Text(text = "Updates", fontWeight = FontWeight.Bold)
            }
            Column(modifier = Modifier.padding(horizontal = 16.dp)) {
                Icon(painter = painterResource(id = R.drawable.group), contentDescription = null,
                    modifier = Modifier.size(28.dp))
                Spacer(modifier = Modifier.size(5.dp))
                Text(text = "Groups", fontWeight = FontWeight.Bold)

            }
            Column(modifier = Modifier.padding(horizontal = 16.dp)) {

                Icon(painter = painterResource(id = R.drawable.phone), contentDescription = null,
                    modifier = Modifier.size(28.dp))

                Spacer(modifier = Modifier.size(5.dp))

                Text(text = "Calls", fontWeight = FontWeight.Bold)



            }
        }


    }

}