package org.example.ckp

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import crypto_key_passage_mobile.composeapp.generated.resources.Res
import crypto_key_passage_mobile.composeapp.generated.resources.code_one
import crypto_key_passage_mobile.composeapp.generated.resources.code_two
import crypto_key_passage_mobile.composeapp.generated.resources.code_three
import org.jetbrains.compose.resources.DrawableResource
import androidx.compose.material3.MaterialTheme

@Composable
@Preview
fun App(platformController: PlatformController) {
    MaterialTheme {
        var currentScreen by remember { mutableStateOf("main") }

        platformController.setStatusBarColor(0xFF2C2C2C.toInt())

        Scaffold(
            bottomBar = {
                BottomNavigation(
                    backgroundColor = Color(0xFF2C2C2C),
                    contentColor = Color.Black
                ) {
                    val items = listOf(
                        BottomNavItem("Screens1", Res.drawable.code_one),
                        BottomNavItem("Screens2", Res.drawable.code_two),
                        BottomNavItem("Screens3", Res.drawable.code_three)
                    )

                    items.forEachIndexed { index, item ->
                        BottomNavigationItem(
                            icon = { Icon(painterResource(item.iconRes), contentDescription = null) },
                            label = { Text(item.label, modifier = Modifier.padding(bottom = 12.dp), fontFamily = SfProTextFontFamily()) },
                            selected = currentScreen == getScreenForIndex(index),
                            onClick = {
                                currentScreen = getScreenForIndex(index)
                            },
                            selectedContentColor = Color.White,
                            unselectedContentColor = Color.Gray
                        )
                    }
                }
            }
        ) { innerPadding ->
            Column(
                Modifier
                    .fillMaxSize()
                    .padding(innerPadding),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                when (currentScreen) {
                    "Screens1" -> {
                        platformController.setStatusBarColor(0xFF2C2C2C.toInt())
                        Screens1()
                    }
                    "Screens2" -> {
                        platformController.setStatusBarColor(0xFF2C2C2C.toInt())
                        Screens2()
                    }
                    "Screens3" -> {
                        platformController.setStatusBarColor(0xFF2C2C2C.toInt())
                        Screens3()
                    }
                    else -> {
                        Text("Главный экран", Modifier.padding(16.dp))
                    }
                }
            }
        }
    }
}

fun getScreenForIndex(index: Int): String {
    return when (index) {
        0 -> "Screens1"
        1 -> "Screens2"
        2 -> "Screens3"
        else -> "main"
    }
}

data class BottomNavItem(val label: String, val iconRes: DrawableResource)