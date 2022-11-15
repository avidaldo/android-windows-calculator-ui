package com.example.calculadorawindows

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.calculadorawindows.ui.theme.*

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            CalculadoraWindowsContent()
        }
    }

}


@Preview(showSystemUi = true)
@Composable
private fun CalculadoraWindowsContent() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Fondo)
            .padding(2.dp),
    ) {

        DisplayCalculadora(Modifier.weight(3f))
        Row(modifier = Modifier
            .fillMaxWidth()
            .weight(0.66f)) {
            BotonCalculadora(text = "MC", Modifier.weight(1f), color = Fondo)
            BotonCalculadora(text = "MR", Modifier.weight(1f), color = Fondo)
            BotonCalculadora(text = "M+", Modifier.weight(1f), color = Fondo)
            BotonCalculadora(text = "M-", Modifier.weight(1f), color = Fondo)
            BotonCalculadora(text = "MS", Modifier.weight(1f), color = Fondo)
            BotonCalculadora(text = "M\u25BE", Modifier.weight(1f), color = Fondo)
        }
        Row(modifier = Modifier
            .fillMaxWidth()
            .weight(1f)) {
            BotonCalculadora(text = "%", Modifier.weight(1f), color = GrisOscuro)
            BotonCalculadora(text = "CE", Modifier.weight(1f), color = GrisOscuro)
            BotonCalculadora(text = "C", Modifier.weight(1f), color = GrisOscuro)
            BotonCalculadora(text = "\u232B", Modifier.weight(1f), color = GrisOscuro)
        }
        Row(modifier = Modifier
            .fillMaxWidth()
            .weight(1f)) {
            BotonCalculadora(text = "1/x", Modifier.weight(1f), color = GrisOscuro)
            BotonCalculadora(text = "x\u00B2", Modifier.weight(1f), color = GrisOscuro)
            BotonCalculadora(text = "\u221A", Modifier.weight(1f), color = GrisOscuro)
            BotonCalculadora(text = "/", Modifier.weight(1f), color = GrisOscuro)
        }
        Row(modifier = Modifier
            .fillMaxWidth()
            .weight(1f)) {
            BotonCalculadora(text = "7", Modifier.weight(1f))
            BotonCalculadora(text = "8", Modifier.weight(1f))
            BotonCalculadora(text = "9", Modifier.weight(1f))
            BotonCalculadora(text = "X", Modifier.weight(1f), color = GrisOscuro)
        }
        Row(modifier = Modifier
            .fillMaxWidth()
            .weight(1f)) {
            BotonCalculadora(text = "4", Modifier.weight(1f))
            BotonCalculadora(text = "5", Modifier.weight(1f))
            BotonCalculadora(text = "6", Modifier.weight(1f))
            BotonCalculadora(text = "-", Modifier.weight(1f), color = GrisOscuro)
        }
        Row(modifier = Modifier
            .fillMaxWidth()
            .weight(1f)) {
            BotonCalculadora(text = "1", Modifier.weight(1f))
            BotonCalculadora(text = "2", Modifier.weight(1f))
            BotonCalculadora(text = "3", Modifier.weight(1f))
            BotonCalculadora(text = "+", Modifier.weight(1f), color = GrisOscuro)
        }
        Row(modifier = Modifier
            .fillMaxWidth()
            .weight(1f)) {
            BotonCalculadora(text = "+/-", Modifier.weight(1f))
            BotonCalculadora(text = "0", Modifier.weight(1f))
            BotonCalculadora(text = ",", Modifier.weight(1f))
            BotonCalculadora(text = "=", Modifier.weight(1f), color = AzulIgual)
        }
    }
}

@Composable
fun DisplayCalculadora(
    modifier: Modifier,
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Fondo)
            .padding(start = 20.dp, end = 20.dp, top = 40.dp, bottom = 20.dp),
        contentAlignment = Alignment.BottomEnd,
    )
    {
        Text(text = "0",
            textAlign = TextAlign.End,
            color = ColorLetras,
            fontSize = 50.sp,
            fontWeight = FontWeight.Bold)
    }
}

@Composable
fun BotonCalculadora(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = Negro,
    onClick: () -> Unit = {
        Log.d("---", text)
    },
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize()
            .border(width = 1.dp, color = Fondo)
            .background(color)
            .clickable { onClick() }
            .then(modifier)
    ) {
        Text(text = text, fontSize = 25.sp, color = ColorLetras)
    }

}
