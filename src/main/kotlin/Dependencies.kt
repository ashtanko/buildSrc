@file:Suppress("ClassName", "unused")

import Versions.APP_CENTER_VERSION
import Versions.BATTERY
import Versions.COIL_VERSION
import Versions.DAGGER_VERSION
import Versions.FACEBOOK_LOGIN_VERSION
import Versions.FLIPPER_VERSION
import Versions.GOOGLE_SERVICES_VERSION
import Versions.GRADLE_PLUGIN_VERSION
import Versions.KODEIN_VERSION
import Versions.KOIN_VERSION
import Versions.KOTLIN_COROUTINES_VERSION
import Versions.KOTLIN_VERSION
import Versions.LIFECYCLE_VERSION
import Versions.LITHO_VERSION
import Versions.NAVIGATION_VERSION
import Versions.OKHTTP_VERSION
import Versions.RETROFIT_VERSION
import Versions.STETHO_VERSION
import Versions.TOOTHPICK_VERSION
import Versions.WORK_VERSION
import Versions.ZXING_VERSION
import extensions.implementation
import extensions.kapt
import org.gradle.api.artifacts.dsl.DependencyHandler

object Versions {

    internal const val KOTLIN_VERSION = "1.3.61"
    internal const val GRADLE_PLUGIN_VERSION = "4.0.0-alpha09"
    internal const val DAGGER_VERSION = "2.25.2"
    internal const val RETROFIT_VERSION = "2.6.2"
    internal const val GOOGLE_SERVICES_VERSION = "4.0.1"
    internal const val ANDROID_SUPPORT_VERSION = "1.1.0"
    internal const val APPCOMPAT_VERSION = "1.1.0-alpha05"
    internal const val FRAGMENT_VERSION = "1.2.1"
    internal const val OKHTTP_VERSION = "4.2.2"
    internal const val LIFECYCLE_VERSION = "2.2.0-alpha03"
    internal const val COIL_VERSION = "0.7.0"
    internal const val KOTLIN_COROUTINES_VERSION = "1.3.0"
    internal const val ROOM_VERSION = "2.0.0"
    internal const val ZXING_VERSION = "3.3.0"
    internal const val NAVIGATION_VERSION = "2.1.0"
    internal const val FACEBOOK_LOGIN_VERSION = "5.5.1"

    internal const val RX_JAVA_2_VERSION = "2.2.14"
    internal const val RX_JAVA_3_VERSION = "3.0.0-RC4"

    internal const val RX_ANDROID_2_VERSION = "2.1.1"
    internal const val RX_ANDROID_3_VERSION = "3.0.0-SNAPSHOT"

    internal const val JUNIT_VERSION = "4.12"
    internal const val MOCKITO_VERSION = "2.18.3"
    internal const val RUNNER_VERSION = "1.1.1"
    internal const val FIREBASE_VERSION = "16.0.8"
    internal const val WORK_VERSION = "2.0.1"
    internal const val APP_CENTER_VERSION = "1.11.3"
    internal const val KOIN_VERSION = "2.0.1"
    internal const val TOOTHPICK_VERSION = "3.1.0"
    internal const val KODEIN_VERSION = "6.4.0"
    internal const val ARCH_CORE_VERSION = "2.1.0"

    internal const val PREFERENCE_VERSION  = "1.1.0"

    //region facebook
    internal const val LITHO_VERSION = "0.33.0"
    internal const val STETHO_VERSION = "1.5.1"
    internal const val FLIPPER_VERSION = "0.30.1"
    internal const val BATTERY = "1.0.0"

    const val DETEKT_VERSION = "1.0.0-RC16"
    const val KTLINT_VERSION = "8.2.0"
    const val ERRORPRONE_VERSION = "2.3.3"

    object Android {
        object Build {
            const val COMPILE_SDK_VERSION = 29
            const val MIN_SDK_VERSION = 21
            const val TARGET_SDK_VERSION = 29
        }
    }
}


object Dependencies {

    object Android {

        const val GRADLE_PLUGIN = "com.android.tools.build:gradle:$GRADLE_PLUGIN_VERSION"

