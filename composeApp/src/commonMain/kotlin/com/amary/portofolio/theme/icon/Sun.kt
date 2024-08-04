package com.amary.portofolio.theme.icon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Square
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.amary.portofolio.theme.Icon

val Icon.Sun: ImageVector
    get() {
        if (_sun != null) {
            return _sun!!
        }
        _sun = Builder(name = "Sun", defaultWidth = 15.0.dp, defaultHeight = 15.0.dp, viewportWidth
                = 15.0f, viewportHeight = 15.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1D1929)),
                    strokeLineWidth = 1.0f, strokeLineCap = Square, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.5f, 1.4993f)
                verticalLineTo(0.5f)
                moveTo(7.5f, 14.4908f)
                verticalLineTo(13.4915f)
                moveTo(13.5f, 7.4954f)
                horizontalLineTo(14.5f)
                moveTo(1.5f, 7.4954f)
                horizontalLineTo(0.5f)
                moveTo(2.5f, 2.4987f)
                lineTo(1.5f, 1.4993f)
                moveTo(13.5f, 1.4993f)
                lineTo(12.5f, 2.4987f)
                moveTo(2.5f, 12.4921f)
                lineTo(1.5f, 13.4915f)
                moveTo(13.5f, 13.4915f)
                lineTo(12.5f, 12.4921f)
                moveTo(10.5f, 7.4954f)
                curveTo(10.5f, 9.1513f, 9.157f, 10.4935f, 7.5f, 10.4935f)
                curveTo(5.843f, 10.4935f, 4.5f, 9.1513f, 4.5f, 7.4954f)
                curveTo(4.5f, 5.8395f, 5.843f, 4.4974f, 7.5f, 4.4974f)
                curveTo(9.157f, 4.4974f, 10.5f, 5.8395f, 10.5f, 7.4954f)
                close()
            }
        }
        .build()
        return _sun!!
    }

private var _sun: ImageVector? = null
