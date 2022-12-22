package com.example.calculadorawindows

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.calculadorawindows.ui.theme.CalculadoraWindowsTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            CalculadoraWindowsTheme {
                CalculadoraWindowsContent()
            }
        }
    }

}


@Preview(showSystemUi = true)
@Composable
private fun CalculadoraWindowsContent() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.onBackground)
            .padding(2.dp),
    ) {

        DisplayCalculadora(Modifier.weight(3f))
        Row(modifier = Modifier
            .fillMaxWidth()
            .weight(0.66f)) {
            BotonCalculadora(text = "MC", color = MaterialTheme.colorScheme.onBackground)
            BotonCalculadora(text = "MR", color = MaterialTheme.colorScheme.onBackground)
            BotonCalculadora(text = "M+", color = MaterialTheme.colorScheme.onBackground)
            BotonCalculadora(text = "M-", color = MaterialTheme.colorScheme.onBackground)
            BotonCalculadora(text = "MS", color = MaterialTheme.colorScheme.onBackground)
            BotonCalculadora(text = "M\u25BE", color = MaterialTheme.colorScheme.onBackground)
        }
        Row(modifier = Modifier
            .fillMaxWidth()
            .weight(1f)) {
            BotonCalculadora(text = "%", color = MaterialTheme.colorScheme.secondary)
            BotonCalculadora(text = "CE", color = MaterialTheme.colorScheme.secondary)
            BotonCalculadora(text = "C", color = MaterialTheme.colorScheme.secondary)
            BotonCalculadora(text = "\u232B", color = MaterialTheme.colorScheme.secondary)
        }
        Row(modifier = Modifier
            .fillMaxWidth()
            .weight(1f)) {
            BotonCalculadora(text = "1/x", color = MaterialTheme.colorScheme.secondary)
            BotonCalculadora(text = "x\u00B2", color = MaterialTheme.colorScheme.secondary)
            BotonCalculadora(text = "\u221A", color = MaterialTheme.colorScheme.secondary)
            BotonCalculadora(text = "/", color = MaterialTheme.colorScheme.secondary)
        }
        Row(modifier = Modifier
            .fillMaxWidth()
            .weight(1f)) {
            BotonCalculadora(text = "7")
            BotonCalculadora(text = "8")
            BotonCalculadora(text = "9")
            BotonCalculadora(text = "X", color = MaterialTheme.colorScheme.secondary)
        }
        Row(modifier = Modifier
            .fillMaxWidth()
            .weight(1f)) {
            BotonCalculadora(text = "4")
            BotonCalculadora(text = "5")
            BotonCalculadora(text = "6")
            BotonCalculadora(text = "-", color = MaterialTheme.colorScheme.secondary)
        }
        Row(modifier = Modifier
            .fillMaxWidth()
            .weight(1f)) {
            BotonCalculadora(text = "1")
            BotonCalculadora(text = "2")
            BotonCalculadora(text = "3")
            BotonCalculadora(text = "+", color = MaterialTheme.colorScheme.secondary)
        }
        Row(modifier = Modifier
            .fillMaxWidth()
            .weight(1f)) {
            BotonCalculadora(text = "+/-")
            BotonCalculadora(text = "0")
            BotonCalculadora(text = ",")
            BotonCalculadora(text = "=", color = MaterialTheme.colorScheme.tertiary)
        }
    }
}



