package org.example.ckp

interface NavigationController {
    fun navigate(route: String)
    fun popBackStack()
}

interface PlatformController {
    fun setStatusBarColor(color: Int)
}