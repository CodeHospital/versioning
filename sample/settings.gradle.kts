rootProject.name = "versioning-plugin-sample"

pluginManagement {
    repositories {
        maven { url = uri("https://jitpack.io") }
        gradlePluginPortal()
        mavenCentral()
    }
    // Use local build for development; JitPack when consumed externally.
    includeBuild("..")
}

include(":app")
