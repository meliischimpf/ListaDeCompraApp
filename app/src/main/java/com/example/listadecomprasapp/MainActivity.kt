package com.example.listadecomprasapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ShoppingListApp()
        }
    }
}

@Composable
fun ShoppingListApp() {
    var itemName by remember { mutableStateOf("") }
    var itemQuantity by remember { mutableStateOf("") }
    var isChecked by remember { mutableStateOf(false) }
    var notificationsEnabled by remember { mutableStateOf(false) }
    var prioritySelected by remember { mutableStateOf("Alta") }
    var sliderValue by remember { mutableFloatStateOf(1f) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.shopping_cart),
            contentDescription = "Lista de compras",
            modifier = Modifier.size(100.dp)
        )
        Text(
            text = "Lista de Compras",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(16.dp))
        HorizontalDivider()

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Checkbox(checked = isChecked, onCheckedChange = { isChecked = it })
            OutlinedTextField(value = itemName, onValueChange = { itemName = it }, label = { Text("Producto") })
            TextField(value = itemQuantity, onValueChange = { itemQuantity = it }, label = { Text("Cantidad") })
        }

        Spacer(modifier = Modifier.height(8.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text("Notificaciones:")
            Switch(checked = notificationsEnabled, onCheckedChange = { notificationsEnabled = it })
        }

        Spacer(modifier = Modifier.height(8.dp))

        Column {
            Text("Prioridad:")
            Row {
                RadioButton(selected = prioritySelected == "Alta", onClick = { prioritySelected = "Alta" })
                Text("Alta")
                RadioButton(selected = prioritySelected == "Baja", onClick = { prioritySelected = "Baja" })
                Text("Baja")
            }
        }

        Spacer(modifier = Modifier.height(8.dp))

        Column {
            Text("Cantidad recomendada: ${sliderValue.toInt()}")
            Slider(value = sliderValue, onValueChange = { sliderValue = it }, valueRange = 1f..10f)
        }

        Spacer(modifier = Modifier.height(16.dp))

        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Button(onClick = { /* Agregar producto */ }) {
                Text("Añadir producto")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ShoppingListPreview() {
    ShoppingListApp()
}
