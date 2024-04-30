package com.cauanlimberger.projetol

import android.net.Uri
import androidx.activity.result.contract.ActivityResultContract
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.activity.compose.rememberLauncherForActivityResult as rememberLauncherForActivityResult1

@Composable
fun CreateScreen(navController: NavController){

    var nome by remember {
        mutableStateOf("")
    }
    var preco by remember {
        mutableStateOf("")
    }
    var descricao by remember {
        mutableStateOf("")
    }
    Box(contentAlignment = Alignment.Center, modifier =  Modifier.fillMaxSize()) {


        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(id = R.drawable.design_sem_nome),
                contentDescription = "Imagem"
            )
            TextField(
                value = nome,
                onValueChange = { nome = it },
                modifier = Modifier.padding(20.dp),
                label = { Text("nome do produto") }

            )
            TextField(
                value = descricao,
                onValueChange = { descricao = it },
                modifier = Modifier.padding(20.dp),
                label = {
                    Text("Descricao")
                }
            )

            TextField(
                value = preco,
                onValueChange = {preco = it},
                modifier = Modifier.padding(20.dp),
                label = { Text("definir preco") }
            )
            Button(onClick = {
                             navController.navigate("Main_Screen")

            }, modifier = Modifier.padding(30.dp)
            ) {
                Text("adicionar Produto")
            }
        }
    }
}

