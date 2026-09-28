package com.example.locked_in.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.locked_in.R
import com.example.locked_in.model.Comida

@Composable
fun ComidaCard(
    comida: Comida,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.fillMaxWidth()
    ) {
        Row(
            modifier = Modifier.padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Imagen vectorial desde res/drawable/baseline_food_bank_24.xml
            Image(
                painter = painterResource(id = R.drawable.baseline_food_bank_24),
                contentDescription = "Icono de comida",
                modifier = Modifier.size(40.dp)
            )

            Spacer(modifier = Modifier.width(8.dp))

            Column {
                Text(
                    text = comida.nombre,
                    style = MaterialTheme.typography.titleMedium
                )

                Text(
                    text = comida.descripcion,
                    style = MaterialTheme.typography.bodySmall
                )

                Text(
                    text = "${comida.calorias} kcal",
                    style = MaterialTheme.typography.bodyMedium
                )

                Text(
                    text = "${comida.proteinas} g de proteínas",
                    style = MaterialTheme.typography.bodySmall
                )
            }
        }
    }
}