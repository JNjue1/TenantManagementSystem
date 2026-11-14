// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    // Direct plugin declarations (since you are not using a version catalog)
    id("com.android.application") version "8.7.3" apply false // Match your AGP version
    id("org.jetbrains.kotlin.android") version "2.0.21" apply false // Standard Kotlin plugin

    // Safe Args: generates classes for passing data between screens
    id("androidx.navigation.safeargs.kotlin") version "2.8.3" apply false

    // KSP generates Room's database code while building (matched to Kotlin 2.0.21)
    id("com.google.devtools.ksp") version "2.0.21-1.0.25" apply false
}