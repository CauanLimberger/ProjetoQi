package com.cauanlimberger.projetol

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.google.android.gms.analytics.ecommerce.Product

@Composable
fun EditScreen(navController: NavController
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        androidx.compose.material3.TextField(
           value = "digite o novo preco",
            onValueChange = {

            }
        )

        Button(
            onClick = { navController.navigate("Main_Screen")},
            Modifier.align(Alignment.CenterHorizontally)



        ) {
            Text(text = "finalizar")

        }


        Button(
            onClick = { navController.navigate("Delete_Screen")},
            Modifier.align(Alignment.CenterHorizontally)



        ) {
            Text(text = "Excluir")

        }
        // Campos de entrada para editar os detalhes do produto

        // Adicione mais campos de entrada conforme necessário

        // Botão para salvar as alterações

    }

}

private fun Any.navigate(s: String) {
    TODO("Not yet implemented")
}

fun TextField(value: Product, onValueChange: () -> Unit) {

}
