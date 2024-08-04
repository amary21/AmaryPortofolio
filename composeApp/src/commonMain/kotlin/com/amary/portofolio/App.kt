package com.amary.portofolio

import amaryportofolio.composeapp.generated.resources.Inter_Medium
import amaryportofolio.composeapp.generated.resources.Inter_Regular
import amaryportofolio.composeapp.generated.resources.Inter_SemiBold
import amaryportofolio.composeapp.generated.resources.Res
import amaryportofolio.composeapp.generated.resources.ic_cyclone
import amaryportofolio.composeapp.generated.resources.img_kreditplus
import amaryportofolio.composeapp.generated.resources.img_profile
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
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.ArrowForward
import androidx.compose.material.icons.automirrored.rounded.KeyboardArrowRight
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
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.amary.portofolio.theme.AppTheme
import com.amary.portofolio.theme.Icon
import com.amary.portofolio.theme.LocalThemeIsDark
import com.amary.portofolio.theme.icon.Bag
import com.amary.portofolio.theme.icon.Circle
import com.amary.portofolio.theme.icon.Copy
import com.amary.portofolio.theme.icon.Github
import com.amary.portofolio.theme.icon.Home
import com.amary.portofolio.theme.icon.Laptop
import com.amary.portofolio.theme.icon.Linkedin
import com.amary.portofolio.theme.icon.Moon
import com.amary.portofolio.theme.icon.Plus
import com.amary.portofolio.theme.icon.Sun
import com.amary.portofolio.theme.icon.Twitter
import com.amary.portofolio.theme.icon.User
import kotlinx.coroutines.isActive
import org.jetbrains.compose.resources.Font
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.vectorResource

