package uk.ac.tees.mad.D3662700.routing

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import uk.ac.tees.mad.D3662700.ui.login.LoginScreen
import uk.ac.tees.mad.D3662700.ui.main.MainScreen
import uk.ac.tees.mad.D3662700.ui.quiz.QuizScreen
import uk.ac.tees.mad.D3662700.ui.register.RegisterScreen
import uk.ac.tees.mad.D3662700.ui.result.ResultScreen
import uk.ac.tees.mad.D3662700.ui.splash.SplashScreen

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
        composable(route = Screen.MainScreen.route+"/{option}") {
            val option = it.arguments?.getString("option")
            if (option != null) {
                MainScreen(navController = navController, option = option)
            }
        }
        composable(route = Screen.ResultScreen.route+"/{option}") {
            val option = it.arguments?.getString("option")
            if (option != null) {
                ResultScreen(navController = navController, option = option)
            }
        }
        composable(route = Screen.QuizScreen.route) {
            QuizScreen(navController = navController)
        }

    }

}