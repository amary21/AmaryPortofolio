package com.amary.portofolio.feature.experience

import amaryportofolio.composeapp.generated.resources.Inter_Medium
import amaryportofolio.composeapp.generated.resources.Inter_SemiBold
import amaryportofolio.composeapp.generated.resources.Res
import amaryportofolio.composeapp.generated.resources.img_dsl
import amaryportofolio.composeapp.generated.resources.img_flutter
import amaryportofolio.composeapp.generated.resources.img_kmp
import amaryportofolio.composeapp.generated.resources.img_kreditplus
import amaryportofolio.composeapp.generated.resources.img_sally
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import com.amary.portofolio.theme.Icon
import com.amary.portofolio.theme.icon.AppStore
import com.amary.portofolio.theme.icon.Circle
import com.amary.portofolio.theme.icon.PlayStore
import org.jetbrains.compose.resources.Font
import org.jetbrains.compose.resources.painterResource

@Composable
internal fun ExperienceScreen() {
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
                text = "Experience",
                fontFamily = FontFamily(Font(Res.font.Inter_Medium)),
                style = MaterialTheme.typography.titleMedium,
                color = MaterialTheme.colorScheme.primaryContainer,
            )
        }

        Text(
            modifier = Modifier.padding(vertical = 24.dp),
            text = "My Experience",
            fontFamily = FontFamily(Font(Res.font.Inter_SemiBold)),
            style = MaterialTheme.typography.headlineSmall,
            color = MaterialTheme.colorScheme.secondary
        )

        Card(
            modifier = Modifier.fillMaxWidth(),
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.onSecondary,
            ),
        ) {
            Card(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth(),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 2.dp,
                ),
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.secondaryContainer,
                ),
            ) {
                Column(
                    modifier = Modifier.padding(12.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                    ) {
                        Text(
                            text = "Lead Android Developer",
                            fontFamily = FontFamily(Font(Res.font.Inter_SemiBold)),
                            style = MaterialTheme.typography.titleMedium,
                            color = MaterialTheme.colorScheme.secondary,
                        )
                        Text(
                            text = "10/2022 - Present",
                            fontFamily = FontFamily(Font(Res.font.Inter_Medium)),
                            style = MaterialTheme.typography.titleSmall,
                            color = MaterialTheme.colorScheme.primaryContainer,
                        )
                    }
                    Text(
                        text = "PT. KB Finansia Multi Finance (Kreditplus)",
                        fontFamily = FontFamily(Font(Res.font.Inter_Medium)),
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.primaryContainer,
                    )
                    Spacer(modifier = Modifier.padding(vertical = 8.dp))
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
                            text = "Lead Android team in app development and maintenance.",
                            fontFamily = FontFamily(Font(Res.font.Inter_Medium)),
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.primaryContainer,
                        )
                    }
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
                            text = "Work with iOS, Backend, QA, UI/UX, and Product teams.",
                            fontFamily = FontFamily(Font(Res.font.Inter_Medium)),
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.primaryContainer,
                        )
                    }
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
                            text = "Optimize app performance.",
                            fontFamily = FontFamily(Font(Res.font.Inter_Medium)),
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.primaryContainer,
                        )
                    }
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
                            text = "Set up CI/CD with GitHub Actions & Firebase App Distribution.",
                            fontFamily = FontFamily(Font(Res.font.Inter_Medium)),
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.primaryContainer,
                        )
                    }
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
                            text = "Automate build, sign, and upload with Fastlane & GitHub Actions.",
                            fontFamily = FontFamily(Font(Res.font.Inter_Medium)),
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.primaryContainer,
                        )
                    }
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
                            text = "Experiment with Flutter in a native app.",
                            fontFamily = FontFamily(Font(Res.font.Inter_Medium)),
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.primaryContainer,
                        )
                    }
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
                            text = "Integrate Kotlin Multiplatform for shared bussines logic",
                            fontFamily = FontFamily(Font(Res.font.Inter_Medium)),
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.primaryContainer,
                        )
                    }
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
                            text = "Explore Compose Multiplatform and improve Design System.",
                            fontFamily = FontFamily(Font(Res.font.Inter_Medium)),
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.primaryContainer,
                        )
                    }
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
                            text = "Build Design System with Jetpack Compose.",
                            fontFamily = FontFamily(Font(Res.font.Inter_Medium)),
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.primaryContainer,
                        )
                    }
                }
            }

            Card(
                modifier = Modifier
                    .padding(
                        start = 16.dp,
                        end = 16.dp
                    )
                    .fillMaxWidth(),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 2.dp,
                ),
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.secondaryContainer,
                ),
            ) {
                Column(
                    modifier = Modifier.padding(12.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                    ) {
                        Text(
                            text = "Android Developer",
                            fontFamily = FontFamily(Font(Res.font.Inter_SemiBold)),
                            style = MaterialTheme.typography.titleMedium,
                            color = MaterialTheme.colorScheme.secondary,
                        )
                        Text(
                            text = "10/2021 - 10/2022",
                            fontFamily = FontFamily(Font(Res.font.Inter_Medium)),
                            style = MaterialTheme.typography.titleSmall,
                            color = MaterialTheme.colorScheme.primaryContainer,
                        )
                    }
                    Text(
                        text = "PT. KB Finansia Multi Finance (Kreditplus)",
                        fontFamily = FontFamily(Font(Res.font.Inter_Medium)),
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.primaryContainer,
                    )
                    Spacer(modifier = Modifier.padding(vertical = 8.dp))
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
                            text = "Develop and maintain features based on PRD for Kreditplus Mobile & Sally Internal App.",
                            fontFamily = FontFamily(Font(Res.font.Inter_Medium)),
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.primaryContainer,
                        )
                    }
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
                            text = "Ensure app performance, quality, and responsiveness.",
                            fontFamily = FontFamily(Font(Res.font.Inter_Medium)),
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.primaryContainer,
                        )
                    }
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
                            text = "Design and implement stable, high-performance Android components.",
                            fontFamily = FontFamily(Font(Res.font.Inter_Medium)),
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.primaryContainer,
                        )
                    }
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
                            text = "Explore new technologies to enhance applications and infrastructure.",
                            fontFamily = FontFamily(Font(Res.font.Inter_Medium)),
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.primaryContainer,
                        )
                    }
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
                            text = "Deliver high-quality Android apps using Agile methodologies.",
                            fontFamily = FontFamily(Font(Res.font.Inter_Medium)),
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.primaryContainer,
                        )
                    }
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
                            text = "Provide technical guidance and mentorship.",
                            fontFamily = FontFamily(Font(Res.font.Inter_Medium)),
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.primaryContainer,
                        )
                    }
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
                            text = "Identify and fix bottlenecks, bugs, and performance issues.",
                            fontFamily = FontFamily(Font(Res.font.Inter_Medium)),
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.primaryContainer,
                        )
                    }
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
                            text = "Write unit tests to maintain code quality.",
                            fontFamily = FontFamily(Font(Res.font.Inter_Medium)),
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.primaryContainer,
                        )
                    }
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
                            text = "Migrate app to Clean Architecture and Modularization.",
                            fontFamily = FontFamily(Font(Res.font.Inter_Medium)),
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.primaryContainer,
                        )
                    }
                }
            }

            Card(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth(),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 2.dp,
                ),
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.secondaryContainer,
                ),
            ) {
                Column(
                    modifier = Modifier.padding(12.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                    ) {
                        Text(
                            text = "Facilitator Android",
                            fontFamily = FontFamily(Font(Res.font.Inter_SemiBold)),
                            style = MaterialTheme.typography.titleMedium,
                            color = MaterialTheme.colorScheme.secondary,
                        )
                        Text(
                            text = "06/2020 - 03/2021",
                            fontFamily = FontFamily(Font(Res.font.Inter_Medium)),
                            style = MaterialTheme.typography.titleSmall,
                            color = MaterialTheme.colorScheme.primaryContainer,
                        )
                    }
                    Text(
                        text = "Indosat Ooredoo Digital Camp",
                        fontFamily = FontFamily(Font(Res.font.Inter_Medium)),
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.primaryContainer,
                    )
                    Spacer(modifier = Modifier.padding(vertical = 8.dp))
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
                            text = "guide participants to be able to pass the android developer learning scholarship class",
                            fontFamily = FontFamily(Font(Res.font.Inter_Medium)),
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.primaryContainer,
                        )
                    }
                }
            }
        }

        Text(
            modifier = Modifier.padding(vertical = 24.dp),
            text = "Application",
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
                    }
                }
            }
            Spacer(modifier = Modifier.height(16.dp))
        }

        Text(
            modifier = Modifier.padding(vertical = 24.dp),
            text = "Project",
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
    }
}