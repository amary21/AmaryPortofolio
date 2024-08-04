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

val Icon.Home: ImageVector
    get() {
        if (_home != null) {
            return _home!!
        }
        _home = Builder(name = "Home", defaultWidth = 15.0.dp, defaultHeight = 15.0.dp,
                viewportWidth = 15.0f, viewportHeight = 15.0f).apply {
            path(fill = SolidColor(Color(0xFF1D1929)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.5f, 0.5f)
                lineTo(7.8535f, 0.1464f)
                curveTo(7.6583f, -0.0488f, 7.3417f, -0.0488f, 7.1465f, 0.1464f)
                lineTo(7.5f, 0.5f)
                close()
                moveTo(1.5f, 6.5f)
                lineTo(1.1465f, 6.1465f)
                lineTo(1.0f, 6.2929f)
                verticalLineTo(6.5f)
                horizontalLineTo(1.5f)
                close()
                moveTo(13.5f, 6.5f)
                horizontalLineTo(14.0f)
                verticalLineTo(6.2929f)
                lineTo(13.8536f, 6.1465f)
                lineTo(13.5f, 6.5f)
                close()
                moveTo(13.8536f, 6.1465f)
                lineTo(7.8535f, 0.1464f)
                lineTo(7.1465f, 0.8536f)
                lineTo(13.1464f, 6.8535f)
                lineTo(13.8536f, 6.1465f)
                close()
                moveTo(7.1465f, 0.1464f)
                lineTo(1.1465f, 6.1465f)
                lineTo(1.8535f, 6.8535f)
                lineTo(7.8535f, 0.8536f)
                lineTo(7.1465f, 0.1464f)
                close()
                moveTo(14.0f, 13.5f)
                verticalLineTo(6.5f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.5f)
                horizontalLineTo(14.0f)
                close()
                moveTo(1.0f, 6.5f)
                verticalLineTo(13.5f)
                horizontalLineTo(2.0f)
                verticalLineTo(6.5f)
                horizontalLineTo(1.0f)
                close()
                moveTo(2.5f, 15.0f)
                horizontalLineTo(12.5f)
                verticalLineTo(14.0f)
                horizontalLineTo(2.5f)
                verticalLineTo(15.0f)
                close()
                moveTo(13.0f, 13.5f)
                curveTo(13.0f, 13.7761f, 12.7761f, 14.0f, 12.5f, 14.0f)
                verticalLineTo(15.0f)
                curveTo(13.3284f, 15.0f, 14.0f, 14.3284f, 14.0f, 13.5f)
                horizontalLineTo(13.0f)
                close()
                moveTo(1.0f, 13.5f)
                curveTo(1.0f, 14.3284f, 1.6716f, 15.0f, 2.5f, 15.0f)
                verticalLineTo(14.0f)
                curveTo(2.2239f, 14.0f, 2.0f, 13.7761f, 2.0f, 13.5f)
                horizontalLineTo(1.0f)
                close()
            }
        }
        .build()
        return _home!!
    }

private var _home: ImageVector? = null
