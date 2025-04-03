package com.amary.portofolio.theme.icon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.amary.portofolio.theme.Icon

val Icon.Call: ImageVector
    get() {
        if (_call != null) {
            return _call!!
        }
        _call = ImageVector.Builder(
            name = "Icon",
            defaultWidth = 20.dp,
            defaultHeight = 20.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.857f, 6.338f)
                curveTo(9.375f, 5.64f, 9.56f, 4.904f, 8.974f, 4.254f)
                curveTo(7.659f, 2.414f, 6.775f, 1.277f, 6.22f, 0.729f)
                curveTo(5.166f, -0.313f, 3.431f, -0.172f, 2.518f, 0.728f)
                curveTo(2.027f, 1.211f, 1.861f, 1.377f, 1.357f, 1.889f)
                curveTo(-1.448f, 4.696f, 0.263f, 10.63f, 4.811f, 15.183f)
                curveTo(9.359f, 19.735f, 15.293f, 21.447f, 18.104f, 18.634f)
                curveTo(18.569f, 18.186f, 18.962f, 17.792f, 19.273f, 17.464f)
                curveTo(20.168f, 16.518f, 20.304f, 14.86f, 19.267f, 13.783f)
                curveTo(18.735f, 13.23f, 17.65f, 12.389f, 15.733f, 11.017f)
                curveTo(15.146f, 10.492f, 14.449f, 10.606f, 13.811f, 11.024f)
                curveTo(13.504f, 11.226f, 13.281f, 11.43f, 12.858f, 11.852f)
                lineTo(12.092f, 12.619f)
                curveTo(11.991f, 12.72f, 10.621f, 12.033f, 9.291f, 10.702f)
                curveTo(7.96f, 9.37f, 7.274f, 7.999f, 7.374f, 7.899f)
                lineTo(8.141f, 7.131f)
                curveTo(8.275f, 6.997f, 8.339f, 6.933f, 8.421f, 6.846f)
                curveTo(8.592f, 6.667f, 8.734f, 6.503f, 8.857f, 6.338f)
                close()
                moveTo(13.506f, 14.033f)
                lineTo(14.272f, 13.266f)
                curveTo(14.504f, 13.034f, 14.655f, 12.891f, 14.777f, 12.792f)
                curveTo(16.457f, 13.998f, 17.43f, 14.757f, 17.827f, 15.17f)
                curveTo(18.066f, 15.418f, 18.029f, 15.87f, 17.821f, 16.089f)
                curveTo(17.534f, 16.392f, 17.161f, 16.765f, 16.704f, 17.207f)
                curveTo(14.886f, 19.026f, 10.096f, 17.644f, 6.225f, 13.769f)
                curveTo(2.353f, 9.893f, 0.972f, 5.103f, 2.776f, 3.298f)
                curveTo(3.278f, 2.788f, 3.437f, 2.629f, 3.92f, 2.153f)
                curveTo(4.102f, 1.974f, 4.596f, 1.934f, 4.816f, 2.152f)
                curveTo(5.243f, 2.574f, 6.035f, 3.588f, 7.201f, 5.211f)
                curveTo(7.14f, 5.286f, 7.065f, 5.371f, 6.973f, 5.467f)
                curveTo(6.906f, 5.538f, 6.85f, 5.595f, 6.727f, 5.718f)
                lineTo(5.961f, 6.484f)
                curveTo(4.658f, 7.787f, 5.768f, 10.005f, 7.877f, 12.116f)
                curveTo(9.984f, 14.225f, 12.203f, 15.336f, 13.506f, 14.033f)
                close()
            }
        }.build()

        return _call!!
    }

@Suppress("ObjectPropertyName")
private var _call: ImageVector? = null
