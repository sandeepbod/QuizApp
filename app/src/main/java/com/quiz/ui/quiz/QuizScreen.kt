package com.quiz.ui.quiz

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.rememberScaffoldState
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.quiz.R
import com.quiz.routing.Screen
import com.quiz.ui.drawer.DrawerBody
import com.quiz.ui.drawer.DrawerHeader
import com.quiz.ui.drawer.TopBar
import com.quiz.ui.localDatabase.PreferencesManager
import com.quiz.ui.theme.QuizAppTheme
import com.quiz.ui.theme.appColor
import com.quiz.ui.theme.white
import com.quiz.utils.GradientButton
import com.quiz.utils.RoundedButton
import kotlinx.coroutines.launch
import java.util.*

@OptIn(ExperimentalMaterial3Api::class, ExperimentalComposeUiApi::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter", "UnrememberedMutableState")
@Composable
fun QuizScreen(navController: NavController) {
    val context = LocalContext.current
    val preferenceManager = remember {
        PreferencesManager(context)
    }
    val scrollState = rememberScrollState()
    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()
    var showLogoutDialog by remember { mutableStateOf(false) }
    val list = arrayListOf<String>().apply {
        clear()
        add("Quiz 1")
        add("Quiz 2")
        add("Quiz 3")
        add("Quiz 4")
    }




    QuizAppTheme {
        androidx.compose.material.Scaffold(
            scaffoldState = scaffoldState,
            topBar = {
                TopBar(
                    navController = navController,
                    onNavigationIconClick = {
                        scope.launch {
                            scaffoldState.drawerState.open()
                        }
                    }
                )
            },
            modifier = Modifier.background(color = appColor),
            drawerContent = {
                DrawerHeader()
                DrawerBody(closeNavDrawer = {
                    scope.launch {
                        scaffoldState.drawerState.close()
                    }
                }, onLogout = {
                    showLogoutDialog = true
                    scope.launch {
                        scaffoldState.drawerState.close()
                    }
                })
            },
            backgroundColor = appColor,
            contentColor = appColor,
            drawerBackgroundColor = appColor
        ) { paddingValues ->
            Modifier.padding(
                bottom = paddingValues.calculateBottomPadding()
            )

            Column(
                modifier = Modifier
                    .background(color = appColor)
                    .verticalScroll(scrollState)
            ) {

                Spacer(Modifier.height(10.dp))

                Column {
                    list.forEachIndexed { parentIndex, quizModel ->
                        GradientButton(
                            onClick = {
                                navController.navigate(Screen.MainScreen.route)
                            },
                            modifier = Modifier.padding(vertical = 5.dp).fillMaxWidth(),
                            textColor = appColor,
                            isEnabled = true,
                            gradient = Brush.horizontalGradient(listOf(white, white)),
                            text = list[parentIndex]
                        )

                    }
                }
                Spacer(Modifier.height(10.dp))

            }
        }
        if (showLogoutDialog) {
            AlertDialog(
                onDismissRequest = {
                    showLogoutDialog = false
                },
                title = { Text("Logout") },
                text = { Text("Are you sure you want to logout?") },
                confirmButton = {
                    Button(
                        onClick = {
                            preferenceManager.saveData("isLogin", true)
                            navController.navigate(
                                Screen.LoginScreen.route
                            ) {
                                popUpTo(Screen.MainScreen.route) {
                                    inclusive = true
                                }
                            }
                            showLogoutDialog = false
                        }
                    ) {
                        Text("Logout")
                    }
                },
                dismissButton = {
                    Button(
                        onClick = {
                            showLogoutDialog = false
                        }
                    ) {
                        Text("Cancel")
                    }
                }
            )
        }

    }


}

