package com.amary.portofolio.feature

import amaryportofolio.composeapp.generated.resources.Inter_Medium
import amaryportofolio.composeapp.generated.resources.Inter_SemiBold
import amaryportofolio.composeapp.generated.resources.Res
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.amary.portofolio.feature.experience.navToExperience
import com.amary.portofolio.feature.home.navToHome
import com.amary.portofolio.feature.profile.navToProfile
import com.amary.portofolio.feature.skill.navToSkill
import com.amary.portofolio.route.NavGraphBuilder
import com.amary.portofolio.theme.Icon
import com.amary.portofolio.theme.LocalThemeIsDark
import com.amary.portofolio.theme.icon.Call
import com.amary.portofolio.theme.icon.Circle
import com.amary.portofolio.theme.icon.Email
import com.amary.portofolio.theme.icon.Github
import com.amary.portofolio.theme.icon.Home
import com.amary.portofolio.theme.icon.Laptop
import com.amary.portofolio.theme.icon.Linkedin
import com.amary.portofolio.theme.icon.Moon
import com.amary.portofolio.theme.icon.Skill
import com.amary.portofolio.theme.icon.Sun
import com.amary.portofolio.theme.icon.Twitter
import com.amary.portofolio.theme.icon.User
import org.jetbrains.compose.resources.Font

@Composable
internal fun MainFeature() {
    val navigator = rememberNavController()
    var isDark by LocalThemeIsDark.current
    val iconTheme = remember(isDark) {
        if (isDark) Icon.Sun
        else Icon.Moon
    }
    val uriHandler = LocalUriHandler.current

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
                            vertical = 12.dp,
                            horizontal = 8.dp
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
                                onClick = {
                                    navigator.navToHome()
                                }
                            ) {
                                Icon(
                                    imageVector = Icon.Home,
                                    contentDescription = "home"
                                )
                            }
                            IconButton(
                                colors = IconButtonDefaults.iconButtonColors().copy(
                                    contentColor = MaterialTheme.colorScheme.secondary
                                ),
                                onClick = {
                                    navigator.navToProfile()
                                }
                            ) {
                                Icon(
                                    imageVector = Icon.User,
                                    contentDescription = "profile"
                                )
                            }
                            IconButton(
                                colors = IconButtonDefaults.iconButtonColors().copy(
                                    contentColor = MaterialTheme.colorScheme.secondary
                                ),
                                onClick = {
                                    navigator.navToExperience()
                                }
                            ) {
                                Icon(
                                    imageVector = Icon.Laptop,
                                    contentDescription = "project"
                                )
                            }
                            IconButton(
                                colors = IconButtonDefaults.iconButtonColors().copy(
                                    contentColor = MaterialTheme.colorScheme.secondary
                                ),
                                onClick = {
                                    navigator.navToSkill()
                                }
                            ) {
                                Icon(
                                    imageVector = Icon.Skill,
                                    contentDescription = "skill"
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
                    NavGraphBuilder(navigator)


                    Text(
                        modifier = Modifier
                            .padding(top = 28.dp)
                            .align(Alignment.CenterHorizontally)
                        ,
                        text = "Let’s work together.",
                        fontFamily = FontFamily(Font(Res.font.Inter_SemiBold)),
                        style = MaterialTheme.typography.headlineSmall,
                        color = MaterialTheme.colorScheme.secondary,
                        textAlign = TextAlign.Center
                    )

                    Text(
                        modifier = Modifier
                            .padding(vertical = 8.dp)
                            .align(Alignment.CenterHorizontally),
                        text = "Building the future, one app at a time.",
                        fontFamily = FontFamily(Font(Res.font.Inter_Medium)),
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.primaryContainer,
                        textAlign = TextAlign.Center
                    )

                    Row(
                        modifier = Modifier
                            .padding(vertical = 8.dp)
                            .align(Alignment.CenterHorizontally)
                    ) {
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
                                modifier = Modifier.padding(horizontal = 4.dp),
                                text = "Email",
                                color = MaterialTheme.colorScheme.secondary
                            )
                        }
                    }

                    Card(
                        modifier = Modifier
                            .padding(
                                start = 16.dp,
                                end = 16.dp,
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
                                    modifier = Modifier
                                        .padding(horizontal = 4.dp)
                                        .clickable {
                                            uriHandler.openUri("https://github.com/amary21")
                                        },
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
                                    modifier = Modifier
                                        .padding(horizontal = 4.dp)
                                        .clickable {
                                            uriHandler.openUri("https://x.com/TaufikAmary")
                                        },
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
                                    modifier = Modifier
                                        .padding(horizontal = 4.dp)
                                        .clickable {
                                            uriHandler.openUri("https://www.linkedin.com/in/t-amar/")
                                        },
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
                            .padding(
                                start = 16.dp,
                                end = 16.dp,
                                bottom = 16.dp
                            )
                            .fillMaxWidth(),
                        colors = CardDefaults.cardColors(
                            containerColor = MaterialTheme.colorScheme.onSecondary,
                        ),
                    ) {
                        Text(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 32.dp),
                            text = "© 2025 Taufik Amaryansyah | Mobile Developer",
                            fontFamily = FontFamily(Font(Res.font.Inter_Medium)),
                            style = MaterialTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.primaryContainer,
                            textAlign = TextAlign.Center
                        )
                    }
                }
            }
        }
    )
}