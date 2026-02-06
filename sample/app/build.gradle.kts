plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.codehospital.versioning")
}

android {
    namespace = "com.codehospital.versioning.sample"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.codehospital.versioning.sample"
        minSdk = 24
        targetSdk = 34

        versionCode = versioning.getVersionCode("release")
        versionName = versioning.getVersionName("release")

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
        debug {
            versionNameSuffix = versioning.getDebugSuffix()
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
}
