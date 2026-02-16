package com.example.chatapp.presentation.updateScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.chatapp.R

@Composable


fun myStatus(){



    Row(modifier = Modifier.fillMaxWidth().padding(12.dp), verticalAlignment = Alignment.CenterVertically){


        Box{

            Image(
                painter  = painterResource(id = R.drawable.lebron),
                contentDescription = null,
                modifier = Modifier.size(60.dp).clip(shape = CircleShape),
                contentScale = ContentScale.Crop
            )

            Icon(painter = painterResource(id = R.drawable.plus), contentDescription = null,
                tint = Color.White, modifier = Modifier.size(25.dp)
                    .align(Alignment.BottomEnd).padding(2.dp)
                    .background(color = colorResource(id = R.color.purple_200),
                        shape = RoundedCornerShape(12.dp))
            )






        }

        Spacer(modifier = Modifier.size(12.dp))

        Column {

            Text("My Status", fontWeight = FontWeight.Bold,
                fontSize = 16.sp)
            Text(text = "Tap to add status update", color= Color.Gray,
                fontSize = 14.sp)
        }



    }



}
data class statusData(
    val image: Int,
    val name: String,
    val time: String
)

@Composable



fun statusItem(statusData: statusData){
    Row(modifier = Modifier.fillMaxWidth().padding(12.dp), verticalAlignment = Alignment.CenterVertically) {
        Image(painter = painterResource(id = statusData.image), contentDescription = null,
            modifier = Modifier.size((60.dp)).padding(4.dp).clip(CircleShape),
            contentScale = ContentScale.Crop

        )

        Column {

            Text(text = statusData.name, fontSize = 16.sp, fontWeight = FontWeight.Bold)

            Text(text = statusData.time, fontSize = 14.sp, fontWeight = FontWeight.Bold,
                color = Color.Gray)
        }

    }
}
