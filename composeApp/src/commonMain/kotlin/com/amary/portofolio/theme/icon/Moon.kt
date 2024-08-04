package com.amary.portofolio.theme.icon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.amary.portofolio.theme.Icon

val Icon.Moon: ImageVector
    get() {
        if (_moon != null) {
            return _moon!!
        }
        _moon = Builder(name = "Moon", defaultWidth = 15.0.dp, defaultHeight = 15.0.dp,
                viewportWidth = 15.0f, viewportHeight = 15.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1D1929)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(1.6608f, 11.3619f)
                curveTo(2.093f, 11.4524f, 2.541f, 11.5f, 3.0001f, 11.5f)
                curveTo(6.5899f, 11.5f, 9.5f, 8.5899f, 9.5f, 5.0f)
                curveTo(9.5f, 3.2548f, 8.8123f, 1.6703f, 7.693f, 0.5026f)
                curveTo(11.4698f, 0.6048f, 14.5f, 3.6985f, 14.5f, 7.5f)
                curveTo(14.5f, 11.366f, 11.366f, 14.5f, 7.5f, 14.5f)
                curveTo(5.0614f, 14.5f, 2.914f, 13.253f, 1.6608f, 11.3619f)
                close()
            }
        }
        .build()
        return _moon!!
    }

private var _moon: ImageVector? = null
