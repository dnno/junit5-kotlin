val kotlinVersion = "1.1.3"

// JUnit 5
val junitPlatformVersion = "1.0.0-RC2"
val junitVintageVersion = "4.12.0-RC2"
val junitJupiterVersion = "5.0.0-RC2"

buildscript {

    val kotlinVersion = "1.1.3"
    val junitPlatformVersion = "1.0.0-RC2"

    repositories {
        mavenCentral()
    }

    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
        classpath("org.jetbrains.kotlin:kotlin-allopen:$kotlinVersion")
        classpath("org.junit.platform:junit-platform-gradle-plugin:$junitPlatformVersion")
    }

}

apply {
    plugin("kotlin")
    plugin("org.junit.platform.gradle.plugin")
}

repositories {
    mavenCentral()
}

dependencies {
    compile("org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion")
    compile("org.jetbrains.kotlin:kotlin-reflect:$kotlinVersion")

    testRuntime("org.junit.vintage:junit-vintage-engine:$junitVintageVersion")
    testRuntime("org.junit.jupiter:junit-jupiter-engine:$junitJupiterVersion")
    testRuntime("org.junit.platform:junit-platform-runner:$junitPlatformVersion")
    testRuntime("org.junit.platform:junit-platform-launcher:$junitPlatformVersion")

    testCompile("org.junit.vintage:junit-vintage-engine:$junitVintageVersion")
    testCompile("org.junit.jupiter:junit-jupiter-api:$junitJupiterVersion")
    testCompile("org.junit.jupiter:junit-jupiter-params:$junitJupiterVersion")
}