        object AndroidX {
            const val APPCOMPAT = "androidx.appcompat:appcompat:${Versions.APPCOMPAT_VERSION}"
            const val CORE  ="androidx.core:core:1.3.0-alpha01"
            const val CORE_KTX = "androidx.core:core-ktx:1.3.0-alpha01"
            const val ANNOTATIONS = "androidx.annotation:annotation:1.1.0"
            const val CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout:2.0.0-beta4"
            const val MATERIAL = "com.google.android.material:material:1.2.0-alpha04"
            const val ACTIVITY_KTX = "androidx.activity:activity-ktx:1.1.0"
            const val RECYCLER_VIEW = "androidx.recyclerview:recyclerview:1.1.0"
            const val CARD_VIEW = "androidx.cardview:cardview:1.0.0"
            const val FRAGMENT_RUNTIME = "androidx.fragment:fragment:${Versions.FRAGMENT_VERSION}"
            const val FRAGMENT_KTX = "androidx.fragment:fragment-ktx:${Versions.FRAGMENT_VERSION}"
            const val FRAGMENT_TESTING = "androidx.fragment:fragment-testing:${Versions.FRAGMENT_VERSION}"
            const val NAVIGATION_FRAGMENT = "android.arch.navigation:navigation-fragment:1.0.0"
            const val NAVIGATION_UI = "android.arch.navigation:navigation-ui:1.0.0"
            const val CAMERA_CORE = "androidx.camera:camera-core:1.0.0-alpha09"
            const val CAMERA2 = "androidx.camera:camera-camera2:1.0.0-alpha09"
            const val CAMERA_LIFECYCLE = "androidx.camera:camera-lifecycle:1.0.0-alpha03"
            const val CAMERA_VIEW = "androidx.camera:camera-view:1.0.0-alpha06"
            const val PAGING = "androidx.paging:paging-runtime-ktx:2.1.1"
            const val ANDROID_SECURITY_CRYPTO = "androidx.security:security-crypto:1.0.0-alpha02"
            const val CUSTOM_TABS = "androidx.browser:browser:1.3.0-alpha01"
            const val DRAWER_LAYOUT = ":drawerlayout:1.1.0-alpha03"
            const val EMOJI = "androidx.emoji:emoji:1.0.0"
            const val EMOJI_APPCOMPAT = "androidx.emoji:emoji-appcompat:1.0.0"
            const val VIEW_PAGER_2 = "androidx.viewpager2:viewpager2:1.0.0"
            const val SWIPE_REFRESH = "androidx.swiperefreshlayout:swiperefreshlayout:1.1.0-alpha03"
            const val PALETTE = "androidx.palette:palette:1.0.0"
            const val PALETTE_KTX = "androidx.palette:palette-ktx:1.0.0"
            const val PREFERENCE = "androidx.preference:preference:${Versions.PREFERENCE_VERSION}"
            const val PREFERENCE_KTX = "androidx.preference:preference-ktx:${Versions.PREFERENCE_VERSION}"

        }

        object Lifecycle {
            const val LIVEDATA = "androidx.lifecycle:lifecycle-livedata:$LIFECYCLE_VERSION"
            const val LIFECYCLE_JAVA8 = "androidx.lifecycle:lifecycle-common-java8:$LIFECYCLE_VERSION"
            const val LIVEDATA_KTX = "androidx.lifecycle:lifecycle-livedata-ktx:$LIFECYCLE_VERSION"
            const val EXTENSIONS = "androidx.lifecycle:lifecycle-extensions:$LIFECYCLE_VERSION"
            const val COMPILER = "androidx.lifecycle:lifecycle-compiler:$LIFECYCLE_VERSION"
            const val VIEWMODEL = "androidx.lifecycle:lifecycle-viewmodel:$LIFECYCLE_VERSION"
            const val KTX = "androidx.lifecycle:lifecycle-viewmodel-ktx:$LIFECYCLE_VERSION"
            const val SAVED_STATE = "androidx.lifecycle:lifecycle-viewmodel-savedstate:$LIFECYCLE_VERSION"
        }


        object Room {
            const val COMPILER = "android.arch.persistence.room:compiler:${Versions.ROOM_VERSION}"
            const val RUNTIME = "android.arch.persistence.room:runtime:${Versions.ROOM_VERSION}"
            const val COROUTINES = "androidx.room:room-coroutines:2.1.0-alpha04"
            const val KTX = "androidx.room:room-ktx:${Versions.ROOM_VERSION}"
            const val RX_JAVA2 = "androidx.room:room-rxjava2:${Versions.ROOM_VERSION}"
        }

    }

