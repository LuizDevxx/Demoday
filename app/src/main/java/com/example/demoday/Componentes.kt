package com.example.demoday

import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

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
