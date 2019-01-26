@file:Suppress("ClassName", "unused")

object Build {
    const val applicationId = "com.ivianuu.epoxyktx.sample"
    const val buildToolsVersion = "28.0.3"

    const val compileSdk = 28
    const val minSdk = 21
    const val targetSdk = 28
    const val versionCode = 1
    const val versionName = "0.0.1"
}

object Publishing {
    const val groupId = "com.ivianuu.epoxyktx"
    const val vcsUrl = "https://github.com/IVIanuu/epoxy-ktx"
    const val desc = "Kotlin extensions for the epoxy library"

    const val repo = "maven"
    const val userOrg = "ivianuu"
    @JvmField val licences = arrayOf("Apache-2.0")
    const val websiteUrl = vcsUrl
    const val issueTrackerUrl = "$vcsUrl/issues"
    @JvmField val githubRepo = vcsUrl.replace("https://github.com/", "")
    const val version = "git"
}

object Versions {
    const val androidGradlePlugin = "3.3.0"
    const val androidxAppCompat = "1.0.2"
    const val bintray = "1.8.4"
    const val epoxy = "3.0.0"
    const val kotlin = "1.3.20"
    const val mavenGradle = "2.1"
}

object Deps {
    const val androidGradlePlugin = "com.android.tools.build:gradle:${Versions.androidGradlePlugin}"

    const val androidxAppCompat = "androidx.appcompat:appcompat:${Versions.androidxAppCompat}"

    const val bintrayGradlePlugin =
        "com.jfrog.bintray.gradle:gradle-bintray-plugin:${Versions.bintray}"

    const val epoxy = "com.airbnb.android:epoxy:${Versions.epoxy}"
    const val epoxyProcessor = "com.airbnb.android:epoxy-processor:${Versions.epoxy}"

    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"

    const val mavenGradlePlugin = "com.github.dcendents:android-maven-gradle-plugin:${Versions.mavenGradle}"
}