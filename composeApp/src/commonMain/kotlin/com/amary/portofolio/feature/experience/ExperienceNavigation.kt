package com.amary.portofolio.feature.experience


import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

internal fun NavGraphBuilder.experienceScreen(navController: NavHostController) {
    composable<ExperienceRoute> {
        ExperienceScreen()
    }
}

internal fun NavHostController.navToExperience() {
    navigate(ExperienceRoute)
}

@Serializable
@SerialName("experience")
data object ExperienceRoute