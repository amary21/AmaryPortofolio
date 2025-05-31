package com.amary.portofolio.feature.home

import amaryportofolio.composeapp.generated.resources.Inter_Medium
import amaryportofolio.composeapp.generated.resources.Inter_Regular
import amaryportofolio.composeapp.generated.resources.Inter_SemiBold
import amaryportofolio.composeapp.generated.resources.Res
import amaryportofolio.composeapp.generated.resources.ic_cyclone
import amaryportofolio.composeapp.generated.resources.img_dsl
import amaryportofolio.composeapp.generated.resources.img_flutter
import amaryportofolio.composeapp.generated.resources.img_kmp
import amaryportofolio.composeapp.generated.resources.img_kreditplus
import amaryportofolio.composeapp.generated.resources.img_profile
import amaryportofolio.composeapp.generated.resources.img_sally
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.ArrowForward
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import com.amary.portofolio.theme.Icon
import com.amary.portofolio.theme.icon.AppStore
import com.amary.portofolio.theme.icon.Call
import com.amary.portofolio.theme.icon.Circle
import com.amary.portofolio.theme.icon.Email
import com.amary.portofolio.theme.icon.PlayStore
import kotlinx.coroutines.isActive
import org.jetbrains.compose.resources.Font
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.vectorResource

@Composable
internal fun HomeScreen(
    onExperienceClick: () -> Unit,
    onSkillClick: () -> Unit,
) {
    val rotate = remember { Animatable(0f) }
    val target = 360f
    val uriHandler = LocalUriHandler.current

    LaunchedEffect(Unit) {
        while (isActive) {
            val remaining = (target - rotate.value) / target
            rotate.animateTo(
                target,
                animationSpec = tween((1_000 * remaining).toInt(), easing = LinearEasing)
            )
            rotate.snapTo(0f)
        }
    }


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
                        text = "Available for Work",
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
            Column(
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
                    text = "Mobile Developer from Jakarta, ID.\nCurrently working at Kreditplus.",
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
                        onClick = {
                            uriHandler.openUri("https://wa.me/6285210851633")
                        }
                    ) {
                        Icon(
                            modifier = Modifier.padding(horizontal = 4.dp),
                            imageVector = Icon.Call,
                            contentDescription = ""
                        )
                        Text(
                            modifier = Modifier.padding(horizontal = 4.dp),
                            text = "WhatsApp",
                        )
                    }
                    OutlinedButton(
                        modifier = Modifier
                            .padding(end = 8.dp)
                            .height(32.dp),
                        shape = RoundedCornerShape(6.dp),
                        contentPadding = PaddingValues(4.dp),
                        onClick = {
                            uriHandler.openUri("https://mail.google.com/mail/?view=cm&fs=1&to=taufik.amary@gmail.com&su=Halo&body=Apa%20kabar%3F")
                        }
                    ) {
                        Icon(
                            modifier = Modifier.padding(horizontal = 4.dp),
                            imageVector = Icon.Email,
                            contentDescription = "",
                            tint = MaterialTheme.colorScheme.primaryContainer
                        )
                        Text(
                            text = "Email",
                            color = MaterialTheme.colorScheme.secondary
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
                .padding(horizontal = 16.dp)
                .fillMaxWidth(),
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.onSecondary,
            ),
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
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
                        text = "Application",
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
                    onClick = onExperienceClick
                ) {
                    Text(
                        modifier = Modifier.padding(horizontal = 4.dp),
                        text = "View All",
                        color = MaterialTheme.colorScheme.secondary
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
                    .padding(horizontal = 16.dp)
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
                            .size(60.dp)
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
                        Row(
                            modifier = Modifier
                                .padding(top = 6.dp)
                                .height(20.dp),
                        ) {
                            Image(
                                modifier = Modifier.clickable {
                                    uriHandler.openUri("https://play.google.com/store/apps/details?id=com.kreditplus.kpm.android&pcampaignid=web_share")
                                },
                                imageVector = Icon.PlayStore,
                                contentDescription = "",
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Image(
                                modifier = Modifier.clickable {
                                    uriHandler.openUri("https://apps.apple.com/id/app/kreditplus-mobile/id1268717694?l=id")
                                },
                                imageVector = Icon.AppStore,
                                contentDescription = "",
                            )
                        }
                    }
                }
            }
            Spacer(modifier = Modifier.height(16.dp))
            Card(
                modifier = Modifier
                    .padding(horizontal = 16.dp)
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
                            .size(60.dp)
                            .clip(CircleShape),
                        painter = painterResource(Res.drawable.img_sally),
                        contentDescription = "",
                    )
                    Column(
                        modifier = Modifier
                            .padding(start = 16.dp)
                            .weight(1f)
                    ) {
                        Text(
                            text = "Kreditplus Sally",
                            fontFamily = FontFamily(Font(Res.font.Inter_SemiBold)),
                            style = MaterialTheme.typography.titleSmall,
                            color = MaterialTheme.colorScheme.secondary
                        )
                        Text(
                            text = "internal application from kreditlpus mobile",
                            fontFamily = FontFamily(Font(Res.font.Inter_Medium)),
                            style = MaterialTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.primaryContainer
                        )
                        Row(
                            modifier = Modifier
                                .padding(top = 6.dp)
                                .height(20.dp),
                        ) {
                            Image(
                                modifier = Modifier.clickable {
                                    uriHandler.openUri("https://play.google.com/store/apps/details?id=com.kreditplus.sally")
                                },
                                imageVector = Icon.PlayStore,
                                contentDescription = "",
                            )
                        }
                    }
                }
            }
            Spacer(modifier = Modifier.height(16.dp))
        }
        Spacer(modifier = Modifier.height(16.dp))
        Card(
            modifier = Modifier
                .padding(horizontal = 16.dp)
                .fillMaxWidth(),
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.onSecondary,
            ),
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
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
                        text = "Project",
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
                    onClick = onExperienceClick
                ) {
                    Text(
                        modifier = Modifier.padding(horizontal = 4.dp),
                        text = "View All",
                        color = MaterialTheme.colorScheme.secondary
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
                    .padding(horizontal = 16.dp)
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
                        painter = painterResource(Res.drawable.img_kmp),
                        contentDescription = "",
                    )
                    Column(
                        modifier = Modifier
                            .padding(start = 16.dp)
                            .weight(1f)
                    ) {
                        Text(
                            text = "Kotlin Multiplatform Migration",
                            fontFamily = FontFamily(Font(Res.font.Inter_SemiBold)),
                            style = MaterialTheme.typography.titleSmall,
                            color = MaterialTheme.colorScheme.secondary
                        )
                        Text(
                            text = "Improving efficiency with Kotlin Multiplatform.",
                            fontFamily = FontFamily(Font(Res.font.Inter_Medium)),
                            style = MaterialTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.primaryContainer
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.height(16.dp))
            Card(
                modifier = Modifier
                    .padding(horizontal = 16.dp)
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
                        painter = painterResource(Res.drawable.img_flutter),
                        contentDescription = "",
                    )
                    Column(
                        modifier = Modifier
                            .padding(start = 16.dp)
                            .weight(1f)
                    ) {
                        Text(
                            text = "Flutter Migration",
                            fontFamily = FontFamily(Font(Res.font.Inter_SemiBold)),
                            style = MaterialTheme.typography.titleSmall,
                            color = MaterialTheme.colorScheme.secondary
                        )
                        Text(
                            text = "Accelerating development with Flutter for Mobile",
                            fontFamily = FontFamily(Font(Res.font.Inter_Medium)),
                            style = MaterialTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.primaryContainer
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.height(16.dp))
            Card(
                modifier = Modifier
                    .padding(horizontal = 16.dp)
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
                        painter = painterResource(Res.drawable.img_dsl),
                        contentScale = ContentScale.Crop,
                        contentDescription = "",
                    )
                    Column(
                        modifier = Modifier
                            .padding(start = 16.dp)
                            .weight(1f)
                    ) {
                        Text(
                            text = "DSL Jetpack Compose",
                            fontFamily = FontFamily(Font(Res.font.Inter_SemiBold)),
                            style = MaterialTheme.typography.titleSmall,
                            color = MaterialTheme.colorScheme.secondary
                        )
                        Text(
                            text = "Simplifying UI development using Jetpack Compose.",
                            fontFamily = FontFamily(Font(Res.font.Inter_Medium)),
                            style = MaterialTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.primaryContainer
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.height(16.dp))
        }

        Spacer(modifier = Modifier.height(16.dp))
        Card(
            modifier = Modifier
                .padding(horizontal = 16.dp)
                .fillMaxWidth(),
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.onSecondary,
            ),
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
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
                        text = "Skill",
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
                    onClick = onSkillClick
                ) {
                    Text(
                        modifier = Modifier.padding(horizontal = 4.dp),
                        text = "View All",
                        color = MaterialTheme.colorScheme.secondary
                    )
                    Icon(
                        modifier = Modifier.size(16.dp),
                        imageVector = Icons.AutoMirrored.Rounded.ArrowForward,
                        contentDescription = "",
                        tint = MaterialTheme.colorScheme.primaryContainer
                    )
                }
            }

            val itemsData = listOf(
                "Kotlin", "MVVM", "Flutter", "Kotlin Multiplatform", "Clean Architecture"
            )
            LazyVerticalGrid(
                modifier = Modifier
                    .padding(horizontal = 16.dp)
                    .height(100.dp),
                columns = GridCells.Adaptive(minSize = 150.dp),
                contentPadding = PaddingValues(8.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                items(itemsData) { item ->
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
                            text = item,
                            fontFamily = FontFamily(Font(Res.font.Inter_Medium)),
                            style = MaterialTheme.typography.titleMedium,
                            color = MaterialTheme.colorScheme.secondary,
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}