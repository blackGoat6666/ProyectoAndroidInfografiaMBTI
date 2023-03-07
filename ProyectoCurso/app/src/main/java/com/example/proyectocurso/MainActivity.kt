package com.example.proyectocurso


//andamio

//animaciones

import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.style.URLSpan
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.proyectocurso.ui.theme.Informacion
import com.example.proyectocurso.ui.theme.ProyectoCursoTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProyectoCursoTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    MBTIInfografiaApp()

                }
            }
        }
    }
}

@Composable
fun TextoConInfoDelTipoMBTIIzq(icono: ImageVector, info: String, color : Color) {
    Icon(imageVector = icono, contentDescription = "")
    Text(
        modifier = Modifier
            .padding(end = 4.dp)
            .wrapContentWidth(Alignment.Start)
            .width(120.dp)
            ,
        fontSize = 16.sp,
        text = info,
        color = color,
        fontWeight = FontWeight.Bold
    )
}

@Composable
fun TextoConInfoDelTipoMBTIDer(icono: ImageVector, info: String, color: Color) {
    Icon(imageVector = icono, contentDescription = "")
    Text(
        modifier = Modifier
            .padding(end = 4.dp)
            .wrapContentWidth(Alignment.End)
            .width(120.dp),
        text = info,
        color = color,
        fontSize = 16.sp,
        fontStyle = FontStyle.Italic
    )
}

@Preview(showBackground = true)
@Composable
fun TextoConInfoDelTipoMBTIPreview() {
    ProyectoCursoTheme {
        TextoConInfoDelTipoMBTIIzq(Icons.Default.PlayArrow,"algo", Color.Black)
    }
}

@Composable
fun TipoMBTI(
    iconoMBTI: Int,
    MBTI: String,
    iconoinfo1: ImageVector,
    info1: String,
    iconoinfo2: ImageVector,
    info2: String,
    color: Color,
    colortexto: Color,
    modifier: Modifier = Modifier,

    ) {
    var expanded by remember{
        mutableStateOf(false
    )}
    Surface(
        modifier = Modifier
            .clickable { expanded = !expanded }
            .fillMaxWidth(),
        elevation = 2.dp
    ) {

        Row(
            modifier = modifier
                .background(color)
                .height(140.dp),
                    horizontalArrangement = Arrangement.Center,
        ) {
            if (expanded) {
                TextoConInfoDelTipoMBTIIzq(iconoinfo1, info1, colortexto)
            }
            Column() {
                Image(
                    painter = painterResource(iconoMBTI),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(88.dp)
                        .clip(CircleShape)
                        .height(90.dp)
                )
                Text(
                    modifier = Modifier
                        .padding(end = 4.dp)
                        .width(120.dp)
                        .height(35.dp),
                    text = MBTI,
                    color = colortexto,
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold
                )
            }
            if (expanded) {
                TextoConInfoDelTipoMBTIDer(iconoinfo2, info2, colortexto)
            }
        }
    }
}


@Preview(showBackground = true, backgroundColor = 0xFFF0EAE2)
@Composable
fun TipoMBTIPreview() {
    ProyectoCursoTheme {
        TipoMBTI(
            MBTI = "vabjvnsdfok",
            iconoMBTI = R.drawable.cabra_montes_medio_natural_515972_2628,
            iconoinfo1 = Icons.Default.PlayArrow,
            info1 = "avheoiuvdhuhviuhseriuvhis",
            iconoinfo2 = Icons.Default.PlayArrow,
            info2 = "ihvauhviahdviuhvuids",
            color = Color(102, 187, 106 ),
            colortexto = Color(91,200, 200),
            modifier = Modifier.padding(8.dp),
        )
    }
}

data class dataDeElementoMBTI(val iconoMBTI: Int,
                              val MBTI: String,
                              val iconoinfo1: ImageVector,
                              val info1: String,
                              val iconoinfo2: ImageVector,
                              val info2: String,
                              val color: Color,
                              val colortexto: Color)

@Composable
fun ListaDeTiposMBTI(diplomaticos: List<dataDeElementoMBTI>, analistas: List<dataDeElementoMBTI>,
                     exploradores: List<dataDeElementoMBTI>, centinelas: List<dataDeElementoMBTI>) {
    LazyColumn {

        item {
            Text(
                text = "Diplomaticos",
                color = Color(118, 204, 121, 255),
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold
            )
        }
        items(diplomaticos) {
                elementos -> TipoMBTI(elementos.iconoMBTI, elementos.MBTI,
                                        elementos.iconoinfo1, elementos.info1,
                                        elementos.iconoinfo2, elementos.info2,
                                        elementos.color, elementos.colortexto)

        }
        item {
            Text(
                text = "Analistas",
                color = Color(181, 118, 204, 255),
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold
            )
        }
        items(analistas) {
                elementos -> TipoMBTI(elementos.iconoMBTI, elementos.MBTI,
            elementos.iconoinfo1, elementos.info1,
            elementos.iconoinfo2, elementos.info2,
            elementos.color, elementos.colortexto)
        }
        item {
            Text(
                text = "Exploradores",
                color = Color(255, 235, 59, 255),
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold
            )
        }
        items(exploradores) {
                elementos -> TipoMBTI(elementos.iconoMBTI, elementos.MBTI,
            elementos.iconoinfo1, elementos.info1,
            elementos.iconoinfo2, elementos.info2,
            elementos.color, elementos.colortexto)
        }
        item {
            Text(
                text = "Centinelas",
                color = Color(118, 197, 204, 255),
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold
            )
        }
        items(centinelas) {
                elementos -> TipoMBTI(elementos.iconoMBTI, elementos.MBTI,
            elementos.iconoinfo1, elementos.info1,
            elementos.iconoinfo2, elementos.info2,
            elementos.color, elementos.colortexto)
        }
    }
}

@Preview
@Composable
fun ListaDeTiposMBTIPreview() {
    ProyectoCursoTheme {
        ListaDeTiposMBTI(Informacion.listaDiplomaticos, Informacion.listaAnalistas,
                        Informacion.listaExploreros, Informacion.listaCentinelas)
    }
}
@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Column(
    ) {
        Column(modifier = Modifier
            .height(60.dp)
            .fillMaxWidth()
            .background(Color(255, 112, 67, 255))) {
            Text(text = "Toma el test en la pagina oficial!")

            Text(
                text = "https://www.16personalities.com/es/test-de-personalidad"
            )
        }
        ListaDeTiposMBTI(Informacion.listaDiplomaticos, Informacion.listaAnalistas,
            Informacion.listaExploreros, Informacion.listaCentinelas)
    }
}



@Composable
fun MBTIInfografiaApp() {
    ProyectoCursoTheme {
        Scaffold(
        ) { padding ->
            HomeScreen(Modifier.padding(padding))
        }
    }
}
@Preview(widthDp = 360, heightDp = 640)
@Composable
fun MBTIInfografiaAppPreview() {
    MBTIInfografiaApp()
}

