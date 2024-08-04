package com.amary.portofolio

import amaryportofolio.composeapp.generated.resources.Inter_Medium
import amaryportofolio.composeapp.generated.resources.Inter_Regular
import amaryportofolio.composeapp.generated.resources.Inter_SemiBold
import amaryportofolio.composeapp.generated.resources.Res
import amaryportofolio.composeapp.generated.resources.ic_cyclone
import amaryportofolio.composeapp.generated.resources.ic_rotate_right
import amaryportofolio.composeapp.generated.resources.img_profile
import amaryportofolio.composeapp.generated.resources.open_github
import amaryportofolio.composeapp.generated.resources.run
import amaryportofolio.composeapp.generated.resources.stop
import amaryportofolio.composeapp.generated.resources.theme
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.amary.portofolio.theme.AppTheme
import com.amary.portofolio.theme.Icon
import com.amary.portofolio.theme.LocalThemeIsDark
import com.amary.portofolio.theme.icon.Bag
import com.amary.portofolio.theme.icon.Circle
import com.amary.portofolio.theme.icon.Copy
import com.amary.portofolio.theme.icon.Home
import com.amary.portofolio.theme.icon.Laptop
import com.amary.portofolio.theme.icon.Moon
import com.amary.portofolio.theme.icon.Plus
import com.amary.portofolio.theme.icon.Sun
import com.amary.portofolio.theme.icon.User
import kotlinx.coroutines.isActive
import org.jetbrains.compose.resources.Font
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import org.jetbrains.compose.resources.vectorResource

