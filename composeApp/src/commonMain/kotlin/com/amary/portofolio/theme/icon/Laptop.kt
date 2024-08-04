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

val Icon.Laptop: ImageVector
    get() {
        if (_laptop != null) {
            return _laptop!!
        }
        _laptop = Builder(name = "Laptop", defaultWidth = 15.0.dp, defaultHeight = 15.0.dp,
                viewportWidth = 15.0f, viewportHeight = 15.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1D1929)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(0.0f, 13.5f)
                horizontalLineTo(15.0f)
                moveTo(1.5f, 2.5f)
                lineTo(1.5f, 10.5f)
                curveTo(1.5f, 11.0523f, 1.9477f, 11.5f, 2.5f, 11.5f)
                horizontalLineTo(12.5f)
                curveTo(13.0523f, 11.5f, 13.5f, 11.0523f, 13.5f, 10.5f)
                verticalLineTo(2.5f)
                curveTo(13.5f, 1.9477f, 13.0523f, 1.5f, 12.5f, 1.5f)
                lineTo(2.5f, 1.5f)
                curveTo(1.9477f, 1.5f, 1.5f, 1.9477f, 1.5f, 2.5f)
                close()
            }
        }
        .build()
        return _laptop!!
    }

private var _laptop: ImageVector? = null
