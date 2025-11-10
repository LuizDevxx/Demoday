package com.example.demoday

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

val BegeEscuro = Color(0xFFD2B48C)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Home(navController: NavController) {
    var searchText by remember { mutableStateOf("") }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Image(
                                painter = painterResource(R.drawable.aurum),
                                contentDescription = "Aurum",
                                modifier = Modifier
                                    .offset(y = 8.dp)
                            )
                            Spacer(modifier = Modifier.width(12.dp))
                            Image(
                                painter = painterResource(R.drawable._bano),
                                contentDescription = "Ébano",
                            )
                        }
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = BegeEscuro,
                    titleContentColor = Color.White
                )
            )
        },

        bottomBar = {
            NavigationBar(
                containerColor = BegeEscuro,
                contentColor = Color.White
            ) {
                NavigationBarItem(
                    selected = true,
                    onClick = { /* TODO */ },
                    icon = { Icon(Icons.Default.Home, contentDescription = "Home") },
                    label = { Text("Home") }
                )
                NavigationBarItem(
                    selected = false,
                    onClick = { /* TODO */ },
                    icon = { Icon(Icons.Default.Search, contentDescription = "Buscar") },
                    label = { Text("Buscar") }
                )
                NavigationBarItem(
                    selected = false,
                    onClick = { /* TODO */ },
                    icon = { Icon(Icons.Default.Person, contentDescription = "Perfil") },
                    label = { Text("Perfil") }
                )
            }
        }
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(BegeEscuro)
                .padding(innerPadding)
                .padding(16.dp),
            contentAlignment = Alignment.TopCenter
        ) {
            TextField(
                value = searchText,
                onValueChange = { searchText = it },
                placeholder = { Text("Pesquisar...") },
                modifier = Modifier
                    .width(280.dp)
                    .height(56.dp),
                shape = RoundedCornerShape(12.dp),
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color(0xFFF0F0F0),
                    unfocusedContainerColor = Color(0xFFF0F0F0),
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                )
            )
        }
    }
}
