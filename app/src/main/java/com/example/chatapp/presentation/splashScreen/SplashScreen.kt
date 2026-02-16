package com.example.chatapp.presentation.splashScreen


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import com.example.chatapp.R
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.chatapp.presentation.navigation.Routes

import kotlinx.coroutines.delay



@Composable
fun SplashScreen(navHostController: NavHostController){

    LaunchedEffect(Unit) {
        delay(1000)
        navHostController.navigate(Routes.WelcomeScreen){
            popUpTo<Routes.SplashScreen>{inclusive = true}
        }

    }
    Box(modifier = Modifier.fillMaxSize()){
        Image(painter = painterResource(R.drawable.chat),
            contentDescription = null,
            modifier = Modifier.size(90.dp).align(Alignment.Center)
        )
        Column(modifier = Modifier.align(Alignment.BottomCenter).align(Alignment.Center).padding(50.dp))
        {Text(text = "From", fontSize = 20.sp,
            fontWeight = FontWeight.Bold)

            Row {
                Image(painter = painterResource(R.drawable.companylogo), contentDescription = null,
                    modifier = Modifier.size(50.dp))
            }
        }
         }
    }