    object Kotlin {

        object Build {
            const val KOTLIN_GRADLE_PLUGIN =
                "org.jetbrains.kotlin:kotlin-gradle-plugin:$KOTLIN_VERSION"
        }

        object Stdlib {
            const val CORE = "org.jetbrains.kotlin:kotlin-stdlib:$KOTLIN_VERSION"
        }

        const val STDLIB = "stdlib"

        const val COROUTINES =
            "org.jetbrains.kotlinx:kotlinx-coroutines-core:$KOTLIN_COROUTINES_VERSION"
        const val COROUTINES_ANDROID =
            "org.jetbrains.kotlinx:kotlinx-coroutines-android:$KOTLIN_COROUTINES_VERSION"
    }

    object App {

        const val GOOGLE_SERVICES = "com.google.gms:google-services:$GOOGLE_SERVICES_VERSION"
        const val FABRIC = "io.fabric.tools:gradle:1.25.4"
    }

    object Other {
        const val STATE_DELEGATOR = "com.redmadrobot:state-delegator:1.7"

        const val ROOTBEER = "com.scottyab:rootbeer-lib:0.0.7"
        const val CRASHLYTICS = "com.crashlytics.sdk.android:crashlytics:2.9.9@aar"
        const val CIRCLE_INDICATOR = "me.relex:circleindicator:2.1.0"
        const val EVENT_BUS = "org.greenrobot:eventbus:3.1.1"
        const val ZXING = "com.google.zxing:core:$ZXING_VERSION"
        const val ZXING_EMBEDDED = "com.journeyapps:zxing-android-embedded:3.6.0"

        const val APP_CENTER_ANALYTICS =
            "com.microsoft.appcenter:appcenter-analytics:$APP_CENTER_VERSION"
        const val APP_CENTER_CRASHES =
            "com.microsoft.appcenter:appcenter-crashes:$APP_CENTER_VERSION"
        const val SEGMENTED_CONTROL = "com.github.RobertApikyan:SegmentedControl:1.1.3"
        const val FRAGMENT_HELPER = "me.yokeyword:fragmentationx:1.0.1"
        const val ALERTER = "com.tapadoo.android:alerter:4.0.2"
        const val SECURE_PREFS = "com.github.hussainderry:secure-preferences:4.0.0"

        const val LEAKCANARY = "com.squareup.leakcanary:leakcanary-android:2.0-beta-3"
    }

    object RX {

        enum class Version {
            TWO,
            THREE
        }

        const val RX_JAVA_2 = "io.reactivex.rxjava2:rxjava:${Versions.RX_JAVA_2_VERSION}"
        const val RX_JAVA_3 = "io.reactivex.rxjava3:rxjava:${Versions.RX_JAVA_3_VERSION}"

        const val RX_ANDROID_2 = "io.reactivex.rxjava2:rxandroid:${Versions.RX_ANDROID_2_VERSION}"
        const val RX_ANDROID_3 = "io.reactivex.rxjava2:rxandroid:${Versions.RX_ANDROID_3_VERSION}"

        const val RX_ANDROID_BLE = "com.polidea.rxandroidble2:rxandroidble:1.10.0"
        const val RX_REPLAYING_SHARE = "com.jakewharton.rx2:replaying-share:2.1.1"

        fun getRxJavaDependency(version: Version): String {
            return when (version) {
                Version.TWO -> {
                    RX_JAVA_2
                }

                Version.THREE -> {
                    RX_JAVA_3
                }
            }
        }

        fun getRxAndroidDependency(version: Version): String {
            return when (version) {
                Version.TWO -> {
                    RX_ANDROID_2
                }

                Version.THREE -> {
                    RX_ANDROID_3
                }
            }
        }

        fun DependencyHandler.addRxJava(version: Version) {
            implementation(getRxJavaDependency(version))
        }

        fun DependencyHandler.addRxJavaWithAndroid(version: Version) {
            implementation(getRxJavaDependency(version))
            implementation(getRxAndroidDependency(version))
        }

        fun DependencyHandler.addLatestRxJava() {
            implementation(getRxJavaDependency(Version.THREE))
        }

