package com.example.chatapp.presentation.welcomeScreen


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.chatapp.R
import com.example.chatapp.presentation.navigation.Routes


@Composable

fun WelcomeScreen(navHostController: NavHostController){


    Column(modifier = Modifier.fillMaxSize().background(Color(0xFFF5ECFD)),
        verticalArrangement = Arrangement.Center,horizontalAlignment = Alignment.CenterHorizontally) {



        Image(painter = painterResource(R.drawable.welcomescreen),
            contentDescription = null, modifier = Modifier.size(300.dp)
        )
        Text(text = "Welcome ChatApp", fontSize = 24.sp, fontWeight = FontWeight.Bold)
        Row {
            Text(text = "Read our")
            Spacer(modifier = Modifier.size(2.dp))
            Text(text = " Privacy Policy", color = Color.Blue)
            Text(text = "Tap 'Agree and continue to")



        }
        Row {
            Text(text = "accept the")
            Spacer(modifier = Modifier.size(2.dp))
            Text(text = "Terms and Services", color = Color.Blue)



        }
        Button(onClick = {navHostController.navigate(Routes.UserRegistrationScreen)}, modifier =
            Modifier.size(width = 250.dp,height = 50.dp)
            .padding(top = 10.dp),



        ) {
            Text(text = "Agree and Continue")


        }





    }


}