package models

enum class FileExtention constructor(public val key: String) {
    KOTLIN(".kt"),
    JAVA(".java"),
    JAVASCRIPT(".js"),
    JAVASCRIPT_JSX(".jsx"),
    GRADLE(".gradle"),
    BAT(".bat"),
    EMPTY(""),
    PROPERTIES(".properties"),
    PRO(".pro"),
    JSON(".json")
}