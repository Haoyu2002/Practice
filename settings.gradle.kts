pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "My Application"
include(":app")
include(":exbutton")
include(":exmiletokm")
include(":exphone")
include(":tablerow")
include(":exatminput")
include(":exatmtoast01")
include(":exdialog01")
include(":savecode")
