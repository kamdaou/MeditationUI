package com.example.meditation

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color

data class Feature(
    val title: String,
    @DrawableRes val id: Int,
    val lightColor: Color,
    val mediumColor: Color,
    val darkColor: Color,
)
