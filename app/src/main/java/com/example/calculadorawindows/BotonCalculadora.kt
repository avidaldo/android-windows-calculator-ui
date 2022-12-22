package com.example.calculadorawindows

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun RowScope.BotonCalculadora(
    // (1)
    text: String,
    modifier: Modifier = Modifier,
    color: Color = MaterialTheme.colorScheme.background,
    onClick: () -> Unit = {
        Log.d("---", text)
    },
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .weight(1f)  // (1)
            .fillMaxSize()
            .border(width = 1.dp, color = MaterialTheme.colorScheme.onBackground)
            .background(color)
            .clickable { onClick() }
            .then(modifier)
    ) {
        Text(text = text, fontSize = 25.sp, color = MaterialTheme.colorScheme.onPrimary)
    }

}


/*
(1)
Para poder poner el peso dentro de la Box, necesitamos que este vaya a estar necesariamente dentro de
un scope que permita pesos. En este caso, definimos BotonCalculadora como una función de extensión de
la interfaz RowScope.
https://stackoverflow.com/a/67209639/12270705

Kotlin permite extender clases o interfaces sin necesidad de heredar de ellas. Simplemente de define
una nueva función como perteneciente a la clase que se quiere extender. En este caso, extendemos
RowScope añadiéndole una función nueva, pero que pertenecerá a esta interfaz.
 */