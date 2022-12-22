package com.example.calculadorawindows

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DisplayCalculadora(
    modifier: Modifier,
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.secondary)
            .padding(start = 20.dp, end = 20.dp, top = 40.dp, bottom = 20.dp),
        contentAlignment = Alignment.BottomEnd,
    )
    {
        Text(text = "0",
            textAlign = TextAlign.End,
            color = MaterialTheme.colorScheme.onPrimary,
            fontSize = 50.sp,
            fontWeight = FontWeight.Bold)
    }
}