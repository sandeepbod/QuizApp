package uk.ac.tees.mad.D3662700.application

import android.app.Application
import uk.ac.tees.mad.D3662700.ui.model.OptionModel
import uk.ac.tees.mad.D3662700.ui.model.QuizModel

class AppConfig  :Application() {
    companion object{
        val quiz1 = arrayListOf<QuizModel>().apply {
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
            add(
                QuizModel(
                    question = "External entities in DFD are shown by:-",
                    answer = "Rectangle",
                    optionArrayList = ArrayList<OptionModel>().apply {
                        add(OptionModel(name = "Ellipse"))
                        add(OptionModel(name = "Rectangle"))
                        add(OptionModel(name = "Circle"))
                        add(OptionModel(name = "Hexagon"))
                    })
            )
        }
        val quiz2 = arrayListOf<QuizModel>().apply {
            clear()
            add(
                QuizModel(
                    question = " External entities in DFD are shown by:-",
                    answer = "Rectangle",
                    optionArrayList = ArrayList<OptionModel>().apply {
                        add(OptionModel(name = "Ellipse"))
                        add(OptionModel(name = "Rectangle"))
                        add(OptionModel(name = "Circle"))
                        add(OptionModel(name = "Hexagon"))
                    })
            )
            add(
                QuizModel(
                    question = "What is the time complexity of Floyd–Warshall algorithm to calculate all pair shortest path in a graph with n vertices?",
                    answer = "Theta(n3)",
                    optionArrayList = ArrayList<OptionModel>().apply {
                        add(OptionModel(name = "O(n2log(n))"))
                        add(OptionModel(name = "Theta(n2log(n))"))
                        add(OptionModel(name = "Theta(n4)"))
                        add(OptionModel(name = "Theta(n3)"))
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
                    question = "The following statement is valid. log(n!) =  theta (n log n).",
                    answer = "True",
                    optionArrayList = ArrayList<OptionModel>().apply {
                        add(OptionModel(name = "True"))
                        add(OptionModel(name = "False"))
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
                    question = "Which of the following algorithms sort n integers, having the range 0 to (n2 - 1), in ascending order in O(n) time ?",
                    answer = "Radix sort",
                    optionArrayList = ArrayList<OptionModel>().apply {
                        add(OptionModel(name = "Selection sort"))
                        add(OptionModel(name = "Bubble sort"))
                        add(OptionModel(name = "Radix sort"))
                        add(OptionModel(name = "Insertion sort"))
                    })
            )
        }
        val quiz3 = arrayListOf<QuizModel>().apply {
            clear()
            add(
                QuizModel(
                    question = "Which of the following algorithm design technique is used in merge sort?",
                    answer = "Divide and Conquer",
                    optionArrayList = ArrayList<OptionModel>().apply {
                        add(OptionModel(name = "Greedy method"))
                        add(OptionModel(name = "Backtracking"))
                        add(OptionModel(name = "Dynamic programming"))
                        add(OptionModel(name = "Divide and Conquer"))
                    })
            )
            add(
                QuizModel(
                    question = "If we use Radix Sort to sort n integers in the range (nk/2,nk], for some k>0 which is independent of n, the time taken would be?",
                    answer = "Θ(nlogn)",
                    optionArrayList = ArrayList<OptionModel>().apply {
                        add(OptionModel(name = "Θ(n)"))
                        add(OptionModel(name = "Θ(kn)"))
                        add(OptionModel(name = "Θ(nlogn)"))
                        add(OptionModel(name = "Θ(n2)"))
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
                    question = "Assume that we use Bubble Sort to sort n distinct elements in ascending order. When does the best case of Bubble Sort occur?",
                    answer = "When elements are sorted in ascending order",
                    optionArrayList = ArrayList<OptionModel>().apply {
                        add(OptionModel(name = "When elements are sorted in ascending order"))
                        add(OptionModel(name = "When elements are sorted in descending order"))
                        add(OptionModel(name = "When elements are not sorted by any order"))
                        add(OptionModel(name = "There is no best case for Bubble Sort. It always takes O(n*n) time"))
                    })
            )
            add(
                QuizModel(
                    question = "A binary search tree T contains n distinct elements. What is the time complexity of picking an element in T that is smaller than the maximum element in T?",
                    answer = "Θ(1)",
                    optionArrayList = ArrayList<OptionModel>().apply {
                        add(OptionModel(name = "Θ(nlogn)"))
                        add(OptionModel(name = "Θ(n)"))
                        add(OptionModel(name = "Θ(logn)"))
                        add(OptionModel(name = "Θ(1)"))
                    })
            )
            add(
                QuizModel(
                    question = "Suppose the letters a, b, c, d, e, f have probabilities 1/2, 1/4, 1/8, 1/16, 1/32, 1/32 respectively. What is the average length of Huffman codes?",
                    answer = "1.9375",
                    optionArrayList = ArrayList<OptionModel>().apply {
                        add(OptionModel(name = "3"))
                        add(OptionModel(name = "2.1875"))
                        add(OptionModel(name = "2.25"))
                        add(OptionModel(name = "1.9375"))
                    })
            )
            add(
                QuizModel(
                    question = "Suppose the letters a, b, c, d, e, f have probabilities 1/2, 1/4, 1/8, 1/16, 1/32, 1/32 respectively. Which of the following is the Huffman code for the letter a, b, c, d, e, f?",
                    answer = "0, 10, 110, 1110, 11110, 11111",
                    optionArrayList = ArrayList<OptionModel>().apply {
                        add(OptionModel(name = "0, 10, 110, 1110, 11110, 11111"))
                        add(OptionModel(name = "11, 10, 011, 010, 001, 000"))
                        add(OptionModel(name = "11, 10, 01, 001, 0001, 0000"))
                        add(OptionModel(name = "110, 100, 010, 000, 001, 111"))
                    })
            )
        }
        val quiz4 = arrayListOf<QuizModel>().apply {
            clear()
            add(
                QuizModel(
                    question = "Consider two strings A = \"qpqrr\" and B = \"pqprqrp\". Let x be the length of the longest common subsequence (not necessarily contiguous) between A and B and let y be the number of such longest common subsequences between A and B. Then x + 10y = ___.",
                    answer = "34",
                    optionArrayList = ArrayList<OptionModel>().apply {
                        add(OptionModel(name = "33"))
                        add(OptionModel(name = "23"))
                        add(OptionModel(name = "43"))
                        add(OptionModel(name = "34"))
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
                    question = "Assume that we use Bubble Sort to sort n distinct elements in ascending order. When does the best case of Bubble Sort occur?",
                    answer = "When elements are sorted in ascending order",
                    optionArrayList = ArrayList<OptionModel>().apply {
                        add(OptionModel(name = "When elements are sorted in ascending order"))
                        add(OptionModel(name = "When elements are sorted in descending order"))
                        add(OptionModel(name = "When elements are not sorted by any order"))
                        add(OptionModel(name = "There is no best case for Bubble Sort. It always takes O(n*n) time"))
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
        }
    }
}