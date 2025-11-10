package com.example.demoday

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun Registrando(navController: NavController) {
    var nome by remember { mutableStateOf("") }
    var identificacao by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var senha by remember { mutableStateOf("") }


    Box(
        modifier = Modifier.fillMaxSize()
    ){
        Image(
            painter = painterResource(R.drawable.folha_duplicada_removebg_preview),
            contentDescription = "foto folhas ",
            modifier = Modifier
                .align (Alignment.TopEnd)
                .size(700.dp),
            contentScale = ContentScale.FillBounds

        )
    }

    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(30.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(12.dp, Alignment.CenterVertically)

        ) {

            Text(
                "Registre-se",
                fontSize = 30.sp,
                color = Color(0xFF1B5E20)
            )
            Text(
                "Crie sua conta",
                color = Color(0xFF1B5E20),
                fontSize = 18.sp,

            )

            Spacer(modifier = Modifier.height(8.dp))

            CampoPadrao(valor = nome, onValorChange = { nome = it }, label = "Nome Completo")
            CampoPadrao(valor = identificacao, onValorChange = { identificacao = it }, label = "CPF/CNPJ")
            CampoPadrao(valor = email, onValorChange = { email = it }, label = "E-mail")
            CampoPadrao(valor = senha, onValorChange = { senha = it }, label = "Senha")

            Spacer(modifier = Modifier.height(8.dp))

            Button(onClick = {

            }) { Text("Cadastrar")}

        }
    }
    Box(
        modifier = Modifier.fillMaxSize()
    ){
        Image(
            painter = painterResource(R.drawable.folha_cortada_removebg_preview),
            contentDescription = "Foto de uma folha",
            modifier = Modifier
                .align  (Alignment.BottomStart)
                .width(500.dp)
                .size(300.dp),
                  contentScale = ContentScale.FillBounds

        )
    }

}