package com.quiz.ui.main

import android.annotation.SuppressLint
import android.widget.Toast
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.quiz.R
import com.quiz.routing.Screen
import com.quiz.ui.model.OptionModel
import com.quiz.ui.model.QuizModel
import com.quiz.ui.theme.QuizAppTheme
import com.quiz.ui.theme.appColor
import com.quiz.ui.theme.white
import com.quiz.utils.RoundedButton

@OptIn(ExperimentalMaterial3Api::class, ExperimentalComposeUiApi::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter", "UnrememberedMutableState")
@Composable
fun MainScreen(navController: NavController) {
    val context = LocalContext.current
    val checked = remember { mutableStateOf(false) }
    val scrollState = rememberScrollState()
    val answerList = arrayListOf<QuizModel>()
    answerList.clear()
    val list = arrayListOf<QuizModel>().apply {
        clear()
        add(
            QuizModel(
                question = "The first search engine on the internet is",
                answer = "Archie",
                optionArrayList = ArrayList<OptionModel>().apply {
                    add(OptionModel(name = "Archie"))
                    add(OptionModel(name = "Google"))
                    add(OptionModel(name = "Bing"))
                    add(OptionModel(name = "Yahoo"))
                })
        )
        add(
            QuizModel(
                question = "The number of bits used by IPv6 address is",
                answer = "128",
                optionArrayList = ArrayList<OptionModel>().apply {
                    add(OptionModel(name = "16"))
                    add(OptionModel(name = "32"))
                    add(OptionModel(name = "64"))
                    add(OptionModel(name = "128"))
                })
        )
        add(
            QuizModel(
                question = "Which technology is used to record cryptocurrency transactions?",
                answer = "Blockchain technology",
                optionArrayList = ArrayList<OptionModel>().apply {
                    add(OptionModel(name = "Mining"))
                    add(OptionModel(name = "Digital wallet"))
                    add(OptionModel(name = "Blockchain technology"))
                    add(OptionModel(name = "Token"))
                })
        )
        add(
            QuizModel(
                question = "The first computer virus was known as",
                answer = "Blockchain technology",
                optionArrayList = ArrayList<OptionModel>().apply {
                    add(OptionModel(name = "Rabbit"))
                    add(OptionModel(name = "Elk cloner"))
                    add(OptionModel(name = "SCA virus"))
                    add(OptionModel(name = "Creeper program"))
                })
        )
        add(
            QuizModel(
                question = "What technology is used to make telephone calls over the Internet possible?",
                answer = "VoIP",
                optionArrayList = ArrayList<OptionModel>().apply {
                    add(OptionModel(name = "VoIP"))
                    add(OptionModel(name = "Bluetooth"))
                    add(OptionModel(name = "Ethernet"))
                    add(OptionModel(name = "All of the above"))
                })
        )
        add(
            QuizModel(
                question = "Which component is often referred to as the 'brain' of the motherboard?",
                answer = "Processor",
                optionArrayList = ArrayList<OptionModel>().apply {
                    add(OptionModel(name = "Processor"))
                    add(OptionModel(name = "Bios"))
                    add(OptionModel(name = "Computer Chip"))
                    add(OptionModel(name = "Transistor"))
                })
        )
        add(
            QuizModel(
                question = "Which of the items is an input device?",
                answer = "Keyboard",
                optionArrayList = ArrayList<OptionModel>().apply {
                    add(OptionModel(name = "Computer Monitor"))
                    add(OptionModel(name = "Keyboard"))
                    add(OptionModel(name = "Display Board"))
                    add(OptionModel(name = "Overhead projector"))
                })
        )
        add(
            QuizModel(
                question = "The System unit is referred to as the:",
                answer = "The Heart of the Computer",
                optionArrayList = ArrayList<OptionModel>().apply {
                    add(OptionModel(name = "CPU"))
                    add(OptionModel(name = "The Heart of the Computer"))
                    add(OptionModel(name = "Hard Drive"))
                    add(OptionModel(name = "System Software"))
                })
        )
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
                            style = TextStyle(fontWeight = FontWeight.SemiBold, fontSize = 18.sp)
                        )
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
                                .height(280.dp),
                            shape = RoundedCornerShape(10.dp),
                            colors = CardDefaults.cardColors(containerColor = Color.White),
                            elevation = CardDefaults.cardElevation(defaultElevation = 5.dp)
                        ) {
                            Spacer(Modifier.height(10.dp))
                            Text(
                                quizModel.question ?: "",
                                fontSize = 14.sp,
                                color = Color.Black,
                                modifier = Modifier
                                    .padding(vertical = 5.dp, horizontal = 10.dp)
                            )
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
                Box(Modifier.padding(15.dp).background(white)) {
                    RoundedButton(
                        text = "Show Result",
                        onClick = {
                            navController.navigate(Screen.ResultScreen.route)
                        }
                    )
                }
            }

        }


    }

}