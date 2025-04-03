package com.amary.portofolio.feature.skill

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

internal fun NavGraphBuilder.skillScreen(navController: NavHostController) {
    composable<SkillRoute> {
        SkillScreen()
    }
}

internal fun NavHostController.navToSkill() {
    navigate(SkillRoute)
}

@Serializable
@SerialName("skill")
data object SkillRoute