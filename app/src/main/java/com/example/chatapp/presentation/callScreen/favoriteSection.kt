package com.example.chatapp.presentation.callScreen

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.chatapp.R


@Composable
@Preview(showSystemUi = true)

fun favoriteSection(){

    var sampleFavorites = listOf(favoriteContact(image = R.drawable.messi, name = "Messi"),
        favoriteContact(image = R.drawable.kanye, name = "Kanye West"),
        favoriteContact(image = R.drawable.stephen, name = "Stephen Curry"),
        favoriteContact(image = R.drawable.mrbeat, name = "Mr Beast"),
        favoriteContact(image = R.drawable.zayn, name = "zayn malik"),
        favoriteContact(image = R.drawable.lebron, name = "Lebron James"),

        )




    Column(modifier = Modifier.padding(start = 16.dp, bottom = 8.dp)) {

        Text(text ="Favorites",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 8.dp)
            )

        Row(modifier = Modifier.fillMaxWidth().horizontalScroll(rememberScrollState())){



            sampleFavorites.forEach { favoritem(it) }
        }



    }
}

data class favoriteContact(
    val image: Int,
    val name: String
)