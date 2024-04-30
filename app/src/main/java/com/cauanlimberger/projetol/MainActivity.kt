package com.cauanlimberger.projetol



import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


class MainActivity : ComponentActivity() {
    @ExperimentalMaterial3Api
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProjetoFinalTheme {
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    MainContent()
                }
            }
        }
    }
}
@SuppressLint("UnusedMaterialScaffoldPaddingParameter", "UnusedMaterial3ScaffoldPaddingParameter")
@ExperimentalMaterial3Api
@Composable
fun MainContent() {


    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "Main_screen"
    ) {
        composable("main_screen") {
            MainScreen(navController)



        }
        composable("Delete_Screen"){
            DeleteScreen(navController)
        }
        composable("view_Screen") {
            viewScreen(navController)
        }

        composable("create_Screen"){
            CreateScreen(navController)
        }
        composable("Edit_Screen"){
            EditScreen(navController)
        }
    }

}
