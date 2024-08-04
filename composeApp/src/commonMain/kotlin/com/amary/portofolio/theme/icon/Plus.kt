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

val Icon.Plus: ImageVector
    get() {
        if (_plus != null) {
            return _plus!!
        }
        _plus = Builder(name = "Plus", defaultWidth = 15.0.dp, defaultHeight = 15.0.dp,
                viewportWidth = 15.0f, viewportHeight = 15.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1D1929)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.5f, 4.0f)
                verticalLineTo(11.0f)
                moveTo(4.0f, 7.5f)
                horizontalLineTo(11.0f)
                moveTo(7.5f, 14.5f)
                curveTo(3.634f, 14.5f, 0.5f, 11.366f, 0.5f, 7.5f)
                curveTo(0.5f, 3.634f, 3.634f, 0.5f, 7.5f, 0.5f)
                curveTo(11.366f, 0.5f, 14.5f, 3.634f, 14.5f, 7.5f)
                curveTo(14.5f, 11.366f, 11.366f, 14.5f, 7.5f, 14.5f)
                close()
            }
        }
        .build()
        return _plus!!
    }

private var _plus: ImageVector? = null
