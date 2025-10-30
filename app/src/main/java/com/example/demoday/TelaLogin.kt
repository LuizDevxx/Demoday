package com.example.demoday

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun Login(navController: NavController) {
    var email by remember { mutableStateOf("") }
    var senha by remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(260.dp)
            .clip(RoundedCornerShape(bottomStart = 200.dp, bottomEnd = 200.dp)),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(R.drawable.bananeira),
            contentDescription = "Fundo bananeira",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize()

        )

        Row (
        ){
            Image(
                painter = painterResource(R.drawable.aurum),
                contentDescription = "Aurum logo",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .clickable{
                        navController.navigate("tela_dois")
                    }
            )
            Spacer(modifier = Modifier.width(15.dp))
            Image(
                painter = painterResource(R.drawable._bano),
                contentDescription = "Ébano logo",
                modifier = Modifier
                    .offset(y = -11.dp)
                    .clickable{
                        navController.navigate("tela_dois")
                    }
            )
        }
    }









    Box(modifier = Modifier.fillMaxSize()) {

        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(5.dp, Alignment.CenterVertically)

        ) {
            Spacer(modifier = Modifier.height(40.dp))
            Text(
                "Faça login na sua conta",
                fontSize = 25.sp,
                color = Color(0xFF1B5E20)

            )
            Spacer(modifier = Modifier.height(20.dp))

            CampoPadrao(email, { email = it }, "E-mail")

            Spacer(modifier = Modifier.height(8.dp))

            CampoPadrao(senha, { senha = it }, "Senha")
            Spacer(modifier = Modifier.height(50.dp))

            BotaoPadrao("Entrar", onClick = {
                navController.navigate("home")

            })
            Text(
                "Esqueceu a senha?",
                color = Color(0xFF66BB6A),
                fontSize = 18.sp,
                modifier = Modifier
                    .clickable{
                        navController.navigate("registre-se")
                    }
            )
        }
    }
}