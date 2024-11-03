plugins {
    kotlin("jvm") version "2.0.21"
    application
}

dependencies {
    // 필요한 Kotlin 라이브러리 추가
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.0")

}

application {
    mainClass.set("MainKt") // 진입점 설정
}
