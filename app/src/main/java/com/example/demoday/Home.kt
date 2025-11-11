package com.example.demoday

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

val BegeEscuro = Color(0xFFD2B48C)
val VerdeOliva = Color(0xFF708238)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Home(navController: NavController) {
    var searchText by remember { mutableStateOf("") }

    Scaffold(
        topBar = {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(VerdeOliva)
                    .padding(horizontal = 40.dp, vertical = 8.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(R.drawable.aurum),
                        contentDescription = "Aurum",
                        modifier = Modifier
                            .size(100.dp)
                            .offset(y = 3.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Image(
                        painter = painterResource(R.drawable._bano),
                        contentDescription = "Ébano",
                        modifier = Modifier.size(100.dp)
                    )
                }
                TextField(
                    value = searchText,
                    onValueChange = { searchText = it },
                    placeholder = { Text("Pesquisar...") },
                    leadingIcon = {
                        Icon(
                            Icons.Default.Search,
                            contentDescription = "Buscar",
                            tint = VerdeOliva
                        )
                    },
                    modifier = Modifier
                        .fillMaxWidth(0.85f)
                        .height(50.dp),
                    shape = RoundedCornerShape(12.dp),
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = Color.White,
                        unfocusedContainerColor = Color.White,
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent
                    )
                )
            }
        },

        // 🔻 Bottom bar
        bottomBar = {
            NavigationBar(
                containerColor = Color(0xFF8B7D6B),
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
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(BegeEscuro)
                .padding(innerPadding)
                .padding(horizontal = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(16.dp))
            Carrossel()
        }
    }
}

@Composable
fun Carrossel() {
    val pagerState = rememberPagerState { 4 }
    val pagerItems = listOf(
        R.drawable.natureza,
        R.drawable.black,
        R.drawable.modelonatureza,
        R.drawable.modelo
    )

    HorizontalPager(
        state = pagerState,
        pageSize = PageSize.Fill,
        contentPadding = PaddingValues(horizontal = 22.dp),
        modifier = Modifier.fillMaxWidth()
    ) { page ->
        Image(
            painter = painterResource(pagerItems[page]),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(350.dp)
                .clip(RoundedCornerShape(30.dp))
                .padding(5.dp),
            contentScale = ContentScale.FillBounds
        )
    }
}
