package com.amary.portofolio.feature.profile

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


internal fun NavGraphBuilder.profileScreen(navController: NavHostController) {
    composable<ProfileRoute> {
        ProfileScreen()
    }
}

internal fun NavHostController.navToProfile() {
    navigate(ProfileRoute)
}

@Serializable
@SerialName("profile")
data object ProfileRoute