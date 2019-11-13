import Versions.JUNIT_VERSION
import Versions.KOTLIN_VERSION
import Versions.MOCKITO_VERSION
import Versions.ROOM_VERSION
import Versions.RUNNER_VERSION
import Versions.TOOTHPICK_VERSION

object TestDependencies {

    const val JUNIT = "junit:junit:$JUNIT_VERSION"
    const val RUNNER = "androidx.test:runner:$RUNNER_VERSION"
    const val RULES = "androidx.test:rules:$RUNNER_VERSION"
    const val ORCHESTRATOR = "androidx.test:orchestrator:$RUNNER_VERSION"
    const val ESPRESSO = "androidx.test.espresso:espresso-core:3.1.1"
    const val KOTLIN_REFLECT = "org.jetbrains.kotlin:kotlin-reflect:$KOTLIN_VERSION"
    const val ROOM = "androidx.room:room-testing:$ROOM_VERSION"
    const val ARCH_CORE = "androidx.arch.core:core-testing:2.0.0"
    const val TOOTHPICK_JUNIT =
        "com.github.stephanenicolas.toothpick:toothpick-testing-junit5:$TOOTHPICK_VERSION"

    object Mockito {
        const val CORE = "org.mockito:mockito-core:$MOCKITO_VERSION"
        const val ANDROID = "org.mockito:mockito-android:$MOCKITO_VERSION"
        const val KOTLIN_2 = "com.nhaarman.mockitokotlin2:mockito-kotlin:2.0.0"
    }
}