@Composable
internal fun App() = AppTheme {
    var isDark by LocalThemeIsDark.current
    val iconTheme = remember(isDark) {
        if (isDark) Icon.Sun
        else Icon.Moon
    }

    val rotate = remember { Animatable(0f) }
    val target = 360f
    LaunchedEffect(Unit) {
        while (isActive) {
            val remaining = (target - rotate.value) / target
            rotate.animateTo(target, animationSpec = tween((1_000 * remaining).toInt(), easing = LinearEasing))
            rotate.snapTo(0f)
        }
    }

    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .windowInsetsPadding(WindowInsets.safeDrawing),
        containerColor = MaterialTheme.colorScheme.onBackground,
        topBar = {
            Column(
                modifier = Modifier.fillMaxWidth(),
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
                    )
                    .verticalScroll(state = rememberScrollState()),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Card(
                    modifier = Modifier
                        .padding(bottom = 8.dp)
                        .width(560.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = MaterialTheme.colorScheme.onPrimary,
                    ),
                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 2.dp,
                    )
                ) {
                    Column(
                        modifier = Modifier.padding(vertical = 16.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 16.dp),
                            horizontalArrangement = Arrangement.SpaceBetween,
                        ) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Image(
                                    modifier = Modifier
                                        .padding(end = 8.dp)
                                        .size(16.dp)
                                        .run { rotate(rotate.value) },
                                    imageVector = vectorResource(Res.drawable.ic_cyclone),
                                    colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.primaryContainer),
                                    contentDescription = null
                                )
                                Text(
                                    text = "Mobile Developer",
                                    fontFamily = FontFamily(Font(Res.font.Inter_Medium)),
                                    style = MaterialTheme.typography.titleMedium,
                                    color = MaterialTheme.colorScheme.primaryContainer,
                                )
                            }
                            Card(
                                colors = CardDefaults.cardColors(
                                    containerColor = MaterialTheme.colorScheme.onTertiary,
                                ),
                            ) {
                                Row(
                                    modifier = Modifier.padding(
                                        horizontal = 8.dp,
                                        vertical = 4.dp
                                    ),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Icon(
                                        modifier = Modifier
                                            .padding(end = 4.dp)
                                            .size(8.dp),
                                        imageVector = Icon.Circle,
                                        contentDescription = "",
                                        tint = MaterialTheme.colorScheme.tertiary
                                    )
                                    Text(
                                        text = "AVAILABLE FOR WORK",
                                        fontFamily = FontFamily(Font(Res.font.Inter_Regular)),
                                        color = MaterialTheme.colorScheme.tertiary,
                                        style = MaterialTheme.typography.bodySmall,
                                    )
                                }
                            }
                        }

                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(
                                    vertical = 28.dp,
                                    horizontal = 16.dp
                                ),
                            horizontalArrangement = Arrangement.SpaceBetween,
                        ) {
                            Column (
                                modifier = Modifier
                                    .weight(2f)
                            ) {
                                Text(
                                    text = "I'm Taufik Amaryansyah",
                                    fontFamily = FontFamily(Font(Res.font.Inter_SemiBold)),
                                    style = MaterialTheme.typography.headlineSmall,
                                    color = MaterialTheme.colorScheme.secondary
                                )
                                Text(
                                    modifier = Modifier.padding(
                                        top = 8.dp,
                                        bottom = 16.dp
                                    ),
                                    text = "Mobile Developer from Subang, ID.\nCurrently working at Kreditplus.",
                                    fontFamily = FontFamily(Font(Res.font.Inter_Medium)),
                                    style = MaterialTheme.typography.bodyMedium,
                                    color = MaterialTheme.colorScheme.primaryContainer
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
                                        shape = RoundedCornerShape(6.dp),
                                        contentPadding = PaddingValues(4.dp),
                                        onClick = {}
                                    ) {
                                        Icon(
                                            modifier = Modifier.padding(horizontal = 4.dp),
                                            imageVector = Icon.Copy,
                                            contentDescription = "",
                                            tint = MaterialTheme.colorScheme.primaryContainer
                                        )
                                        Text(
                                            text = "Copy Email",
                                            color =  MaterialTheme.colorScheme.secondary
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

                        Card(
                            modifier = Modifier
                                .padding(horizontal = 8.dp)
                                .fillMaxWidth(),
                            colors = CardDefaults.cardColors(
                                containerColor = MaterialTheme.colorScheme.onSecondary,
                            ),
                        ) {
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(
                                        horizontal = 10.dp,
                                        vertical = 20.dp
                                    ),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Row(verticalAlignment = Alignment.CenterVertically) {
                                    Icon(
                                        modifier = Modifier
                                            .padding(end = 8.dp)
                                            .size(8.dp),
                                        imageVector = Icon.Circle,
                                        contentDescription = "",
                                        tint = MaterialTheme.colorScheme.onPrimaryContainer
                                    )
                                    Text(
                                        text = "Projects",
                                        fontFamily = FontFamily(Font(Res.font.Inter_Medium)),
                                        style = MaterialTheme.typography.titleMedium,
                                        color = MaterialTheme.colorScheme.primaryContainer,
                                    )
                                }
                                ElevatedButton(
                                    modifier = Modifier.height(32.dp),
                                    shape = RoundedCornerShape(6.dp),
                                    contentPadding = PaddingValues(4.dp),
                                    colors = ButtonDefaults.elevatedButtonColors().copy(
                                        containerColor = MaterialTheme.colorScheme.secondaryContainer,
                                    ),
                                    onClick = {}
                                ) {
                                    Text(
                                        modifier = Modifier.padding(horizontal = 4.dp),
                                        text = "View All",
                                        color =  MaterialTheme.colorScheme.secondary
                                    )
                                    Icon(
                                        modifier = Modifier.size(16.dp),
                                        imageVector = Icons.AutoMirrored.Rounded.ArrowForward,
                                        contentDescription = "",
                                        tint = MaterialTheme.colorScheme.primaryContainer
                                    )
                                }
                            }
                            Card(
                                modifier = Modifier
                                    .padding(
                                        horizontal = 16.dp,
                                        vertical = 4.dp
                                    )
                                    .fillMaxWidth(),
                                elevation = CardDefaults.cardElevation(
                                    defaultElevation = 2.dp,
                                ),
                                colors = CardDefaults.cardColors(
                                    containerColor = MaterialTheme.colorScheme.secondaryContainer,
                                ),
                            ) {
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(12.dp),
                                    horizontalArrangement = Arrangement.SpaceBetween,
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Image(
                                        modifier = Modifier
                                            .size(48.dp)
                                            .clip(CircleShape),
                                        painter = painterResource(Res.drawable.img_kreditplus),
                                        contentDescription = "",
                                    )
                                    Column(
                                        modifier = Modifier
                                            .padding(start = 16.dp)
                                            .weight(1f)
                                    ) {
                                        Text(
                                            text = "Kreditplus Mobile",
                                            fontFamily = FontFamily(Font(Res.font.Inter_SemiBold)),
                                            style = MaterialTheme.typography.titleSmall,
                                            color = MaterialTheme.colorScheme.secondary
                                        )
                                        Text(
                                            text = "consumer financing service app",
                                            fontFamily = FontFamily(Font(Res.font.Inter_Medium)),
                                            style = MaterialTheme.typography.bodySmall,
                                            color = MaterialTheme.colorScheme.primaryContainer
                                        )
                                    }
                                    Icon(
                                        imageVector = Icons.AutoMirrored.Rounded.KeyboardArrowRight,
                                        contentDescription = "",
                                        tint = MaterialTheme.colorScheme.primaryContainer
                                    )
                                }
                            }
                            Card(
                                modifier = Modifier
                                    .padding(
                                        horizontal = 16.dp,
                                        vertical = 4.dp
                                    )
                                    .fillMaxWidth(),
                                elevation = CardDefaults.cardElevation(
                                    defaultElevation = 2.dp,
                                ),
                                colors = CardDefaults.cardColors(
                                    containerColor = MaterialTheme.colorScheme.secondaryContainer,
                                ),
                            ) {
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(12.dp),
                                    horizontalArrangement = Arrangement.SpaceBetween,
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Image(
                                        modifier = Modifier
                                            .size(48.dp)
                                            .clip(CircleShape),
                                        painter = painterResource(Res.drawable.img_kreditplus),
                                        contentDescription = "",
                                    )
                                    Column(
                                        modifier = Modifier
                                            .padding(start = 16.dp)
                                            .weight(1f)
                                    ) {
                                        Text(
                                            text = "Kreditplus Mobile",
                                            fontFamily = FontFamily(Font(Res.font.Inter_SemiBold)),
                                            style = MaterialTheme.typography.titleSmall,
                                            color = MaterialTheme.colorScheme.secondary
                                        )
                                        Text(
                                            text = "consumer financing service app",
                                            fontFamily = FontFamily(Font(Res.font.Inter_Medium)),
                                            style = MaterialTheme.typography.bodySmall,
                                            color = MaterialTheme.colorScheme.primaryContainer
                                        )
                                    }
                                    Icon(
                                        imageVector = Icons.AutoMirrored.Rounded.KeyboardArrowRight,
                                        contentDescription = "",
                                        tint = MaterialTheme.colorScheme.primaryContainer
                                    )
                                }
                            }
                            Card(
                                modifier = Modifier
                                    .padding(
                                        horizontal = 16.dp,
                                        vertical = 4.dp
                                    )
                                    .fillMaxWidth(),
                                elevation = CardDefaults.cardElevation(
                                    defaultElevation = 2.dp,
                                ),
                                colors = CardDefaults.cardColors(
                                    containerColor = MaterialTheme.colorScheme.secondaryContainer,
                                ),
                            ) {
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(12.dp),
                                    horizontalArrangement = Arrangement.SpaceBetween,
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Image(
                                        modifier = Modifier
                                            .size(48.dp)
                                            .clip(CircleShape),
                                        painter = painterResource(Res.drawable.img_kreditplus),
                                        contentDescription = "",
                                    )
                                    Column(
                                        modifier = Modifier
                                            .padding(start = 16.dp)
                                            .weight(1f)
                                    ) {
                                        Text(
                                            text = "Kreditplus Mobile",
                                            fontFamily = FontFamily(Font(Res.font.Inter_SemiBold)),
                                            style = MaterialTheme.typography.titleSmall,
                                            color = MaterialTheme.colorScheme.secondary
                                        )
                                        Text(
                                            text = "consumer financing service app",
                                            fontFamily = FontFamily(Font(Res.font.Inter_Medium)),
                                            style = MaterialTheme.typography.bodySmall,
                                            color = MaterialTheme.colorScheme.primaryContainer
                                        )
                                    }
                                    Icon(
                                        imageVector = Icons.AutoMirrored.Rounded.KeyboardArrowRight,
                                        contentDescription = "",
                                        tint = MaterialTheme.colorScheme.primaryContainer
                                    )
                                }
                            }
                            Spacer(modifier = Modifier.height(16.dp))
                        }

                        Text(
                            modifier = Modifier.padding(top = 28.dp),
                            text = "Let’s work together.",
                            fontFamily = FontFamily(Font(Res.font.Inter_SemiBold)),
                            style = MaterialTheme.typography.headlineSmall,
                            color = MaterialTheme.colorScheme.secondary,
                            textAlign = TextAlign.Center
                        )
                        Text(
                            modifier = Modifier.padding(vertical = 8.dp),
                            text = "Building the future, one app at a time.",
                            fontFamily = FontFamily(Font(Res.font.Inter_Medium)),
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.primaryContainer,
                            textAlign = TextAlign.Center
                        )
                        Row(modifier = Modifier.padding(vertical = 8.dp)) {
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
                                shape = RoundedCornerShape(6.dp),
                                contentPadding = PaddingValues(4.dp),
                                onClick = {}
                            ) {
                                Icon(
                                    modifier = Modifier.padding(horizontal = 4.dp),
                                    imageVector = Icon.Copy,
                                    contentDescription = "",
                                    tint = MaterialTheme.colorScheme.primaryContainer
                                )
                                Text(
                                    modifier = Modifier.padding(horizontal = 4.dp),
                                    text = "Copy Email",
                                    color =  MaterialTheme.colorScheme.secondary
                                )
                            }
                        }

                        Card(
                            modifier = Modifier
                                .padding(
                                    start = 8.dp,
                                    end = 8.dp,
                                    top = 24.dp,
                                    bottom = 8.dp
                                )
                                .fillMaxWidth(),
                            colors = CardDefaults.cardColors(
                                containerColor = MaterialTheme.colorScheme.onSecondary,
                            ),
                        ) {
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(
                                        horizontal = 10.dp,
                                        vertical = 20.dp
                                    ),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Row(
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Icon(
                                        modifier = Modifier
                                            .padding(end = 8.dp)
                                            .size(8.dp),
                                        imageVector = Icon.Circle,
                                        contentDescription = "",
                                        tint = MaterialTheme.colorScheme.onPrimaryContainer
                                    )
                                    Text(
                                        text = "Follow Me",
                                        fontFamily = FontFamily(Font(Res.font.Inter_Medium)),
                                        style = MaterialTheme.typography.titleMedium,
                                        color = MaterialTheme.colorScheme.primaryContainer,
                                    )
                                }
                                Row {
                                    Card(
                                        modifier = Modifier.padding(horizontal = 4.dp),
                                        shape = CircleShape,
                                        elevation = CardDefaults.cardElevation(
                                            defaultElevation = 2.dp,
                                        ),
                                        colors = CardDefaults.cardColors(
                                            containerColor = MaterialTheme.colorScheme.onSecondaryContainer,
                                        ),
                                    ) {
                                        Icon(
                                            modifier = Modifier
                                                .padding(8.dp)
                                                .size(24.dp),
                                            imageVector = Icon.Github,
                                            contentDescription = "",
                                            tint = MaterialTheme.colorScheme.primaryContainer
                                        )
                                    }
                                    Card(
                                        modifier = Modifier.padding(horizontal = 4.dp),
                                        shape = CircleShape,
                                        elevation = CardDefaults.cardElevation(
                                            defaultElevation = 2.dp,
                                        ),
                                        colors = CardDefaults.cardColors(
                                            containerColor = MaterialTheme.colorScheme.onSecondaryContainer,
                                        ),
                                    ) {
                                        Icon(
                                            modifier = Modifier
                                                .padding(8.dp)
                                                .size(24.dp),
                                            imageVector = Icon.Twitter,
                                            contentDescription = "",
                                            tint = MaterialTheme.colorScheme.primaryContainer
                                        )
                                    }
                                    Card(
                                        modifier = Modifier.padding(horizontal = 4.dp),
                                        shape = CircleShape,
                                        elevation = CardDefaults.cardElevation(
                                            defaultElevation = 2.dp,
                                        ),
                                        colors = CardDefaults.cardColors(
                                            containerColor = MaterialTheme.colorScheme.onSecondaryContainer,
                                        ),
                                    ) {
                                        Icon(
                                            modifier = Modifier
                                                .padding(8.dp)
                                                .size(24.dp),
                                            imageVector = Icon.Linkedin,
                                            contentDescription = "",
                                            tint = MaterialTheme.colorScheme.primaryContainer
                                        )
                                    }
                                }
                            }
                        }

                        Card(
                            modifier = Modifier
                                .padding(horizontal = 8.dp)
                                .fillMaxWidth(),
                            colors = CardDefaults.cardColors(
                                containerColor = MaterialTheme.colorScheme.onSecondary,
                            ),
                        ) {
                            Text(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(vertical = 32.dp),
                                text = "© 2024 Taufik Amaryansyah | Mobile Developer",
                                fontFamily = FontFamily(Font(Res.font.Inter_Medium)),
                                style = MaterialTheme.typography.bodySmall,
                                color = MaterialTheme.colorScheme.primaryContainer,
                                textAlign = TextAlign.Center
                            )
                        }
                    }
                }
            }
        }
    )
}