@Composable
internal fun App() = AppTheme {
    var isDark by LocalThemeIsDark.current
    val iconTheme = remember(isDark) {
        if (isDark) Icon.Sun
        else Icon.Moon
    }

    Scaffold(
        containerColor = MaterialTheme.colorScheme.onBackground,
        topBar = {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 12.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Card(
                    modifier = Modifier
                        .width(560.dp)
                        .padding(
                            horizontal = 8.dp,
                            vertical = 12.dp
                        ),
                    colors = CardDefaults.cardColors(
                        containerColor = MaterialTheme.colorScheme.onPrimary,
                    ),
                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 2.dp,
                    )
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Row {
                            IconButton(
                                colors = IconButtonDefaults.iconButtonColors().copy(
                                    contentColor = MaterialTheme.colorScheme.secondary
                                ),
                                onClick = {}
                            ) {
                                Icon(
                                    imageVector = Icon.Home,
                                    contentDescription = ""
                                )
                            }
                            IconButton(
                                colors = IconButtonDefaults.iconButtonColors().copy(
                                    contentColor = MaterialTheme.colorScheme.secondary
                                ),
                                onClick = {}
                            ) {
                                Icon(
                                    imageVector = Icon.User,
                                    contentDescription = ""
                                )
                            }
                            IconButton(
                                colors = IconButtonDefaults.iconButtonColors().copy(
                                    contentColor = MaterialTheme.colorScheme.secondary
                                ),
                                onClick = {}
                            ) {
                                Icon(
                                    imageVector = Icon.Laptop,
                                    contentDescription = ""
                                )
                            }
                            IconButton(
                                colors = IconButtonDefaults.iconButtonColors().copy(
                                    contentColor = MaterialTheme.colorScheme.secondary
                                ),
                                onClick = {}
                            ) {
                                Icon(
                                    imageVector = Icon.Bag,
                                    contentDescription = ""
                                )
                            }
                        }
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                        ) {
                            IconButton(
                                colors = IconButtonDefaults.iconButtonColors().copy(
                                    contentColor = MaterialTheme.colorScheme.secondary
                                ),
                                onClick = {
                                    isDark = !isDark
                                }
                            ) {
                                Icon(
                                    imageVector = iconTheme,
                                    contentDescription = ""
                                )
                            }
                            Button(
                                modifier = Modifier
                                    .padding(end = 8.dp)
                                    .height(32.dp),
                                colors = ButtonDefaults.buttonColors().copy(
                                    containerColor = MaterialTheme.colorScheme.primary,
                                    contentColor = Color.White
                                ),
                                shape = RoundedCornerShape(6.dp),
                                contentPadding = PaddingValues(4.dp),
                                onClick = {}
                            ) {
                                Icon(
                                    modifier = Modifier.padding(horizontal = 4.dp),
                                    imageVector = Icon.Plus,
                                    contentDescription = ""
                                )
                                Text(
                                    modifier = Modifier.padding(horizontal = 4.dp),
                                    text = "Hire Me",
                                )
                            }
                        }
                    }
                }
            }
        },
        content = {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        top = it.calculateTopPadding(),
                        bottom = 8.dp,
                        start = 8.dp,
                        end = 8.dp,
                    ),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Card(
                    modifier = Modifier.width(560.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = MaterialTheme.colorScheme.onPrimary,
                    ),
                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 2.dp,
                    )
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .windowInsetsPadding(WindowInsets.safeDrawing)
                            .padding(16.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                        ) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Icon(
                                    modifier = Modifier
                                        .padding(end = 8.dp)
                                        .size(4.dp),
                                    imageVector = Icon.Circle,
                                    contentDescription = ""
                                )
                                Text(
                                    text = "Mobile Developer",
                                    fontFamily = FontFamily(Font(Res.font.Inter_Medium)),
                                    style = MaterialTheme.typography.titleMedium
                                )
                            }
                            Card(
                                colors = CardDefaults.cardColors(
                                    containerColor = MaterialTheme.colorScheme.onTertiary,
                                ),
                            ) {
                                Row(
                                    modifier = Modifier.padding(horizontal = 8.dp),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Icon(
                                        modifier = Modifier
                                            .padding(end = 4.dp)
                                            .size(4.dp),
                                        imageVector = Icon.Circle,
                                        contentDescription = "",
                                        tint = MaterialTheme.colorScheme.tertiary
                                    )
                                    Text(
                                        text = "AVAILABLE FOR WORK",
                                        fontFamily = FontFamily(Font(Res.font.Inter_Regular)),
                                        color = MaterialTheme.colorScheme.tertiary,
                                        style = MaterialTheme.typography.bodySmall,
                                        fontSize = 8.sp,
                                    )
                                }
                            }
                        }

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                        ) {
                            Column (
                                modifier = Modifier
                                    .weight(2f)
                            ) {
                                Text(
                                    text = "I'm Taufik Amaryansyah",
                                    fontFamily = FontFamily(Font(Res.font.Inter_SemiBold)),
                                    style = MaterialTheme.typography.headlineSmall
                                )
                                Text(
                                    text = "Mobile Developer from Subang, ID.\nCurrently working at Kreditplus.",
                                    fontFamily = FontFamily(Font(Res.font.Inter_Medium)),
                                    style = MaterialTheme.typography.bodyMedium
                                )
                                Row {
                                    Button(
                                        modifier = Modifier
                                            .padding(end = 8.dp)
                                            .height(32.dp),
                                        colors = ButtonDefaults.buttonColors().copy(
                                            containerColor = MaterialTheme.colorScheme.primary,
                                            contentColor = Color.White
                                        ),
                                        shape = RoundedCornerShape(6.dp),
                                        contentPadding = PaddingValues(4.dp),
                                        onClick = {}
                                    ) {
                                        Icon(
                                            modifier = Modifier.padding(horizontal = 4.dp),
                                            imageVector = Icon.Plus,
                                            contentDescription = ""
                                        )
                                        Text(
                                            modifier = Modifier.padding(horizontal = 4.dp),
                                            text = "Hire Me",
                                        )
                                    }
                                    OutlinedButton(
                                        modifier = Modifier
                                            .padding(end = 8.dp)
                                            .height(32.dp),
                                        colors = ButtonDefaults.outlinedButtonColors().copy(
                                            contentColor = MaterialTheme.colorScheme.primary
                                        ),
                                        shape = RoundedCornerShape(6.dp),
                                        contentPadding = PaddingValues(4.dp),
                                        onClick = {}
                                    ) {
                                        Icon(
                                            modifier = Modifier.padding(horizontal = 4.dp),
                                            imageVector = Icon.Copy,
                                            contentDescription = ""
                                        )
                                        Text(
                                            modifier = Modifier.padding(horizontal = 4.dp),
                                            text = "Copy Email",
                                        )
                                    }
                                }
                            }
                            Card(
                                modifier = Modifier
                                    .width(120.dp)
                                    .height(160.dp),
                                shape = CircleShape,
                                elevation = CardDefaults.cardElevation(
                                    defaultElevation = 6.dp,
                                )
                            ) {
                                Image(
                                    painter = painterResource(Res.drawable.img_profile),
                                    contentDescription = null,
                                    contentScale = ContentScale.Crop,
                                )
                            }
                        }

                        var isRotating by remember { mutableStateOf(false) }

                        val rotate = remember { Animatable(0f) }
                        val target = 360f
                        if (isRotating) {
                            LaunchedEffect(Unit) {
                                while (isActive) {
                                    val remaining = (target - rotate.value) / target
                                    rotate.animateTo(target, animationSpec = tween((1_000 * remaining).toInt(), easing = LinearEasing))
                                    rotate.snapTo(0f)
                                }
                            }
                        }

                        Image(
                            modifier = Modifier
                                .size(250.dp)
                                .padding(16.dp)
                                .run { rotate(rotate.value) },
                            imageVector = vectorResource(Res.drawable.ic_cyclone),
                            colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.onSurface),
                            contentDescription = null
                        )

                        ElevatedButton(
                            modifier = Modifier
                                .padding(horizontal = 8.dp, vertical = 4.dp)
                                .widthIn(min = 200.dp),
                            onClick = { isRotating = !isRotating },
                            content = {
                                Icon(vectorResource(Res.drawable.ic_rotate_right), contentDescription = null)
                                Spacer(Modifier.size(ButtonDefaults.IconSpacing))
                                Text(
                                    stringResource(if (isRotating) Res.string.stop else Res.string.run)
                                )
                            }
                        )

                        ElevatedButton(
                            modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp).widthIn(min = 200.dp),
                            onClick = { isDark = !isDark },
                            content = {
                                Icon(iconTheme, contentDescription = null)
                                Spacer(Modifier.size(ButtonDefaults.IconSpacing))
                                Text(stringResource(Res.string.theme))
                            }
                        )

                        val uriHandler = LocalUriHandler.current
                        TextButton(
                            modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp).widthIn(min = 200.dp),
                            onClick = { uriHandler.openUri("https://github.com/terrakok") },
                        ) {
                            Text(stringResource(Res.string.open_github))
                        }
                    }
                }
            }
        }
    )
}
