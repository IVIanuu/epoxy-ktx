@file:Suppress("ClassName", "unused")

object Build {
    const val applicationId = "com.ivianuu.epoxyktx.sample"
    const val buildToolsVersion = "28.0.2"

    const val compileSdk = 28
    const val minSdk = 21
    const val targetSdk = 28
    const val versionCode = 1
    const val versionName = "0.0.1"
}

object Versions {
    const val androidGradlePlugin = "3.2.0"
    const val androidx = "1.0.0"
    const val epoxy = "2.18.0"
    const val kotlin = "1.3.0-rc-57"
    const val mavenGradle = "2.1"
}

object Deps {
    const val androidGradlePlugin = "com.android.tools.build:gradle:${Versions.androidGradlePlugin}"

    const val androidxAppCompat = "androidx.appcompat:appcompat:${Versions.androidx}"

    const val epoxy = "com.airbnb.android:epoxy:${Versions.epoxy}"
    const val epoxyProcessor = "com.airbnb.android:epoxy-processor:${Versions.epoxy}"

    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"

    const val mavenGradlePlugin = "com.github.dcendents:android-maven-gradle-plugin:${Versions.mavenGradle}"
}