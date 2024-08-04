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

val Icon.User: ImageVector
    get() {
        if (_user != null) {
            return _user!!
        }
        _user = Builder(name = "User", defaultWidth = 15.0.dp, defaultHeight = 15.0.dp,
                viewportWidth = 15.0f, viewportHeight = 15.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1D1929)),
                    strokeLineWidth = 1.0f, strokeLineCap = Square, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.5f, 13.0f)
                verticalLineTo(12.4999f)
                curveTo(3.5f, 10.843f, 4.8432f, 9.5f, 6.5f, 9.5f)
                horizontalLineTo(8.5f)
                curveTo(10.1569f, 9.5f, 11.5f, 10.843f, 11.5f, 12.4999f)
                verticalLineTo(13.0f)
                moveTo(7.5f, 3.5f)
                curveTo(6.3954f, 3.5f, 5.5f, 4.3954f, 5.5f, 5.5f)
                curveTo(5.5f, 6.6046f, 6.3954f, 7.5f, 7.5f, 7.5f)
                curveTo(8.6046f, 7.5f, 9.5f, 6.6046f, 9.5f, 5.5f)
                curveTo(9.5f, 4.3954f, 8.6046f, 3.5f, 7.5f, 3.5f)
                close()
                moveTo(7.5f, 14.5f)
                curveTo(3.634f, 14.5f, 0.5f, 11.366f, 0.5f, 7.5f)
                curveTo(0.5f, 3.634f, 3.634f, 0.5f, 7.5f, 0.5f)
                curveTo(11.366f, 0.5f, 14.5f, 3.634f, 14.5f, 7.5f)
                curveTo(14.5f, 11.366f, 11.366f, 14.5f, 7.5f, 14.5f)
                close()
            }
        }
        .build()
        return _user!!
    }

private var _user: ImageVector? = null
