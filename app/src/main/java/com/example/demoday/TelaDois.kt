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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun TelaDois(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.bananeira),
            contentDescription = "Foto de fundo",
            modifier = Modifier
                .fillMaxSize()
                .blur(5.dp)
                .graphicsLayer { alpha = 0.9f },
            contentScale = ContentScale.Crop
        )

        Box(
            modifier = Modifier
                .fillMaxSize()
                .graphicsLayer { alpha = 0.6f }
                .background(Color.Black.copy(alpha = 0.8f))
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(30.dp)
                .offset(y = (-80).dp),
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "O cuidado da\nNatureza em\ncada gota.\nOuro para a\nbeleza, ébano\npara a essência.",
                color = Color.White,
                fontSize = 40.sp,
                lineHeight = 40.sp
            )
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 200.dp)
                .align(Alignment.BottomCenter),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                BotaoPadrao(texto = "Entrar", onClick = {
                    navController.navigate("tela_login")
                })

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    "Criar conta?",
                    color = Color.White,
                    fontSize = 18.sp,
                    modifier = Modifier
                        .clickable{
                            navController.navigate("registre-se")
                        }
                )
            }
        }
    }
}