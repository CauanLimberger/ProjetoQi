package com.cauanlimberger.projetol

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun viewScreen(navController: NavController
){

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Scaffold(
            modifier = Modifier,
            floatingActionButton = {
                Column {
                    FloatingActionButton(
                        onClick = {
                            navController.navigate("Delete_Screen") // Navigate to pag2 screen
                        },//*todo*//
                        shape = CircleShape,
                        contentColor = Color.White
                    ) {
                        Image(
                            modifier = Modifier
                                .size(50.dp)
                               ,
                            painter = painterResource(id = R.drawable.floataction),
                            contentDescription = ""
                        )
                    }
                }
            },
            floatingActionButtonPosition = FabPosition.End,
            topBar = {
                TopAppBar(
                    title = { Text(text = "Gerenciador de Stock") }
                )
            },
            bottomBar = {

                @Composable
                fun BottomNavigationItem(
                    selected: Boolean,
                    onClick: () -> Unit,
                    icon: @Composable () -> Unit
                ) {
                    // Implementação da lógica do item de navegação inferior aqui
                    // Por exemplo, você pode usar um ícone e adicionar um clique para navegar para outra tela
                    IconButton(onClick = onClick) {
                        icon()
                    }
                }



            }
        ) {
            SearchScreen(navController)
        }
    }
}


