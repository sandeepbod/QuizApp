package uk.ac.tees.mad.D3662700.ui.main

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import uk.ac.tees.mad.D3662700.R
import uk.ac.tees.mad.D3662700.application.AppConfig
import uk.ac.tees.mad.D3662700.routing.Screen
import uk.ac.tees.mad.D3662700.ui.localDatabase.PreferencesManager
import uk.ac.tees.mad.D3662700.ui.model.QuizModel
import uk.ac.tees.mad.D3662700.ui.theme.QuizAppTheme
import uk.ac.tees.mad.D3662700.ui.theme.appColor
import uk.ac.tees.mad.D3662700.ui.theme.white
import uk.ac.tees.mad.D3662700.utils.RoundedButton
import kotlinx.coroutines.delay

@OptIn(ExperimentalMaterial3Api::class, ExperimentalComposeUiApi::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter", "UnrememberedMutableState")
@Composable
fun MainScreen(navController: NavController,option : String) {
    val context = LocalContext.current
    val preferenceManager = remember {
        PreferencesManager(context)
    }
    val scrollState = rememberScrollState()
    val answerList = arrayListOf<QuizModel>()
    answerList.clear()
    var submitResult by remember { mutableStateOf(false) }
    val list = arrayListOf<QuizModel>()
    when(option) {
        "Quiz 1" -> {
            list.addAll(AppConfig.quiz1)
        }
        "Quiz 2" -> {
            list.addAll(AppConfig.quiz2)
        }
        "Quiz 3" -> {
            list.addAll(AppConfig.quiz3)
        }
        "Quiz 4" -> {
            list.addAll(AppConfig.quiz4)
        }
    }




    QuizAppTheme {
        Scaffold {
            Column(
                modifier = Modifier
                    .background(color = appColor)
                    .padding(top = 40.dp)
                    .verticalScroll(scrollState)
            ) {
                SmallTopAppBar(
                    title = {
                        Text(
                            text = "Quiz", color = Color.White,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(10.dp),
                            style = TextStyle(
                                fontWeight = FontWeight.SemiBold,
                                fontSize = 18.sp
                            )
                        )
                    },
                    navigationIcon = {
                        IconButton(
                            onClick = {
                                navController.navigateUp()
                            }
                        ) {
                            Icon(
                                imageVector = Icons.Rounded.ArrowBack,
                                tint = Color.White,
                                contentDescription = "Back"
                            )
                        }
                    },
                    colors = TopAppBarDefaults.smallTopAppBarColors(
                        containerColor = appColor,
                        titleContentColor = Color.White
                    )
                )
                Spacer(Modifier.height(10.dp))

                Column {
                    list.forEachIndexed { parentIndex, quizModel ->
                        Card(
                            modifier = Modifier
                                .padding(bottom = 10.dp, start = 10.dp, end = 10.dp)
                                .fillMaxWidth()
                                .height(IntrinsicSize.Min),
                            shape = RoundedCornerShape(10.dp),
                            colors = CardDefaults.cardColors(containerColor = Color.White),
                            elevation = CardDefaults.cardElevation(defaultElevation = 5.dp)
                        ) {
                            var timer by remember { mutableStateOf(60) }
                            LaunchedEffect(key1 = timer) {
                                if (timer > 0) {
                                    delay(1_000)
                                    timer -= 1
                                }
                            }

                            Spacer(Modifier.height(10.dp))
                            Text(
                                quizModel.question ?: "",
                                fontSize = 14.sp,
                                color = Color.Black,
                                modifier = Modifier
                                    .padding(vertical = 5.dp, horizontal = 10.dp)
                            )
                            Text(
                                "Marks : 1",
                                fontSize = 14.sp,
                                color = Color.Black,
                                modifier = Modifier
                                    .padding(vertical = 5.dp, horizontal = 10.dp)
                                    .align(Alignment.End),
                                textAlign = TextAlign.End
                            )
                            if (timer != 0) {
                                Text(
                                    "00:$timer",
                                    fontSize = 14.sp,
                                    color = Color.Black,
                                    modifier = Modifier
                                        .padding(vertical = 5.dp, horizontal = 10.dp)
                                        .align(Alignment.End),
                                    textAlign = TextAlign.End
                                )
                            }

                            Spacer(Modifier.height(10.dp))
                            Divider(
                                thickness = 1.5.dp,
                                color = Color.Gray,
                                modifier = Modifier.fillMaxWidth()
                            )
                            Spacer(Modifier.height(10.dp))
                            var selectedOption by remember {
                                mutableStateOf(-1)
                            }

                            quizModel.optionArrayList.forEachIndexed { index, optionModel ->
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .clickable {
                                            selectedOption = index
                                        }, verticalAlignment = Alignment.CenterVertically
                                ) {
                                    RadioButton(
                                        selected = selectedOption == index,
                                        onClick = { selectedOption = index }
                                    )
                                    Text(optionModel.name, modifier = Modifier.fillMaxWidth())
                                }
                            }


                        }
                    }
                }
                Spacer(Modifier.height(10.dp))
                Box(
                    Modifier
                        .padding(15.dp)
                        .background(white)
                ) {
                    RoundedButton(
                        text = "Submit & Show Result",
                        onClick = {
                            submitResult = true

                        }
                    )
                }
            }
        }

        if (submitResult) {
            AlertDialog(
                onDismissRequest = {
                    submitResult = false
                },
                title = { Text(stringResource(id = R.string.app_name)) },
                text = { Text("Your answers will be submitted successfully, please click Show Result Button to see your results.") },
                confirmButton = {
                    Button(
                        onClick = {
                            navController.navigate(Screen.ResultScreen.route+"/${option}")
                            submitResult = false
                        }
                    ) {
                        Text("Show Result")
                    }
                },
                dismissButton = {
                    Button(
                        onClick = {
                            submitResult = false
                        }
                    ) {
                        Text("Cancel")
                    }
                }
            )
        }
    }


}