        fun DependencyHandler.addLatestRxJavaWithAndroid() {
            implementation(getRxJavaDependency(Version.THREE))
            implementation(getRxAndroidDependency(Version.THREE))
        }
    }



    object Injection {
        const val DAGGER = "com.google.dagger:dagger:$DAGGER_VERSION"
        const val DAGGER_COMPILER = "com.google.dagger:dagger-compiler:$DAGGER_VERSION"
        const val DAGGER_ANDROID = "com.google.dagger:dagger-android:$DAGGER_VERSION"
        const val DAGGER_ANDROID_SUPPORT =
            "com.google.dagger:dagger-android-support:$DAGGER_VERSION"
        const val DAGGER_ANDROID_PROCESSOR =
            "com.google.dagger:dagger-android-processor:$DAGGER_VERSION"

        fun DependencyHandler.addDaggerDependencies() {
            implementation(DAGGER)
            kapt(DAGGER_COMPILER)
        }

        // Koin for Kotlin
        const val KOIN_CORE = "org.koin:koin-core:$KOIN_VERSION"

        // Koin for Android
        const val KOIN = "org.koin:koin-android:$KOIN_VERSION"
        // Koin for Lifecycle scoping
        const val KOIN_SCOPE = "org.koin:koin-android-scope:$KOIN_VERSION"
        // Koin for Android Architecture ViewModel
        const val KOIN_VIEW_MODEL = "org.koin:koin-android-viewmodel:$KOIN_VERSION"

        //Koin for Android Fragment Factory (unstable version)
        const val KOIN_FRAGMENT = "org.koin:koin-androidx-fragment:$KOIN_VERSION"

        const val TOOTHPICK_RUNTIME =
            "com.github.stephanenicolas.toothpick:toothpick-runtime:$TOOTHPICK_VERSION"
        const val TOOTHPICK_ANDROID =
            "com.github.stephanenicolas.toothpick:smoothie-androidx:$TOOTHPICK_VERSION"
        const val TOOTHPICK = "com.github.stephanenicolas.toothpick:ktp:$TOOTHPICK_VERSION"
        const val TOOTHPICK_COMPILER =
            "com.github.stephanenicolas.toothpick:toothpick-compiler:$TOOTHPICK_VERSION"

        const val KODEIN = "org.kodein.di:kodein-di-generic-jvm:$KODEIN_VERSION"
    }

    object ArchCore {
        const val RUMTIME = "androidx.arch.core:core-runtime:${Versions.ARCH_CORE_VERSION}"
        const val TESTING = "androidx.arch.core:core-testing:${Versions.ARCH_CORE_VERSION}"
    }

    object Network {
        const val RETROFIT = "com.squareup.retrofit2:retrofit:$RETROFIT_VERSION"
        const val RETROFIT_CONVERTER_GSON =
            "com.squareup.retrofit2:converter-gson:$RETROFIT_VERSION"
        const val RETROFIT_COROUTINES_ADAPTER =
            "com.jakewharton.retrofit:retrofit2-kotlin-coroutines-adapter:0.9.2"
        const val OKHTTP = "com.squareup.okhttp3:okhttp:$OKHTTP_VERSION"
        const val MOCK_SERVER = "com.squareup.okhttp3:mockwebserver:$OKHTTP_VERSION"

        const val LOGGING_INTERCEPTOR = "com.squareup.okhttp3:logging-interceptor:$OKHTTP_VERSION"
        const val GSON = "com.google.code.gson:gson:2.8.5"
        const val KLAXON = "com.beust:klaxon:5.0.1"

        fun DependencyHandler.addBaseNetworkDependencies() {
            implementation(RETROFIT)
            implementation(RETROFIT_CONVERTER_GSON)
            implementation(RETROFIT_COROUTINES_ADAPTER)
            implementation(OKHTTP)
            implementation(LOGGING_INTERCEPTOR)
            implementation(GSON)
        }
    }

    object ImageProcessor {
        const val COIL = "io.coil-kt:coil:$COIL_VERSION"
        const val CROPPER = "com.theartofdev.edmodo:android-image-cropper:2.8.0"
        const val COMPRESSOR = "id.zelory:compressor:2.1.0"
        const val GLIDE = "com.github.bumptech.glide:glide:4.10.0"
        const val GLIDE_COMPILER = "com.github.bumptech.glide:compiler:4.10.0"
    }



