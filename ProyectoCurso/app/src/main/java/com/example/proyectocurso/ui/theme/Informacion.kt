package com.example.proyectocurso.ui.theme

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.ui.graphics.Color
import com.example.proyectocurso.R
import com.example.proyectocurso.dataDeElementoMBTI


object Informacion {
    val listaDiplomaticos = listOf(
        dataDeElementoMBTI(
            MBTI = "Protagonist",
            iconoMBTI = R.drawable.enfj,
            iconoinfo1 = Icons.Default.PlayArrow,
            info1 = "Extrovertido\n" +
                    "Intuitivo\n" +
                    "Emocional\n" +
                    "Calificador",
            iconoinfo2 = Icons.Default.PlayArrow,
            info2 = "Líderes carismáticos e inspiradores, capaces de cautivar a quienes los escuchan.",
            color = Color(159, 235, 162, 255),
            colortexto = Color(24, 41, 16, 255)
            ),dataDeElementoMBTI(
            MBTI = "Mediador",
            iconoMBTI = R.drawable.infp,
            iconoinfo1 = Icons.Default.PlayArrow,
            info1 = "Introvertivo\n" +
                    "Intuitivo\n" +
                    "Emocional\n" +
                    "Perceptivo",
            iconoinfo2 = Icons.Default.PlayArrow,
            info2 = "Personas poéticas, amables y altruistas, siempre en busca de ayudar a una buena causa.",
            color = Color(159, 235, 162, 255),
            colortexto = Color(24, 41, 16, 255)
        ),dataDeElementoMBTI(
            MBTI = "Abogado",
            iconoMBTI = R.drawable.infj,
            iconoinfo1 = Icons.Default.PlayArrow,
            info1 = "Introvertivo\n" +
                    "Intuitivo\n" +
                    "Emocional\n" +
                    "Calificador",
            iconoinfo2 = Icons.Default.PlayArrow,
            info2 = "Callados y místicos, que sin embargo son inspiradores e idealistas incansables.",
            color = Color(159, 235, 162, 255),
            colortexto = Color(24, 41, 16, 255)
        ),dataDeElementoMBTI(
            MBTI = "Activista",
            iconoMBTI = R.drawable.enfp,
            iconoinfo1 = Icons.Default.PlayArrow,
            info1 = "Extrovertido\n" +
                    "Intuitivo\n" +
                    "Emocional\n" +
                    "Perceptivo",
            iconoinfo2 = Icons.Default.PlayArrow,
            info2 = "Espíritus libres entusiastas, creativos y sociales, que siempre pueden encontrar una razón para sonreír.",
            color = Color(159, 235, 162, 255),
            colortexto = Color(24, 41, 16, 255)
        ))
    val listaAnalistas = listOf(
        dataDeElementoMBTI(
            MBTI = "Comandante",
            iconoMBTI = R.drawable.entj,
            iconoinfo1 = Icons.Default.PlayArrow,
            info1 = "Extrovertido\n" +
                    "Intuitivo\n" +
                    "Pensador\n" +
                    "Calificador",
            iconoinfo2 = Icons.Default.PlayArrow,
            info2 = "Líderes audaces, imaginativos y de voluntad fuerte, siempre en busca de un camino, o creando uno.",
            color = Color(190, 159, 247, 255),
            colortexto = Color(36, 15, 53, 255)
        ),dataDeElementoMBTI(
            MBTI = "Arquitecto",
            iconoMBTI = R.drawable.intj,
            iconoinfo1 = Icons.Default.PlayArrow,
            info1 = "Introvertivo\n" +
                    "Intuitivo\n" +
                    "Pensador\n" +
                    "Calificador",
            iconoinfo2 = Icons.Default.PlayArrow,
            info2 = "Pensadores imaginativos y estratégicos, con un plan para todo.",
            color = Color(190, 159, 247, 255),
            colortexto = Color(36, 15, 53, 255)
        ),dataDeElementoMBTI(
            MBTI = "Logico",
            iconoMBTI = R.drawable.intp,
            iconoinfo1 = Icons.Default.PlayArrow,
            info1 = "Introvertido\n" +
                    "Intuitivo\n" +
                    "Pensador\n" +
                    "Perceptivo",
            iconoinfo2 = Icons.Default.PlayArrow,
            info2 = "Inventores innovadores con una sed insaciable por el conocimiento.",
            color = Color(190, 159, 247, 255),
            colortexto = Color(36, 15, 53, 255)
        ),dataDeElementoMBTI(
            MBTI = "Innovador",
            iconoMBTI = R.drawable.entp,
            iconoinfo1 = Icons.Default.PlayArrow,
            info1 = "Extrovertido\n" +
                    "Intuitivo\n" +
                    "Pensador\n" +
                    "Perceptivo",
            iconoinfo2 = Icons.Default.PlayArrow,
            info2 = "Pensadores inteligentes y curiosos que no pueden resistir un reto intelectual.",
            color = Color(190, 159, 247, 255),
            colortexto = Color(36, 15, 53, 255)
        ))
    val listaExploreros = listOf(
        dataDeElementoMBTI(
            MBTI = "Virtuoso",
            iconoMBTI = R.drawable.istp,
            iconoinfo1 = Icons.Default.PlayArrow,
            info1 = "Introvertido\n" +
                    "Sensorial\n" +
                    "Pensador\n" +
                    "Perceptivo",
            iconoinfo2 = Icons.Default.PlayArrow,
            info2 = "Experimentadores audaces y prácticos, maestros en el uso de todo tipo de herramientas.",
            color = Color(242, 247, 141, 255),
            colortexto = Color(68, 40, 19, 255)
        ),
        dataDeElementoMBTI(
            MBTI = "Aventurero",
            iconoMBTI = R.drawable.isfp,
            iconoinfo1 = Icons.Default.PlayArrow,
            info1 = "Introvertido\n" +
                    "Sensorial\n" +
                    "Emocional\n" +
                    "Perceptivo",
            iconoinfo2 = Icons.Default.PlayArrow,
            info2 = "Artistas flexibles y encantadores, siempre listos para explorar y experimentar algo nuevo.",
            color = Color(242, 247, 141, 255),
            colortexto = Color(68, 40, 19, 255)
        ),dataDeElementoMBTI(
            MBTI = "Emprendedor",
            iconoMBTI = R.drawable.estp,
            iconoinfo1 = Icons.Default.PlayArrow,
            info1 = "Extrovertido\n" +
                    "Sensorial\n" +
                    "Pensador\n" +
                    "Perceptivo",
            iconoinfo2 = Icons.Default.PlayArrow,
            info2 = "Personas inteligentes, enérgicas y muy perceptivas, que realmente disfrutan vivir al límite.",
            color = Color(242, 247, 141, 255),
            colortexto = Color(68, 40, 19, 255)
        ),dataDeElementoMBTI(
            MBTI = "Animador",
            iconoMBTI = R.drawable.esfp,
            iconoinfo1 = Icons.Default.PlayArrow,
            info1 = "Extrovertido\n" +
                    "Sensorial\n" +
                    "Emocional\n" +
                    "Perceptivo",
            iconoinfo2 = Icons.Default.PlayArrow,
            info2 = "Animadores espontáneos, enérgicos y entusiastas. La vida nunca es aburrida a su alrededor.",
            color = Color(242, 247, 141, 255),
            colortexto = Color(68, 40, 19, 255)
        )

    )
    val listaCentinelas = listOf(
        dataDeElementoMBTI(
            MBTI = "Logista",
            iconoMBTI = R.drawable.istj,
            iconoinfo1 = Icons.Default.PlayArrow,
            info1 = "Introvertido\n" +
                    "Sensorial\n" +
                    "Pensador\n" +
                    "Calificador",
            iconoinfo2 = Icons.Default.PlayArrow,
            info2 = "Individuos prácticos y enfocados en los hechos, de cuya confiabilidad no puede dudarse.",
            color = Color(162, 234, 255, 255),
            colortexto = Color(13, 17, 31, 255)
        ),
        dataDeElementoMBTI(
            MBTI = "Defensor",
            iconoMBTI = R.drawable.isfj,
            iconoinfo1 = Icons.Default.PlayArrow,
            info1 = "Introvertido\n" +
                    "Sensorial\n" +
                    "Emocional\n" +
                    "Calificador",
            iconoinfo2 = Icons.Default.PlayArrow,
            info2 = "Protectores muy dedicados y cálidos, siempre listos para defender a sus seres queridos.",
            color = Color(162, 234, 255, 255),
            colortexto = Color(13, 17, 31, 255)
        ),
        dataDeElementoMBTI(
            MBTI = "Ejecutivo",
            iconoMBTI = R.drawable.estj,
            iconoinfo1 = Icons.Default.PlayArrow,
            info1 = "Extrovertido\n" +
                    "Sensorial\n" +
                    "Pensador\n" +
                    "Calificador",
            iconoinfo2 = Icons.Default.PlayArrow,
            info2 = "Administradores excelentes, inigualables al administrar cosas o personas.",
            color = Color(162, 234, 255, 255),
            colortexto = Color(13, 17, 31, 255)
        ),
        dataDeElementoMBTI(
            MBTI = "Consul",
            iconoMBTI = R.drawable.esfj,
            iconoinfo1 = Icons.Default.PlayArrow,
            info1 = "Extrovertido\n" +
                    "Sensorial\n" +
                    "Emocional\n" +
                    "Calificador",
            iconoinfo2 = Icons.Default.PlayArrow,
            info2 = "Personas extraordinariamente consideradas, sociables y populares, siempre en busca de ayudar.",
            color = Color(162, 234, 255, 255),
            colortexto = Color(13, 17, 31, 255)
        )


    )
}