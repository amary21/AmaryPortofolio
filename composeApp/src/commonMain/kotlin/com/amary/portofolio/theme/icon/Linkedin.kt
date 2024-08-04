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

val Icon.Linkedin: ImageVector
    get() {
        if (_linkedin != null) {
            return _linkedin!!
        }
        _linkedin = Builder(name = "Linkedin", defaultWidth = 15.0.dp, defaultHeight = 15.0.dp,
                viewportWidth = 15.0f, viewportHeight = 15.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1D1929)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.5f, 6.0f)
                verticalLineTo(11.0f)
                moveTo(10.5f, 11.0f)
                verticalLineTo(8.5f)
                curveTo(10.5f, 7.3954f, 9.6046f, 6.5f, 8.5f, 6.5f)
                curveTo(7.3954f, 6.5f, 6.5f, 7.3954f, 6.5f, 8.5f)
                verticalLineTo(11.0f)
                verticalLineTo(6.0f)
                moveTo(4.0f, 4.5f)
                horizontalLineTo(5.0f)
                moveTo(1.5f, 0.5f)
                horizontalLineTo(13.5f)
                curveTo(14.0523f, 0.5f, 14.5f, 0.9477f, 14.5f, 1.5f)
                verticalLineTo(13.5f)
                curveTo(14.5f, 14.0523f, 14.0523f, 14.5f, 13.5f, 14.5f)
                horizontalLineTo(1.5f)
                curveTo(0.9477f, 14.5f, 0.5f, 14.0523f, 0.5f, 13.5f)
                verticalLineTo(1.5f)
                curveTo(0.5f, 0.9477f, 0.9477f, 0.5f, 1.5f, 0.5f)
                close()
            }
        }
        .build()
        return _linkedin!!
    }

private var _linkedin: ImageVector? = null
