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

val Icon.Bag: ImageVector
    get() {
        if (_bag != null) {
            return _bag!!
        }
        _bag = Builder(name = "Bag", defaultWidth = 15.0.dp, defaultHeight = 15.0.dp, viewportWidth
                = 15.0f, viewportHeight = 15.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1D1929)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.5f, 4.0f)
                verticalLineTo(3.5f)
                curveTo(4.5f, 1.8432f, 5.8431f, 0.5f, 7.5f, 0.5f)
                curveTo(9.1568f, 0.5f, 10.5f, 1.8432f, 10.5f, 3.5f)
                verticalLineTo(4.0f)
                moveTo(2.4011f, 6.3896f)
                lineTo(1.6234f, 13.3896f)
                curveTo(1.5575f, 13.9819f, 2.0212f, 14.5f, 2.6172f, 14.5f)
                horizontalLineTo(12.3827f)
                curveTo(12.9787f, 14.5f, 13.4424f, 13.9819f, 13.3766f, 13.3896f)
                lineTo(12.5988f, 6.3896f)
                curveTo(12.5426f, 5.8831f, 12.1145f, 5.5f, 11.6049f, 5.5f)
                horizontalLineTo(3.395f)
                curveTo(2.8855f, 5.5f, 2.4574f, 5.8831f, 2.4011f, 6.3896f)
                close()
            }
        }
        .build()
        return _bag!!
    }

private var _bag: ImageVector? = null
