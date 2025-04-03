package com.amary.portofolio.feature.profile

import amaryportofolio.composeapp.generated.resources.Inter_Medium
import amaryportofolio.composeapp.generated.resources.Inter_SemiBold
import amaryportofolio.composeapp.generated.resources.Res
import amaryportofolio.composeapp.generated.resources.img_profile
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import com.amary.portofolio.theme.Icon
import com.amary.portofolio.theme.icon.Circle
import org.jetbrains.compose.resources.Font
import org.jetbrains.compose.resources.painterResource

@Composable
internal fun ProfileScreen() {
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
                text = "About",
                fontFamily = FontFamily(Font(Res.font.Inter_Medium)),
                style = MaterialTheme.typography.titleMedium,
                color = MaterialTheme.colorScheme.primaryContainer,
            )
        }

        Text(
            modifier = Modifier.padding(vertical = 24.dp),
            text = "It's Me Taufik",
            fontFamily = FontFamily(Font(Res.font.Inter_SemiBold)),
            style = MaterialTheme.typography.headlineSmall,
            color = MaterialTheme.colorScheme.secondary
        )
        Text(
            text = "I'm Taufik Amaryansyah, a Mobile Developer with extensive experience in Android development, specializing in Kotlin, Jetpack Compose, and Clean Architecture. Based in Jakarta Selatan, Indonesia, I have a strong passion for exploring new technologies like Kotlin Multiplatform and Flutter to enhance user experiences and optimize app performance. Currently, I lead the Android team at PT. KB Finansia Multi Finance (Kreditplus), where I collaborate with cross-functional teams and implement CI/CD pipelines to ensure high-quality mobile applications.",
            fontFamily = FontFamily(Font(Res.font.Inter_Medium)),
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.primaryContainer,
        )

        Card(
            modifier = Modifier
                .padding(vertical = 24.dp)
                .fillMaxWidth(),
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.onSecondary,
            ),
        ) {
            Card(
                modifier = Modifier
                    .padding(16.dp)
                    .height(308.dp),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 6.dp,
                )
            ) {
                Image(
                    modifier = Modifier.fillMaxWidth(),
                    painter = painterResource(Res.drawable.img_profile),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                )
            }
        }

        Text(
            modifier = Modifier.padding(bottom = 24.dp),
            text = "More About Me",
            fontFamily = FontFamily(Font(Res.font.Inter_SemiBold)),
            style = MaterialTheme.typography.headlineSmall,
            color = MaterialTheme.colorScheme.secondary
        )

        Text(
            text = "I am deeply committed to staying up-to-date with the latest trends in mobile development and exploring innovative solutions to improve application architecture and performance. When I'm not immersed in coding, I enjoy exploring new technologies, learning about cross-platform solutions, and staying engaged with the tech community. I believe in maintaining a healthy work-life balance, occasionally taking time to read tech blogs and attend meetups to stay connected with industry advancements.",
            fontFamily = FontFamily(Font(Res.font.Inter_Medium)),
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.primaryContainer,
        )

        Text(
            modifier = Modifier.padding(vertical = 24.dp),
            text = "Education",
            fontFamily = FontFamily(Font(Res.font.Inter_SemiBold)),
            style = MaterialTheme.typography.headlineSmall,
            color = MaterialTheme.colorScheme.secondary
        )

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Text(
                text = "Information Technology",
                fontFamily = FontFamily(Font(Res.font.Inter_SemiBold)),
                style = MaterialTheme.typography.titleMedium,
                color = MaterialTheme.colorScheme.secondary,
            )
            Text(
                text = "06/2017 - 08/2021",
                fontFamily = FontFamily(Font(Res.font.Inter_Medium)),
                style = MaterialTheme.typography.titleMedium,
                color = MaterialTheme.colorScheme.primaryContainer,
            )
        }
        Text(
            text = "Universitas Teknologi Yogyakarta - Bachelor's degree",
            fontFamily = FontFamily(Font(Res.font.Inter_Medium)),
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.primaryContainer,
        )
        Text(
            text = "GPA 3.67/4",
            fontFamily = FontFamily(Font(Res.font.Inter_Medium)),
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.primaryContainer,
        )
    }
}