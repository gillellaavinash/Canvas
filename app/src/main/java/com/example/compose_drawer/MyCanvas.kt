package com.example.compose_drawer

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp

@Composable
fun MyCanvas(){
    val brush = Brush.verticalGradient(
        listOf(
            androidx.compose.ui.graphics.Color.Red,
            androidx.compose.ui.graphics.Color.Yellow,
            androidx.compose.ui.graphics.Color.Magenta,
            androidx.compose.ui.graphics.Color.Cyan,
        )
    )
    Canvas(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize()
    ){

        drawArc(
            brush = brush,
            startAngle = 0f,
            sweepAngle = 360f,
            useCenter = true,
            size = this.size.copy(
                width = 250.dp.toPx(),
                height = 500.dp.toPx() / 2
            ),
            topLeft = Offset(
                x = 50.dp.toPx(),
                y = 200.dp.toPx()
            ),
            style = Stroke(
                width = 10.dp.toPx()
            ),
        )

        drawArc(
            brush = brush,
            startAngle = 0f,
            sweepAngle = 180f,
            useCenter = false,
            size = this.size.copy(
                width = 170.dp.toPx(),
                height = 280.dp.toPx() / 2
            ),
            topLeft = Offset(
                x = 90.dp.toPx(),
                y = 260.dp.toPx()
            ),
            style = Stroke(
                width = 10.dp.toPx()
            ),
        )

        drawCircle(
            brush = brush,
            radius = 5.dp.toPx(),
            center = Offset(
                x = 260.dp.toPx()/2,
                y = 260.dp.toPx()
            ),
            style = Stroke(
                width = 10.dp.toPx()
            ),
        )

        drawCircle(
            brush = brush,
            radius = 5.dp.toPx(),
            center = Offset(
                x = 450.dp.toPx()/2,
                y = 260.dp.toPx()
            ),
            style = Stroke(
                width = 10.dp.toPx()
            ),
        )

//        drawPoints(
//            brush = brush,
//            points = listOf(
//                Offset(
//                    x = 90.dp.toPx()/2,
//                    y = 260.dp.toPx()
//                ),
//                Offset(
//                    x = 510.dp.toPx()/2,
//                    y = 60.dp.toPx()
//                ),
//                Offset(
//                    x = 450.dp.toPx()/2,
//                    y = 280.dp.toPx()
//                ),
//                Offset(
//                    x = 90.dp.toPx()/2,
//                    y = 120.dp.toPx()
//                ),
//            ),
//            pointMode = PointMode.Polygon,
//            strokeWidth = 2.dp.toPx(),
//            cap = androidx.compose.ui.graphics.StrokeCap.Round,
//            pathEffect = androidx.compose.ui.graphics.PathEffect.dashPathEffect(
//                floatArrayOf(10f, 10f),
//                0f
//            )
//        )

//        drawLine(
//            brush = brush,
//            start = Offset(
//                x = 350.dp.toPx()/2,
//                y = 330.dp.toPx()
//            ),
//            end = Offset(
//                x = 350.dp.toPx()/2,
//                y = 250.dp.toPx()
//            ),
//            strokeWidth = 1.dp.toPx()
//        )
//        drawLine(
//            brush = brush,
//            start = Offset(
//                x = 350.dp.toPx()/2,
//                y = 330.dp.toPx()
//            ),
//            end = Offset(
//                x = 450.dp.toPx()/2,
//                y = 410.dp.toPx()
//            ),
//            strokeWidth = 1.dp.toPx()
//        )
    }
}