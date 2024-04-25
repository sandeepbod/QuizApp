package com.quiz.ui.result

import android.annotation.SuppressLint
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.*
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
import com.quiz.ui.model.OptionModel
import com.quiz.ui.model.QuizModel
import com.quiz.ui.theme.QuizAppTheme
import com.quiz.ui.theme.appColor

@OptIn(ExperimentalMaterial3Api::class, ExperimentalComposeUiApi::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter", "UnrememberedMutableState")
@Composable
fun ResultScreen(navController: NavController) {
    val context = LocalContext.current
    val checked = remember { mutableStateOf(false) }
    val scrollState = rememberScrollState()

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
        add(
            QuizModel(
                question = "Which of the following standard algorithms is not Dynamic Programming based?",
                answer = "Prim's Minimum Spanning Tree",
                optionArrayList = ArrayList<OptionModel>().apply {
                    add(OptionModel(name = "Bellman–Ford Algorithm for single source shortest path"))
                    add(OptionModel(name = "Floyd Warshall Algorithm for all pairs shortest paths"))
                    add(OptionModel(name = "0-1 Knapsack problem"))
                    add(OptionModel(name = "Prim's Minimum Spanning Tree"))
                })
        )
        add(
            QuizModel(
                question = "Which of the following is not true about comparison-based sorting algorithms?",
                answer = "Heap Sort is not a comparison based sorting algorithm.",
                optionArrayList = ArrayList<OptionModel>().apply {
                    add(OptionModel(name = "The minimum possible time complexity of a comparison-based sorting algorithm is O(n(log(n)) for a random input array"))
                    add(OptionModel(name = "Any comparison based sorting algorithm can be made stable by using position as a criteria when two elements are compared"))
                    add(OptionModel(name = "Counting Sort is not a comparison based sorting algorithm"))
                    add(OptionModel(name = "Heap Sort is not a comparison based sorting algorithm."))
                })
        )
        add(
            QuizModel(
                question = "Which of the following is not O(n2)?",
                answer = "n3/(sqrt(n))",
                optionArrayList = ArrayList<OptionModel>().apply {
                    add(OptionModel(name = "(15) * n2"))
                    add(OptionModel(name = "n1.98"))
                    add(OptionModel(name = "n3/(sqrt(n))"))
                    add(OptionModel(name = "(20) * n2"))
                })
        )
        add(
            QuizModel(
                question = "Suppose T(n) = 2T(n/2) + n, T(0) = T(1) = 1 Which one of the following is false. ",
                answer = "T(n) = Omega(n^2)",
                optionArrayList = ArrayList<OptionModel>().apply {
                    add(OptionModel(name = "T(n) = O(n^2)"))
                    add(OptionModel(name = "T(n) = theta(nLogn)"))
                    add(OptionModel(name = "T(n) = Omega(n^2)"))
                    add(OptionModel(name = "T(n) = O(nLogn)"))
                })
        )
        add(
            QuizModel(
                question = "In a complete k-ary tree, every internal node has exactly k children. The number of leaves in such a tree with n internal nodes is: ",
                answer = "n( k – 1) + 1",
                optionArrayList = ArrayList<OptionModel>().apply {
                    add(OptionModel(name = "nk"))
                    add(OptionModel(name = "(n – 1) k+ 1"))
                    add(OptionModel(name = "n( k – 1) + 1"))
                    add(OptionModel(name = "n( k – 1)"))
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
                            text = "Result", color = Color.White,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(10.dp),
                            style = TextStyle(fontWeight = FontWeight.SemiBold, fontSize = 18.sp)
                        )
                    },
                    navigationIcon = {
                        IconButton(
                            onClick = {
                                navController.navigateUp()
                            }
                        ) {
                            Icon(imageVector = Icons.Rounded.ArrowBack,
                                tint = Color.White,
                                contentDescription = "Back")
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
                                .height(480.dp),
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
                            Text(
                                "Right Answer : ${quizModel.answer ?: ""}",
                                fontSize = 14.sp,
                                color = Color.Black,
                                modifier = Modifier
                                    .padding(vertical = 5.dp, horizontal = 10.dp)
                            )
                        }
                    }
                }
            }

        }


    }

}