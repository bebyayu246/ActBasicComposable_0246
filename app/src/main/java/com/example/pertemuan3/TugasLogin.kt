package com.example.pertemuan3

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun KelasLogin() {
    Box(
        modifier = Modifier.fillMaxSize()
    ){
        Image(
            painter = painterResource(id = R.drawable.background),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            Text(
                text = "Login",
                fontSize = 36.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Ini adalah halaman login,",
                fontSize = 18.sp
            )
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "Logo",
                modifier = Modifier.size(150.dp)
            )
            Text(
                text = "Nama",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Beby Ayu Verananda",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "20240140246",
                fontSize = 26.sp,
                fontWeight = FontWeight.Bold
            )

        }
