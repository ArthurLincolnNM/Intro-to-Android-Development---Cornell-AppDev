package com.cornelappdev.todo_list_final

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun TodoScreen() {
    var newTodo by remember{ mutableStateOf("") }
    val todoList = remember{ mutableStateListOf<String>() }
    Column(

        modifier = Modifier.fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("My Todo List", fontSize = 36.sp)
        Spacer(modifier  =Modifier.height(30.dp))

        TextField(
            value = newTodo,
            placeholder = {Text( "new todo...")},
            onValueChange = { temp: String ->
                newTodo = temp
            }
        )

        Button(
            onClick = {
                todoList.add(newTodo)
                newTodo = ""
            }

        ) {
            Text("Add Todo")
        }

        LazyColumn (
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {

            items(todoList) {todo ->
                TodoCard(todo)
                }

            }
        }


    }


@Composable
fun TodoCard(todo: String) {
    Row(
        modifier = Modifier.fillMaxWidth()
            .background(shape = RoundedCornerShape(12.dp), color = Color.LightGray)
            .padding(16.dp)
    ) {
        Text(todo)
    }

}
@Preview
@Composable
private fun TodoCardPreview() {
    TodoCard("This is a TodoCard")
}