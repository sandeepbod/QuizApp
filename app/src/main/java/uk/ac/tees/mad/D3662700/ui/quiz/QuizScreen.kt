package uk.ac.tees.mad.D3662700.ui.quiz

import android.annotation.SuppressLint
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.rememberScaffoldState
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import uk.ac.tees.mad.D3662700.routing.Screen
import uk.ac.tees.mad.D3662700.ui.drawer.DrawerBody
import uk.ac.tees.mad.D3662700.ui.drawer.DrawerHeader
import uk.ac.tees.mad.D3662700.ui.drawer.TopBar
import uk.ac.tees.mad.D3662700.ui.localDatabase.PreferencesManager
import uk.ac.tees.mad.D3662700.ui.theme.QuizAppTheme
import uk.ac.tees.mad.D3662700.ui.theme.appColor
import uk.ac.tees.mad.D3662700.ui.theme.white
import uk.ac.tees.mad.D3662700.utils.RoundedButton
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
    var quizOption by remember { mutableStateOf("") }



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
                    .fillMaxSize()
                    .background(color = white)
            ) {
                Text(
                    text = "Participants : 10", color = Color.Gray,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    style = TextStyle(
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 18.sp
                    )
                )
                Text(
                    text = "Selection quiz option : ", color = Color.Gray,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    style = TextStyle(
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 18.sp
                    )
                )
                Column(
                    modifier = Modifier.padding(8.dp),
                    verticalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    list.forEach { name ->
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            RadioButton(
                                selected = (name == quizOption),
                                onClick = { quizOption = name }
                            )
                            Text(
                                text = name,
                                style = MaterialTheme.typography.bodyMedium,
                                modifier = Modifier
                                    .padding(start = 8.dp)
                                    .clickable {
                                        quizOption = name
                                    }
                            )
                        }
                    }

                }
                Box(Modifier.padding(15.dp)) {
                    RoundedButton(
                        text = "Submit",
                        onClick = {
                            if(quizOption.isEmpty()) {
                                Toast.makeText(context, "Please select option.", Toast.LENGTH_SHORT).show()
                            }else{
                                navController.navigate(Screen.MainScreen.route+"/${quizOption}")
                            }

                        }
                    )
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

