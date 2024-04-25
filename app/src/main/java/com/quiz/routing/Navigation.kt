package com.quiz.routing

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.quiz.ui.login.LoginScreen
import com.quiz.ui.main.MainScreen
import com.quiz.ui.quiz.QuizScreen
import com.quiz.ui.register.RegisterScreen
import com.quiz.ui.result.ResultScreen
import com.quiz.ui.splash.SplashScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Navigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.SplashScreen.route
    ) {
        composable(route = Screen.SplashScreen.route) {
            SplashScreen(navController = navController)
        }
        composable(route = Screen.LoginScreen.route) {
            LoginScreen(navController = navController)
        }
        composable(route = Screen.RegisterScreen.route) {
            RegisterScreen(navController = navController)
        }
        composable(route = Screen.MainScreen.route) {
            MainScreen(navController = navController)
        }
        composable(route = Screen.ResultScreen.route) {
            ResultScreen(navController = navController)
        }
        composable(route = Screen.QuizScreen.route) {
            QuizScreen(navController = navController)
        }

    }

}