package com.example.chatapp.presentation.navigation

import androidx.compose.runtime.Composable

import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

import androidx.navigation.compose.rememberNavController



import com.example.chatapp.presentation.callScreen.CallScreen
import com.example.chatapp.presentation.communityScreen.communityScreen
import com.example.chatapp.presentation.splashScreen.SplashScreen
import com.example.chatapp.presentation.updateScreen.UpdateScreen
import com.example.chatapp.presentation.userRegistration.UserRegistration
import com.example.chatapp.presentation.welcomeScreen.WelcomeScreen


@Composable
fun WhatsappNavigationSystem() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Routes.SplashScreen
    ) {

        composable < Routes.SplashScreen >{
            SplashScreen(navController)
        }

        composable < Routes.WelcomeScreen>{

            WelcomeScreen(navController)
        }

        composable < Routes.UserRegistrationScreen>{

            UserRegistration(navController)
        }
        composable < Routes.UpdateScreen>{

            UpdateScreen()


        }
        composable < Routes.CommunitiesScreen>{
            communityScreen()


        }
        composable < Routes.CallScreen>{
            CallScreen()


        }






    }
}
