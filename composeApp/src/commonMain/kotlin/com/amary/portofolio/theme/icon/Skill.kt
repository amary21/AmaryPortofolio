package com.amary.portofolio.theme.icon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.amary.portofolio.theme.Icon

val Icon.Skill: ImageVector
    get() {
        if (_skill != null) {
            return _skill!!
        }
        _skill = ImageVector.Builder(
            name = "Icon",
            defaultWidth = 20.dp,
            defaultHeight = 20.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.157f, 0.28f)
                lineTo(19.208f, 4.753f)
                curveTo(20.264f, 5.34f, 20.264f, 6.66f, 19.208f, 7.247f)
                lineTo(17.852f, 8f)
                lineTo(19.208f, 8.753f)
                curveTo(20.264f, 9.34f, 20.264f, 10.66f, 19.208f, 11.247f)
                lineTo(17.852f, 12f)
                lineTo(19.208f, 12.753f)
                curveTo(20.264f, 13.34f, 20.264f, 14.66f, 19.208f, 15.247f)
                lineTo(11.157f, 19.72f)
                curveTo(10.484f, 20.093f, 9.516f, 20.093f, 8.843f, 19.72f)
                lineTo(0.792f, 15.247f)
                curveTo(-0.264f, 14.66f, -0.264f, 13.34f, 0.792f, 12.753f)
                lineTo(2.148f, 12f)
                lineTo(0.792f, 11.247f)
                curveTo(-0.264f, 10.66f, -0.264f, 9.34f, 0.792f, 8.753f)
                lineTo(2.148f, 8f)
                lineTo(0.792f, 7.247f)
                curveTo(-0.264f, 6.66f, -0.264f, 5.34f, 0.792f, 4.753f)
                lineTo(8.843f, 0.28f)
                curveTo(9.516f, -0.093f, 10.484f, -0.093f, 11.157f, 0.28f)
                close()
                moveTo(11.157f, 11.72f)
                lineTo(15.793f, 9.144f)
                lineTo(17.334f, 10f)
                lineTo(15.793f, 10.856f)
                lineTo(13.734f, 12f)
                lineTo(10.185f, 13.971f)
                curveTo(10.117f, 14.009f, 9.883f, 14.009f, 9.815f, 13.971f)
                lineTo(6.266f, 12f)
                lineTo(4.207f, 10.856f)
                lineTo(2.666f, 10f)
                lineTo(4.207f, 9.144f)
                lineTo(8.843f, 11.72f)
                curveTo(9.516f, 12.093f, 10.484f, 12.093f, 11.157f, 11.72f)
                close()
                moveTo(4.207f, 13.144f)
                lineTo(2.666f, 14f)
                lineTo(9.815f, 17.971f)
                curveTo(9.883f, 18.01f, 10.117f, 18.01f, 10.185f, 17.971f)
                lineTo(17.334f, 14f)
                lineTo(15.793f, 13.144f)
                lineTo(11.157f, 15.72f)
                curveTo(10.484f, 16.093f, 9.516f, 16.093f, 8.843f, 15.72f)
                lineTo(4.207f, 13.144f)
                close()
                moveTo(9.815f, 2.029f)
                curveTo(9.883f, 1.99f, 10.117f, 1.99f, 10.185f, 2.029f)
                lineTo(17.334f, 6f)
                lineTo(10.185f, 9.971f)
                curveTo(10.117f, 10.009f, 9.883f, 10.009f, 9.815f, 9.971f)
                lineTo(2.666f, 6f)
                lineTo(9.815f, 2.029f)
                close()
            }
        }.build()

        return _skill!!
    }


@Suppress("ObjectPropertyName")
private var _skill: ImageVector? = null
