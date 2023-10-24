package com.example.trocaimagens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.trocaimagens.ui.theme.TrocaImagensTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TrocaImagensTheme {

                }
            }
        }
    }

@Preview(showSystemUi = true)
@Composable
fun TrocarImagens(){

    var trocador by remember { mutableStateOf(1) }
    val idImage = when(trocador){
        1 -> R.drawable.dog
        2 -> R.drawable.papagaio
        else -> R.drawable.cat

    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 150.dp),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally,

    ) {
    Image(
        painter = painterResource(id = idImage),
        contentDescription = null,
        contentScale = ContentScale.Fit,
        modifier = Modifier
            .fillMaxWidth()
            .height(350.dp)

    )
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()



        ) {
        Button(

            onClick = {
            if(trocador > 1)
                trocador--

            else
                trocador = 3

            },
            shape = RoundedCornerShape(6.dp),
            elevation = ButtonDefaults.buttonElevation(4.dp)

        ) {
        Text(text = "Anterior")
        }
        Button(
            onClick = {
                if(trocador<3)
                    trocador++
                else
                    trocador = 1

             }

        ) {
            Text(text = "Próximo")
        }


        }
        }
    }









