package com.amary.portofolio.feature.home


import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.amary.portofolio.feature.experience.navToExperience
import com.amary.portofolio.feature.skill.navToSkill
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

internal fun NavGraphBuilder.homeScreen(navController: NavHostController) {
    composable<HomeRoute> {
        HomeScreen(
            onExperienceClick = {
                navController.navToExperience()
            },
            onSkillClick = {
                navController.navToSkill()
            }
        )
    }
}

internal fun NavHostController.navToHome() {
    navigate(HomeRoute)
}

@Serializable
@SerialName("home")
data object HomeRoute