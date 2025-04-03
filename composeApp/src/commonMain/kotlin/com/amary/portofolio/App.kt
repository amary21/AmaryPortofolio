package com.amary.portofolio

import androidx.compose.runtime.Composable
import com.amary.portofolio.feature.MainFeature
import com.amary.portofolio.theme.AppTheme

@Composable
internal fun App() = AppTheme {
    MainFeature()
}
