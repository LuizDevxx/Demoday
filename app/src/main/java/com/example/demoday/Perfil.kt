package com.example.demoday

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun Perfil(navController: NavController) {

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(120.dp)
                    .clip(CircleShape)
                    .background(Color(0xFF075501))
            ) {

            }
            Spacer(modifier = Modifier.width(12.dp))
            Text("Ana Carolina")
        }
        Spacer(modifier = Modifier.height(26.dp))

        Box(
            modifier = Modifier
                .height(250.dp)
                .width(320.dp)
                .clip(RoundedCornerShape(20.dp))
                .background(Color(0xFF075501))
                .padding(24.dp)
            ,
            contentAlignment = Alignment.TopEnd
        ) {
            Column {
                Text("Privacidade & Segurança",
                    fontSize = 20.sp,
                   color =  Color.White
                    )
                Spacer(modifier = Modifier.height(16.dp))

                Text("Meus Dados",
                    fontSize = 20.sp,
                    color =  Color.White)
                Spacer(modifier = Modifier.height(16.dp))

                Text("Meus Cartões",
                    fontSize = 20.sp,
                    color =  Color.White)
                Spacer(modifier = Modifier.height(16.dp))

                Text("Acessibilidade",
                    fontSize = 20.sp,
                    color =  Color.White)
                Spacer(modifier = Modifier.height(16.dp))

                Text("Suporte",
                    fontSize = 20.sp,
                    color =  Color.White)
                Spacer(modifier = Modifier.height(8.dp))

            }
        }
        Text("Sair da conta")


    }
}