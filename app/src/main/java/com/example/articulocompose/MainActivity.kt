package com.example.articulocompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.articulocompose.ui.theme.ArticuloComposeTheme
import androidx.compose.foundation.Image
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArticuloComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ArticuloCompose(
                        titulo = stringResource(R.string.titulo),
                        textoUno = stringResource(R.string.textoUno),
                        textoDos = stringResource(R.string.textoDos),
                        imagePainter = painterResource(R.drawable.bg_compose_background)
                    )
                }
            }
        }
    }


@Composable
fun ArticuloCompose(
    titulo: String,
    textoUno:String,
    textoDos:String,
    imagePainter: Painter,
    modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
    ){
        Image(painter = imagePainter, contentDescription = null)

        Text(
            text = titulo,
            modifier = Modifier.padding(16.dp),
            fontSize = 24.sp)
        Text(
            text = textoUno,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = textoDos,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify
        )
    }


}



@Preview(showBackground = true)
@Composable
fun ArticuloComposePreview() {

    val titulo = stringResource(R.string.titulo)
    val textoUno = stringResource(R.string.textoUno)
    val textoDos = stringResource(R.string.textoDos)
    val imagePainter = painterResource(R.drawable.bg_compose_background)

    ArticuloCompose(
        titulo = titulo,
        textoUno = textoUno,
        textoDos = textoDos,
        imagePainter = imagePainter
    )
}}


