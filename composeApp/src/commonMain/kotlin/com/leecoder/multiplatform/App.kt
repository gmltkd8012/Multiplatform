package com.leecoder.multiplatform

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.leecoder.multiplatform.theme.AppTheme
import com.leecoder.multiplatform.theme.AppTypography

@Composable
fun App() {
    AppTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            var count by remember { mutableStateOf(0) }

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Compose Multiplatform!",
                    style = AppTypography.h1,
                )

                Text(
                    text = "Hello, Compose Multiplatform!",
                    style = AppTypography.t1,
                    modifier = Modifier.padding(top = 16.dp)
                )

                Text(
                    text = "Platform: ${getPlatformName()}",
                    style = AppTypography.b1,
                    modifier = Modifier.padding(top = 16.dp)
                )

                Text(
                    text = "Count: $count",
                    style = AppTypography.b1,
                    modifier = Modifier.padding(top = 24.dp)
                )

                Button(
                    onClick = { count++ },
                    modifier = Modifier.padding(top = 16.dp)
                ) {
                    Text("버튼")
                }
            }
        }
    }
}
