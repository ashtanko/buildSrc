import extensions.androidTestImplementation
import extensions.androidTestUtil
import extensions.testImplementation
import org.gradle.api.artifacts.dsl.DependencyHandler

fun DependencyHandler.addTestDependencies() {
    androidTestUtil(TestDependencies.ORCHESTRATOR)
    androidTestImplementation(TestDependencies.RUNNER)
    androidTestImplementation(TestDependencies.RULES)
    androidTestImplementation(TestDependencies.ROOM)
    androidTestImplementation(TestDependencies.ESPRESSO)
    androidTestImplementation(TestDependencies.Mockito.CORE)
    androidTestImplementation(TestDependencies.Mockito.KOTLIN_2)
    androidTestImplementation(TestDependencies.KOTLIN_REFLECT)
    androidTestImplementation(TestDependencies.ARCH_CORE)
    androidTestImplementation(TestDependencies.JUNIT)

    testImplementation(TestDependencies.ARCH_CORE)
    testImplementation(TestDependencies.JUNIT)
    testImplementation(TestDependencies.Mockito.CORE)
    testImplementation(TestDependencies.Mockito.KOTLIN_2)
}

