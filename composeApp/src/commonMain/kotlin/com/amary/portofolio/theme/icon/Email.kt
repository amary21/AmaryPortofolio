package com.amary.portofolio.theme.icon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.amary.portofolio.theme.Icon

val Icon.Email: ImageVector
    get() {
        if (_email != null) {
            return _email!!
        }
        _email = ImageVector.Builder(
            name = "Icon",
            defaultWidth = 22.dp,
            defaultHeight = 18.dp,
            viewportWidth = 22f,
            viewportHeight = 18f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2f, 0f)
                horizontalLineTo(20f)
                curveTo(21.105f, 0f, 22f, 0.895f, 22f, 2f)
                verticalLineTo(16f)
                curveTo(22f, 17.105f, 21.105f, 18f, 20f, 18f)
                horizontalLineTo(2f)
                curveTo(0.895f, 18f, 0f, 17.105f, 0f, 16f)
                verticalLineTo(2f)
                curveTo(0f, 0.895f, 0.895f, 0f, 2f, 0f)
                close()
                moveTo(2f, 6.618f)
                verticalLineTo(16f)
                horizontalLineTo(20f)
                verticalLineTo(6.619f)
                lineTo(11f, 11.118f)
                lineTo(2f, 6.618f)
                close()
                moveTo(2f, 4.382f)
                lineTo(11f, 8.882f)
                lineTo(20f, 4.382f)
                verticalLineTo(2f)
                horizontalLineTo(2f)
                verticalLineTo(4.382f)
                close()
            }
        }.build()

        return _email!!
    }

@Suppress("ObjectPropertyName")
private var _email: ImageVector? = null
