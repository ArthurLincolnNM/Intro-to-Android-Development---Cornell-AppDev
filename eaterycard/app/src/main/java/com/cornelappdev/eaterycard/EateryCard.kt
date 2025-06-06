package com.cornelappdev.eaterycard

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun EateryCard(){
    Surface(
        color = Color.White,
        shadowElevation = 4.dp,
        shape = RoundedCornerShape(12.dp),
        modifier = Modifier.height(220.dp).fillMaxWidth()

    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            Box(modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .background(
                    color = Color(0xff5ecfdb)
            ))
            Box(modifier = Modifier.weight(1f)) {
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxWidth().padding(24.dp)
                ) {
                    Column {
                        Text(
                            text = "Okenshields",
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = "Itchacas",
                            fontSize = 16.sp
                        )
                        Text(
                            text = "Accepts: BRBs",
                            fontSize = 16.sp
                        )
                    }
                    Text(
                        text = "Open",
                        fontWeight = FontWeight.Bold,
                        color = Color.Green
                    )
                }
            }
        }
    }
}

@Preview
@Composable
private fun EateryCardPreview() {
    EateryCard()
}