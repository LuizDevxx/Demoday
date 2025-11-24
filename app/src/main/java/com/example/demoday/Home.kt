package com.example.demoday

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Home(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize()) {
        Scaffold(
            topBar = { CustomTopBar() },
            containerColor = Color.White // deixa a tela inteira branca

        ) { padding ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(padding)
                    .padding(horizontal = 20.dp)
                    .verticalScroll(rememberScrollState()),
                verticalArrangement = Arrangement.Top
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column(
                        verticalArrangement = Arrangement.spacedBy(8.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Box(
                            modifier = Modifier
                                .size(90.dp)
                                .clip(RoundedCornerShape(topEnd = 50.dp, bottomStart = 50.dp))
                                .background(Color(0xFFFCD755)),
                            contentAlignment = Alignment.Center

                        ) {
                            Image(
                                painter = painterResource(R.drawable.ecommerce),
                                contentDescription = "Ecomerce",
                                modifier = Modifier
                                    .size(70.dp)
                                    .fillMaxSize(),
                                contentScale = ContentScale.Crop

                            )

                        }
                        Text("E-commerce", fontSize = 12.sp)
                    }

                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Box(
                            modifier = Modifier
                                .size(90.dp)
                                .clip(RoundedCornerShape(topEnd = 50.dp, bottomStart = 50.dp))
                                .background(Color(0xFF075501)),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(R.drawable.unaia),
                                contentDescription = "Una inteligencia artificial",
                                modifier = Modifier
                                    .size(70.dp)
                                    .fillMaxSize(),
                                contentScale = ContentScale.Crop

                            )
                        }
                        Text("Una", fontSize = 12.sp)
                        Text("Sua assistente virtual", fontSize = 12.sp)
                    }

                    Column(
                        verticalArrangement = Arrangement.spacedBy(8.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Box(
                            modifier = Modifier
                                .size(90.dp)
                                .clip(RoundedCornerShape(topEnd = 50.dp, bottomStart = 50.dp))
                                .background(Color(0xFF2A2D74)),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(R.drawable.gotanamao),
                                contentDescription = "Una inteligencia artificial",
                                modifier = Modifier
                                    .size(70.dp)
                                    .fillMaxSize(),
                                contentScale = ContentScale.Crop

                            )
                        }
                        Text("Tutorial", fontSize = 12.sp)
                    }
                }

                Spacer(modifier = Modifier.height(24.dp))

                Text("Recentes", color = Color.Black, fontSize = 26.sp)
                Spacer(modifier = Modifier.height(12.dp))
                Carrossel()
                Spacer(modifier = Modifier.height(12.dp))

                Text("Área de compra", color = Color.Black, fontSize = 26.sp)

                repeat(3) {
                    Spacer(modifier = Modifier.height(12.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(12.dp) // espaçamento entre os cards
                    ) {
                        ProdutoCard(
                            imagem = R.drawable.gotas,
                            nome = "Gotas Essenciais",
                            preco = "R$ 29,90",
                            modifier = Modifier.weight(1f) // ocupa metade da Row
                        )
                        ProdutoCard(
                            imagem = R.drawable.creme,
                            nome = "Creme Hidratante",
                            preco = "R$ 49,90",
                            modifier = Modifier.weight(1f) // ocupa metade da Row
                        )
                    }
                }
            }
        }
        BottomFloatingBar(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 50.dp),
            navController
        )
    }
}

    @Composable
    fun CustomTopBar() {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(90.dp)
                .padding(top = 30.dp, start = 22.dp, end = 22.dp) // ⬅️ aqui
                .background(Color.Transparent),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Icon(
                imageVector = Icons.Default.Menu,
                contentDescription = "Menu",
                tint = Color.Black,
                modifier = Modifier
                    .size(30.dp)
                    .offset(x = 12.dp)
            )

            Image(
                painter = painterResource(id = R.drawable.aurum_banoverde_removebg_preview),
                contentDescription = "Logo",
                modifier = Modifier
                    .height(150.dp)
                    .width(150.dp)
            )

            Icon(
                imageVector = Icons.Default.ShoppingCart,
                contentDescription = "Perfil",
                tint = Color.Black,
                modifier = Modifier.size(30.dp)
            )
        }
    }


@Composable
fun BottomFloatingBar(modifier: Modifier = Modifier,navController: NavController) {
    val verdeTransparente = Color(0xFF7C9969).copy(alpha = 0.7f)

    Row(
        modifier = modifier
            .clip(RoundedCornerShape(50))
            .background(verdeTransparente)
            .width(250.dp)
            .height(70.dp)
            .padding(horizontal = 30.dp, vertical = 12.dp),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = Icons.Default.Home,
            contentDescription = null,
            tint = Color.White,
            modifier = Modifier.size(36.dp)
        )
        Spacer(modifier = Modifier.width(40.dp))
        Icon(
            imageVector = Icons.Default.ThumbUp,
            contentDescription = null,
            tint = Color.White,
            modifier = Modifier.size(36.dp)
        )
        Spacer(modifier = Modifier.width(40.dp))
        Icon(
            imageVector = Icons.Default.Person,
            contentDescription = null,
            tint = Color.White,
            modifier = Modifier
                .size(36.dp)
                .clickable{
                    navController.navigate("perfil")
                }
        )
    }
}

@Composable
fun Carrossel() {
    val pagerState = rememberPagerState { 4 }

    val pagerItems = listOf(
        R.drawable.gotas,
        R.drawable.oleolaranja,
        R.drawable.creme,
        R.drawable.modelo
    )

    val titles = listOf(
        "Gotas Essenciais",
        "Óleo de Laranja",
        "Creme Hidratante",
        "Modelo / Estética"
    )

    HorizontalPager(
        state = pagerState,
        pageSize = PageSize.Fill,
        contentPadding = PaddingValues(horizontal = 22.dp),
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
    ) { page ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .clip(RoundedCornerShape(30.dp))
                .padding(5.dp)
        ) {
            Image(
                painter = painterResource(pagerItems[page]),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxSize()
                    .clip(RoundedCornerShape(30.dp)),
                contentScale = ContentScale.FillBounds
            )

            Text(
                text = titles[page],
                color = Color.Black,
                fontSize = 22.sp,
                modifier = Modifier
                    .align(Alignment.BottomStart)
                    .padding(16.dp)
            )
        }
    }
}
