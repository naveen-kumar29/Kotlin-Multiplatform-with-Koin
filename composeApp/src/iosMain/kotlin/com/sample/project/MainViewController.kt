package com.sample.project

import androidx.compose.ui.window.ComposeUIViewController
import com.sample.project.di.initKoin

fun MainViewController() = ComposeUIViewController (
    configure = {
        initKoin ()
    }
){ App() }