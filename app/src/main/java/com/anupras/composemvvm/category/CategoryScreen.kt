package com.anupras.composemvvm.category

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun CategoryScreen() {
    val categories = getFakeData()
    Column {
        Text(text = "Category")
        categories.forEach { 
            Text(text = it)
        }
    }

}

fun getFakeData(): List<String>{
return listOf(
    "Fish",
    "Vegan"
)
}