package com.amary.portofolio.theme.icon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.amary.portofolio.theme.Icon

val Icon.Circle: ImageVector
    get() {
        if (_circle != null) {
            return _circle!!
        }
        _circle = Builder(name = "Circle", defaultWidth = 15.0.dp, defaultHeight = 15.0.dp,
                viewportWidth = 15.0f, viewportHeight = 15.0f).apply {
            path(fill = SolidColor(Color(0xFF1D1929)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.5f, 0.0f)
                curveTo(3.3579f, 0.0f, 0.0f, 3.3579f, 0.0f, 7.5f)
                curveTo(0.0f, 11.6421f, 3.3579f, 15.0f, 7.5f, 15.0f)
                curveTo(11.6421f, 15.0f, 15.0f, 11.6421f, 15.0f, 7.5f)
                curveTo(15.0f, 3.3579f, 11.6421f, 0.0f, 7.5f, 0.0f)
                close()
            }
        }
        .build()
        return _circle!!
    }

private var _circle: ImageVector? = null
