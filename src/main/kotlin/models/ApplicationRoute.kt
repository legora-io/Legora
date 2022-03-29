package models

sealed class ApplicationRoute(var route: Int, var prevRoute: Int, var nextRoute: Int) {

    companion object {
        const val NO_SCREEN_POSITION = 0
        const val SPLASH_SCREEN_ROUTE = 1
        const val MAIN_SCREEN_ROUTE = 2
        const val APP_INFO_SCREEN_ROUTE = 3
        const val DEPENDENCIES_SCREEN_ROUTE = 4
        const val PROJECT_GENERATOR_ROUTE = 5
    }

    class SplashScreenRouter: ApplicationRoute(SPLASH_SCREEN_ROUTE, NO_SCREEN_POSITION, MAIN_SCREEN_ROUTE)
    class MainScreenRouter: ApplicationRoute(MAIN_SCREEN_ROUTE, NO_SCREEN_POSITION, APP_INFO_SCREEN_ROUTE)
    class ApplicationInfoRouter: ApplicationRoute(APP_INFO_SCREEN_ROUTE, MAIN_SCREEN_ROUTE, DEPENDENCIES_SCREEN_ROUTE)
    class ApplicationDependenciesRouter: ApplicationRoute(DEPENDENCIES_SCREEN_ROUTE, APP_INFO_SCREEN_ROUTE, PROJECT_GENERATOR_ROUTE)

}
