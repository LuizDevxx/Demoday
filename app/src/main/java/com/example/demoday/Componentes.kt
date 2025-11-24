package com.example.demoday

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CampoPadrao(
    valor: String,
    onValorChange: (String) -> Unit,
    label: String
) {
    TextField(
        value = valor,
        onValueChange = onValorChange,
        label = { Text(label) },
        shape = RoundedCornerShape(16.dp),
        modifier = Modifier.width(300.dp)
    )

}

@Composable
fun BotaoPadrao(
    texto: String,
    onClick: () -> Unit,
    corFundo: Color = Color(0xFF1B5E20),
    corTexto: Color = Color.White,
    largura: Dp = 200.dp
) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(containerColor = corFundo),
        modifier = Modifier.width(largura)
    ) {
        Text(
            text = texto,
            color = corTexto
        )
    }
}
@Composable
fun ProdutoCard(
    imagem: Int,
    nome: String,
    preco: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .clip(RoundedCornerShape(20.dp))
            .background(Color(0xFF1E1E1E))
            .padding(8.dp)
    ) {
        Image(
            painter = painterResource(imagem),
            contentDescription = nome,
            modifier = Modifier
                .fillMaxWidth()
                .height(120.dp)
                .clip(RoundedCornerShape(15.dp)),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(text = nome, fontSize = 16.sp, color = Color.White)
        Text(text = preco, fontSize = 14.sp, color = Color(0xFFFFD700))
    }
}
