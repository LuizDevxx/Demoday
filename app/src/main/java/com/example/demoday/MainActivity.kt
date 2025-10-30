package com.example.demoday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.demoday.ui.theme.DemodayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DemodayTheme {
                val navController = rememberNavController()

                NavHost(
                    navController = navController,
                    startDestination = "inicio"
                ) {
                    composable("inicio") {
                        Inicio(navController)
                    }
                    composable("tela_dois") {
                        TelaDois(navController)
                    }
                    composable("tela_login") {
                        Login(navController)
                    }
                    composable("registre-se") {
                        Registrando(navController)
                    }
                    composable("home") {
                        Home()
                    }
                }
            }
        }
    }
}

@Composable
fun Inicio(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.bananeira),
            contentDescription = "Foto de fundo",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.logofolha),
                contentDescription = "Logo parte da folha",
                modifier = Modifier
                    .size(100.dp)
                    .clickable {
                        navController.navigate("tela_dois")
                    }
            )

            Image(
                painter = painterResource(id = R.drawable.logomaos),
                contentDescription = "Logo parte da mao",
                modifier = Modifier
                    .size(170.dp)
                    .offset(y = -30.dp)
                    .clickable {
                        navController.navigate("tela_dois")
                    }
            )

            Row (){
                Image(
                    painter = painterResource(R.drawable.aurum),
                    contentDescription = "Aurum logo",
                    modifier = Modifier
                        .offset(y = -31.dp)
                        .clickable{
                            navController.navigate("tela_dois")
                        }
                )
                Spacer(modifier = Modifier.width(15.dp))
                Image(
                    painter = painterResource(R.drawable._bano),
                    contentDescription = "Ébano logo",
                    modifier = Modifier
                        .offset(y = -41.dp)
                        .clickable{
                            navController.navigate("tela_dois")
                        }
                )
            }
        }
    }
}


