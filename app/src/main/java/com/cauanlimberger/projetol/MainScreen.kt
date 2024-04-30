package com.cauanlimberger.projetol

import android.annotation.SuppressLint
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(navController: NavController){
    var searchText by remember { mutableStateOf("") }
    Box(
        modifier = Modifier.fillMaxSize()
    )
    {
        Scaffold(
            modifier = Modifier,
            floatingActionButton = {
                Box {

                    FloatingActionButton(
                        onClick = {
                            navController.navigate("Create_Screen") // Navigate to pag2 screen
                        },//*todo*//
                        shape = CircleShape,
                        contentColor = Color.White
                    )
                    {
                        Image(
                            modifier = Modifier
                                .size(50.dp)
                                .align(Alignment.Center),
                            painter = painterResource(id = R.drawable.floataction),
                            contentDescription = ""
                        )
                    }

                }


            },

            floatingActionButtonPosition = FabPosition.End,
            topBar = {

                Button(
                    onClick = {
                        navController.navigate("Edit_Screen")
                    },
                    modifier = Modifier.padding(top = 50.dp).padding(horizontal = 135.dp, 20.dp),

                ){
                    Text("Editar Produto")
                }
                TopAppBar(
                    title = { Text(text = "Gerenciador de Stock") }
                )

            },
            bottomBar = {}



        ) {
            SearchScreen(navController)
        }
    }
}


@Composable
fun BottomNavigationItem(selected: Boolean, onClick: () -> Unit, icon: () -> Unit) {
    TODO("Not yet implemented")
}

@Composable
fun BottomNavigation(backgroundColor: Color, contentColor: Color, content: @Composable () -> Unit) {
    TODO("Not yet implemented")
}


@Composable
fun SearchScreen(navController: NavController) {
    var searchText by remember { mutableStateOf("") }


    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Row(
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            TextField(
                value = searchText,
                onValueChange = { searchText = it },
                modifier = Modifier.weight(1f),
                label = { Text("Pesquisar no Stock") }
            )
            Button(
                onClick = {
                    // Perform search operation using the searchText value
                },
                modifier = Modifier.padding(start = 8.dp)
            ) {
                Text("Buscar")
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState())
        ) {
            Column(
                modifier = Modifier
                    .align(Alignment.CenterStart) // Align the column to the start
            ) {
                ImageWithDescription(
                    image = R.drawable.broca,
                    title = "Furadeira a Bateria Dtools",
                    description = "R$ 140,99",
                    additionalText = "Sem Estoque"

                )

                ImageWithDescription(
                    image = R.drawable.phillips,
                    title = "Chave Philips Dtools",
                    description = "R$ 14,29",
                    additionalText = "Un: 214"
                )

                ImageWithDescription(
                    image = R.drawable.motoserra,
                    title = "MotoSerra do Jason",
                    description = "R$ 440,98",
                    additionalText = "Un: 18"
                )

                ImageWithDescription(
                    image = R.drawable.chaveestranha,
                    title = "Chave Estranha de Ferro",
                    description = "R$ 8,80",
                    additionalText = "Un: 318"
                )

            }
            
        }

    }
}

@Composable
fun ImageWithDescription(image: Int, title: String, description: String, additionalText: String) {
    Row(
        modifier = Modifier.padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Surface(
            shape = RoundedCornerShape(8.dp),
            border = BorderStroke(2.dp, Color.Black),
            modifier = Modifier.size(120.dp),
            color = Color.White
        ) {
            Image(
                painter = painterResource(id = image),
                contentDescription = null,
                modifier = Modifier.size(100.dp),
                contentScale = ContentScale.Crop
            )
        }
        Column (
            modifier = Modifier.padding(start = 16.dp)
        ) {
            Surface(
                shape = RoundedCornerShape(15.dp),
                border = BorderStroke(2.dp, Color.Black),
                modifier = Modifier.padding(bottom = 8.dp),
                color = Color.White
            ) {
                Text(
                    text = title,
                    style = MaterialTheme.typography.bodyLarge,
                    modifier = Modifier.padding(8.dp),
                    textAlign = TextAlign.Start
                )
            }
            Row {
                Surface(
                    shape = RoundedCornerShape(15.dp),
                    border = BorderStroke(2.dp, Color.Black),
                    modifier = Modifier.padding(end = 8.dp),
                    color = Color.White
                ) {
                    Text(
                        text = description,
                        style = MaterialTheme.typography.bodySmall,
                        modifier = Modifier.padding(8.dp),
                        textAlign = TextAlign.Start
                    )
                }

                Surface(
                    shape = RoundedCornerShape(15.dp),
                    border = BorderStroke(2.dp, Color.Black),
                    color = Color.White
                ) {
                    Text(
                        text = additionalText,
                        style = MaterialTheme.typography.bodySmall,
                        modifier = Modifier.padding(8.dp),
                        textAlign = TextAlign.Start
                    )
                }
            }
        }
    }
}

