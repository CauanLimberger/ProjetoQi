package com.cauanlimberger.projetol

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun DeleteScreen(navController: NavController){
    Box(
        modifier = Modifier.fillMaxSize().padding(50.dp),contentAlignment = Alignment.TopCenter,
    ) { Column {
        Text(

            text = "Você Deseja Mesmo Excluir este item? Saiba que esta alterção é irreversivel.")

    }





    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(60.dp),
        contentAlignment = Alignment.Center
    ) {
        Button(
            onClick = { navController.navigate("Main_Screen")},
            modifier = Modifier
                .padding(30.dp)

                .fillMaxWidth()
        ) {
            Text(text = "Não excluir")

        }
    }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(60.dp),
        contentAlignment = Alignment.BottomCenter
    ) {
        Button(
            onClick = {  navController.navigate("Main_Screen") },
            modifier = Modifier
                .padding(30.dp)
                .fillMaxWidth()
        ) {
            Text(text = "Sim excluir")

        }
    }



}