    object Firebase {
        const val CORE = "com.google.firebase:firebase-core:16.0.8"
        const val ANALYTICS = "com.google.firebase:firebase-analytics:16.4.0"
        const val CRASH = "com.google.firebase:firebase-crash:16.2.1"
        const val CRASHLYTICS = "com.crashlytics.sdk.android:crashlytics:2.9.9"
        const val PERFORMANCE = "com.google.firebase:firebase-perf:19.0.4"
    }

    object Navigation {
        const val RUNTIME = "androidx.navigation:navigation-runtime:$NAVIGATION_VERSION"
        const val UI = "androidx.navigation:navigation-ui:$NAVIGATION_VERSION"
        const val UI_KTX = "androidx.navigation:navigation-ui-ktx:$NAVIGATION_VERSION"
        const val RUNTIME_KTX = "androidx.navigation:navigation-runtime-ktx:$NAVIGATION_VERSION"
        const val FRAGMENT = "androidx.navigation:navigation-fragment:$NAVIGATION_VERSION"
        const val FRAGMENT_KTX =
            "androidx.navigation:navigation-fragment-ktx:$NAVIGATION_VERSION"
        const val SAFE_ARGS =
            "androidx.navigation:navigation-safe-args-gradle-plugin:$NAVIGATION_VERSION"

        fun DependencyHandler.addNavigationDependencies() {
            implementation(RUNTIME)
            implementation(UI)
            implementation(UI_KTX)
            implementation(RUNTIME_KTX)
            implementation(FRAGMENT)
            implementation(FRAGMENT_KTX)
        }
    }

    object Work {
        const val RUNTIME = "androidx.work:work-runtime:$WORK_VERSION"
        const val RUNTIME_KTX = "androidx.work:work-runtime-ktx:$WORK_VERSION"
        const val FIREBASE = "androidx.work:work-firebase:$WORK_VERSION"
    }

    object Facebook {
        const val FACEBOOK_LOGIN = "com.facebook.android:facebook-login:$FACEBOOK_LOGIN_VERSION"

        // more information about litho: https://fblitho.com/docs/getting-started#doc-gradle-kt
        const val LITHO_CORE = "com.facebook.litho:litho-core:$LITHO_VERSION"
        const val LITHO_WIDGET = "com.facebook.litho:litho-widget:$LITHO_VERSION"
        const val LITHO_PROCESSOR = "com.facebook.litho:litho-processor:$LITHO_VERSION"
        const val LITHO_FRESCO = "com.facebook.litho:litho-fresco:$LITHO_VERSION"
        const val LITHO_ANNOTATIONS = "com.facebook.litho:litho-annotations:0.19.0"

        fun DependencyHandler.applyLithoDependencies(
            vararg implement: String
        ) {
            implementation(LITHO_CORE)
            implementation(LITHO_WIDGET)
            kapt(LITHO_PROCESSOR)
            implement.forEach {
                implementation(it)
            }
        }

        // more information about stetho: http://facebook.github.io/stetho/
        const val STETHO = "com.facebook.stetho:stetho:$STETHO_VERSION"
        const val STETHO_OKHTTP = "com.facebook.stetho:stetho-okhttp3:$STETHO_VERSION"
        const val STETHO_URL_CONNECTION = "com.facebook.stetho:stetho-urlconnection:$STETHO_VERSION"

        //more information about flipper: https://fbflipper.com/
        //FLIPPER_VERSION
        const val FLIPPER = "com.facebook.flipper:flipper:$FLIPPER_VERSION"
        const val FLIPPER_NOOP = "com.facebook.flipper:flipper-noop:$FLIPPER_VERSION"
        const val FLIPPER_LITHO = "com.facebook.flipper:flipper-litho-plugin:$FLIPPER_VERSION"

        // more information about battery metrics:https://github.com/facebookincubator/Battery-Metrics
        const val BATTERY_METRICS = "com.facebook.battery:metrics:$BATTERY"
        const val BATTERY_REPORTERS = "com.facebook.battery:reporters:$BATTERY"
        const val BATTERY_SERIALIZERS = "com.facebook.battery:serializers:$BATTERY"

        const val SO_LOADER = "com.facebook.soloader:soloader:0.5.1"
    }

    object Log {
        const val TIMBER = "com.jakewharton.timber:timber:4.7.1"
    }
}
