package com.amary.portofolio.feature.skill

import amaryportofolio.composeapp.generated.resources.Inter_Medium
import amaryportofolio.composeapp.generated.resources.Inter_SemiBold
import amaryportofolio.composeapp.generated.resources.Res
import amaryportofolio.composeapp.generated.resources.img_dicoding
import amaryportofolio.composeapp.generated.resources.img_digitalent
import amaryportofolio.composeapp.generated.resources.img_idcamp
import androidx.compose.animation.AnimatedVisibility
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
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.KeyboardArrowRight
import androidx.compose.material.icons.sharp.KeyboardArrowDown
import androidx.compose.material.icons.sharp.KeyboardArrowUp
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import com.amary.portofolio.theme.Icon
import com.amary.portofolio.theme.icon.Circle
import org.jetbrains.compose.resources.Font
import org.jetbrains.compose.resources.painterResource

@Composable
internal fun SkillScreen() {
    val itemsData = listOf(
        "Kotlin", "MVVM", "Compose", "Coroutine", "Room",
        "Dexguard", "Dexguard", "Dexguard", "Dexguard", "New Relic", "Moengage",
        "Sentry", "Flutter", "Kotlin Multiplatform", "DSL", "Clean Architecture"
    )
    val visibleDicoding = remember { mutableStateOf(false) }
    val visibleIdCamp = remember { mutableStateOf(false) }
    val visibleDigitalent = remember { mutableStateOf(false) }
    val uriHandler = LocalUriHandler.current


    Column(
        modifier = Modifier.padding(16.dp)
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

        Text(
            modifier = Modifier.padding(vertical = 24.dp),
            text = "My Skill",
            fontFamily = FontFamily(Font(Res.font.Inter_SemiBold)),
            style = MaterialTheme.typography.headlineSmall,
            color = MaterialTheme.colorScheme.secondary
        )

        Card(
            modifier = Modifier
                .fillMaxWidth(),
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.onSecondary,
            ),
        ) {

            LazyVerticalGrid(
                modifier = Modifier
                    .padding(16.dp)
                    .height(250.dp),
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
        }

        Text(
            modifier = Modifier.padding(vertical = 24.dp),
            text = "Certificate",
            fontFamily = FontFamily(Font(Res.font.Inter_SemiBold)),
            style = MaterialTheme.typography.headlineSmall,
            color = MaterialTheme.colorScheme.secondary
        )

        Card(
            modifier = Modifier
                .fillMaxWidth(),
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.onSecondary,
            ),
        ) {
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
                Column {
                    Card(
                        modifier = Modifier.fillMaxWidth(),
                        elevation = CardDefaults.cardElevation(
                            defaultElevation = 4.dp,
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
                                    .size(34.dp)
                                    .clip(CircleShape),
                                painter = painterResource(Res.drawable.img_dicoding),
                                contentDescription = "",
                            )
                            Text(
                                modifier = Modifier
                                    .padding(start = 16.dp)
                                    .weight(1f),
                                text = "Dicoding",
                                fontFamily = FontFamily(Font(Res.font.Inter_SemiBold)),
                                style = MaterialTheme.typography.titleMedium,
                                color = MaterialTheme.colorScheme.secondary
                            )
                            Icon(
                                modifier = Modifier.clickable {
                                    visibleDicoding.value = !visibleDicoding.value
                                },
                                imageVector = if (visibleDicoding.value) Icons.Sharp.KeyboardArrowUp else Icons.Sharp.KeyboardArrowDown,
                                contentDescription = "",
                                tint = MaterialTheme.colorScheme.primaryContainer
                            )
                        }
                    }
                    AnimatedVisibility(visibleDicoding.value) {
                        Column {
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(vertical = 8.dp, horizontal = 12.dp),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text(
                                    modifier = Modifier
                                        .padding(start = 8.dp)
                                        .weight(1f),
                                    text = "Belajar Pengembangan Aplikasi Android Intermediate",
                                    fontFamily = FontFamily(Font(Res.font.Inter_Medium)),
                                    style = MaterialTheme.typography.bodySmall,
                                    color = MaterialTheme.colorScheme.secondary
                                )
                                Icon(
                                    imageVector = Icons.AutoMirrored.Rounded.KeyboardArrowRight,
                                    contentDescription = "",
                                    tint = MaterialTheme.colorScheme.primaryContainer
                                )
                            }

                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(vertical = 8.dp, horizontal = 12.dp),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text(
                                    modifier = Modifier
                                        .padding(start = 8.dp)
                                        .weight(1f),
                                    text = "Menjadi Android Developer Expert",
                                    fontFamily = FontFamily(Font(Res.font.Inter_Medium)),
                                    style = MaterialTheme.typography.bodySmall,
                                    color = MaterialTheme.colorScheme.secondary
                                )
                                Icon(
                                    imageVector = Icons.AutoMirrored.Rounded.KeyboardArrowRight,
                                    contentDescription = "",
                                    tint = MaterialTheme.colorScheme.primaryContainer
                                )
                            }

                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(vertical = 8.dp, horizontal = 12.dp),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text(
                                    modifier = Modifier
                                        .padding(start = 8.dp)
                                        .weight(1f),
                                    text = "Belajar Pengembangan Aplikasi Flutter Intermediate",
                                    fontFamily = FontFamily(Font(Res.font.Inter_Medium)),
                                    style = MaterialTheme.typography.bodySmall,
                                    color = MaterialTheme.colorScheme.secondary
                                )
                                Icon(
                                    imageVector = Icons.AutoMirrored.Rounded.KeyboardArrowRight,
                                    contentDescription = "",
                                    tint = MaterialTheme.colorScheme.primaryContainer
                                )
                            }

                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(vertical = 8.dp, horizontal = 12.dp),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text(
                                    modifier = Modifier
                                        .padding(start = 8.dp)
                                        .weight(1f),
                                    text = "Menjadi Flutter Developer Expert",
                                    fontFamily = FontFamily(Font(Res.font.Inter_Medium)),
                                    style = MaterialTheme.typography.bodySmall,
                                    color = MaterialTheme.colorScheme.secondary
                                )
                                Icon(
                                    imageVector = Icons.AutoMirrored.Rounded.KeyboardArrowRight,
                                    contentDescription = "",
                                    tint = MaterialTheme.colorScheme.primaryContainer
                                )
                            }
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
                Column {
                    Card(
                        modifier = Modifier.fillMaxWidth(),
                        elevation = CardDefaults.cardElevation(
                            defaultElevation = 4.dp,
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
                                    .size(34.dp)
                                    .clip(CircleShape),
                                painter = painterResource(Res.drawable.img_idcamp),
                                contentDescription = "",
                            )
                            Text(
                                modifier = Modifier
                                    .padding(start = 16.dp)
                                    .weight(1f),
                                text = "Indosat Ooredoo",
                                fontFamily = FontFamily(Font(Res.font.Inter_SemiBold)),
                                style = MaterialTheme.typography.titleMedium,
                                color = MaterialTheme.colorScheme.secondary
                            )
                            Icon(
                                modifier = Modifier.clickable {
                                    visibleIdCamp.value = !visibleIdCamp.value
                                },
                                imageVector = if (visibleIdCamp.value) Icons.Sharp.KeyboardArrowUp else Icons.Sharp.KeyboardArrowDown,
                                contentDescription = "",
                                tint = MaterialTheme.colorScheme.primaryContainer
                            )
                        }
                    }
                    AnimatedVisibility(visibleIdCamp.value) {
                        Column {
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(vertical = 8.dp, horizontal = 12.dp),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text(
                                    modifier = Modifier
                                        .padding(start = 8.dp)
                                        .weight(1f),
                                    text = "Facilitator - IDCamp 2020 Belajar Fundamental Aplikasi Android",
                                    fontFamily = FontFamily(Font(Res.font.Inter_Medium)),
                                    style = MaterialTheme.typography.bodySmall,
                                    color = MaterialTheme.colorScheme.secondary
                                )
                                Icon(
                                    modifier = Modifier.clickable {
                                        uriHandler.openUri("https://drive.google.com/file/d/1zgIeo4w6r1YN07ZN-Z_m8XIqNMZfD0j0/view?usp=sharing")
                                    },
                                    imageVector = Icons.AutoMirrored.Rounded.KeyboardArrowRight,
                                    contentDescription = "",
                                    tint = MaterialTheme.colorScheme.primaryContainer
                                )
                            }

                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(vertical = 8.dp, horizontal = 12.dp),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text(
                                    modifier = Modifier
                                        .padding(start = 8.dp)
                                        .weight(1f),
                                    text = "Facilitator - IDCamp 2020 Belajar Android Jetpack Pro",
                                    fontFamily = FontFamily(Font(Res.font.Inter_Medium)),
                                    style = MaterialTheme.typography.bodySmall,
                                    color = MaterialTheme.colorScheme.secondary
                                )
                                Icon(
                                    modifier = Modifier.clickable {
                                        uriHandler.openUri("https://drive.google.com/file/d/1l-1gil_5qD8Cvfa_Y9AD3QG3alvn2iZQ/view?usp=sharing")
                                    },
                                    imageVector = Icons.AutoMirrored.Rounded.KeyboardArrowRight,
                                    contentDescription = "",
                                    tint = MaterialTheme.colorScheme.primaryContainer
                                )
                            }
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(vertical = 8.dp, horizontal = 12.dp),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text(
                                    modifier = Modifier
                                        .padding(start = 8.dp)
                                        .weight(1f),
                                    text = "Facilitator - IDCamp 2020 Menjadi Android Developer Expert",
                                    fontFamily = FontFamily(Font(Res.font.Inter_Medium)),
                                    style = MaterialTheme.typography.bodySmall,
                                    color = MaterialTheme.colorScheme.secondary
                                )
                                Icon(
                                    modifier = Modifier.clickable {
                                        uriHandler.openUri("https://drive.google.com/file/d/1AOXeQfRE1OZ7GCgoQA5h9hako4mq4iq_/view?usp=sharing")
                                    },
                                    imageVector = Icons.AutoMirrored.Rounded.KeyboardArrowRight,
                                    contentDescription = "",
                                    tint = MaterialTheme.colorScheme.primaryContainer
                                )
                            }
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
                Column {
                    Card(
                        modifier = Modifier.fillMaxWidth(),
                        elevation = CardDefaults.cardElevation(
                            defaultElevation = 4.dp,
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
                                    .size(34.dp)
                                    .clip(CircleShape),
                                painter = painterResource(Res.drawable.img_digitalent),
                                contentDescription = "",
                            )
                            Text(
                                modifier = Modifier
                                    .padding(start = 16.dp)
                                    .weight(1f),
                                text = "Digital Talent Scholarship",
                                fontFamily = FontFamily(Font(Res.font.Inter_SemiBold)),
                                style = MaterialTheme.typography.titleMedium,
                                color = MaterialTheme.colorScheme.secondary
                            )
                            Icon(
                                modifier = Modifier.clickable {
                                    visibleDigitalent.value = !visibleDigitalent.value
                                },
                                imageVector = if (visibleDigitalent.value) Icons.Sharp.KeyboardArrowUp else Icons.Sharp.KeyboardArrowDown,
                                contentDescription = "",
                                tint = MaterialTheme.colorScheme.primaryContainer
                            )
                        }
                    }
                    AnimatedVisibility(visibleDigitalent.value) {
                        Column {
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(vertical = 8.dp, horizontal = 12.dp),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text(
                                    modifier = Modifier
                                        .padding(start = 8.dp)
                                        .weight(1f),
                                    text = "Facilitator PROA DTS Android Developer",
                                    fontFamily = FontFamily(Font(Res.font.Inter_Medium)),
                                    style = MaterialTheme.typography.bodySmall,
                                    color = MaterialTheme.colorScheme.secondary
                                )
                                Icon(
                                    modifier = Modifier.clickable {
                                        uriHandler.openUri("https://drive.google.com/file/d/1EqNz9Vcb13oEpP0cLwZ-QCXcCel1zgL9/view?usp=sharing")
                                    },
                                    imageVector = Icons.AutoMirrored.Rounded.KeyboardArrowRight,
                                    contentDescription = "",
                                    tint = MaterialTheme.colorScheme.primaryContainer
                                )
                            }
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(vertical = 8.dp, horizontal = 12.dp),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text(
                                    modifier = Modifier
                                        .padding(start = 8.dp)
                                        .weight(1f),
                                    text = "IT Perbankan - Kelas Front End",
                                    fontFamily = FontFamily(Font(Res.font.Inter_Medium)),
                                    style = MaterialTheme.typography.bodySmall,
                                    color = MaterialTheme.colorScheme.secondary
                                )
                                Icon(
                                    modifier = Modifier.clickable {
                                        uriHandler.openUri("https://drive.google.com/file/d/1zenqgD7mobUCsSf12XT3Jen0KyDpoXZc/view?usp=sharing")
                                    },
                                    imageVector = Icons.AutoMirrored.Rounded.KeyboardArrowRight,
                                    contentDescription = "",
                                    tint = MaterialTheme.colorScheme.primaryContainer
                                )
                            }
                        }
                    }
                }
            }
            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}