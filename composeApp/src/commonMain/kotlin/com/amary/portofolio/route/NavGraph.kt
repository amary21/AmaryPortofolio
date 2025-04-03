package com.amary.portofolio.route

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.amary.portofolio.feature.experience.experienceScreen
import com.amary.portofolio.feature.home.HomeRoute
import com.amary.portofolio.feature.home.homeScreen
import com.amary.portofolio.feature.profile.profileScreen
import com.amary.portofolio.feature.skill.skillScreen

@Composable
internal fun NavGraphBuilder(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = HomeRoute,
    ) {
        homeScreen(navController)
        profileScreen(navController)
        experienceScreen(navController)
        skillScreen(navController)
    }
}