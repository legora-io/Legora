package models

/**
 * Application Dependencies is Disabled
 * Will be Enabled in Version 2.0
 */
sealed class ApplicationRoute(var route: Int, var prevRoute: Int, var nextRoute: Int) {

    companion object {
        const val NO_SCREEN_POSITION = 0
        const val SPLASH_SCREEN_ROUTE = 1
        const val MAIN_SCREEN_ROUTE = 2
        const val APP_INFO_SCREEN_ROUTE = 3
        const val DEPENDENCIES_SCREEN_ROUTE = 4
        const val APP_PATH_GENERATED_PICKER = 6
        const val GENERATE_APP_CLASSES = 7
        const val SUCCESS_SCREEN_ROUTE = 8
    }

    class SplashScreenRouter: ApplicationRoute(SPLASH_SCREEN_ROUTE, NO_SCREEN_POSITION, MAIN_SCREEN_ROUTE)
    class MainScreenRouter: ApplicationRoute(MAIN_SCREEN_ROUTE, NO_SCREEN_POSITION, APP_INFO_SCREEN_ROUTE)
    class ApplicationInfoRouter: ApplicationRoute(APP_INFO_SCREEN_ROUTE, MAIN_SCREEN_ROUTE, APP_PATH_GENERATED_PICKER)
    class ApplicationDependenciesRouter: ApplicationRoute(DEPENDENCIES_SCREEN_ROUTE, APP_INFO_SCREEN_ROUTE, APP_PATH_GENERATED_PICKER)
    class ApplicationPathPickerRouter: ApplicationRoute(APP_PATH_GENERATED_PICKER, DEPENDENCIES_SCREEN_ROUTE, GENERATE_APP_CLASSES)
    class ApplicationGeneratorRouter: ApplicationRoute(GENERATE_APP_CLASSES, NO_SCREEN_POSITION, SUCCESS_SCREEN_ROUTE)
    class ApplicationSuccessScreenRoute: ApplicationRoute(SUCCESS_SCREEN_ROUTE, NO_SCREEN_POSITION, NO_SCREEN_POSITION)
}
