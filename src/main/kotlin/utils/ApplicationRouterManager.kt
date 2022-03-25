package utils

import errors.RouterNotFoundException
import models.ApplicationRoute

object ApplicationRouterManager {

    fun getRouterInformationByRouterKey(key: Int): ApplicationRoute {
        return when (key) {
            ApplicationRoute.NO_SCREEN_POSITION -> throw RouterNotFoundException()
            ApplicationRoute.MAIN_SCREEN_ROUTE -> ApplicationRoute.MainScreenRouter()
            ApplicationRoute.SPLASH_SCREEN_ROUTE -> ApplicationRoute.SplashScreenRouter()
            ApplicationRoute.APP_INFO_SCREEN_ROUTE -> ApplicationRoute.ApplicationInfoRouter()
            else -> throw RouterNotFoundException()
        }
    }

    fun getDefaultRouter(): ApplicationRoute {
        return ApplicationRoute.SplashScreenRouter()
    }

}
