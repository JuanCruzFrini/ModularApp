package com.example.help.ui.view

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign


@Composable
internal fun HelpScreen() {
    Box(modifier = Modifier.fillMaxSize()){
        Text(textAlign = TextAlign.Center, text = "HelpScreen")
    }
}