buildscript {

    var kotlinVersion: String by extra
    kotlinVersion = "1.1.1"

    var junitPlatformVersion: String by extra
    junitPlatformVersion = "1.0.0-M3"

    repositories {
        mavenCentral()
    }

    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
        classpath("org.jetbrains.kotlin:kotlin-allopen:$kotlinVersion")
        classpath("org.junit.platform:junit-platform-gradle-plugin:$junitPlatformVersion")
    }

}

val kotlinVersion: String by extra

// JUnit 5
val junitPlatformVersion: String by extra
val junitVintageVersion = "4.12.0-M3"
val junitJupiterVersion = "5.0.0-M3"

// Spek Framework
val spekFrameworkVersion = "1.1.0-beta4"

apply {
    plugin("kotlin")
    plugin("org.junit.platform.gradle.plugin")
}

repositories {
    mavenCentral()
    maven {
        setUrl("http://dl.bintray.com/jetbrains/spek")
    }
}

dependencies {
    compile("org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion")
    compile("org.jetbrains.kotlin:kotlin-reflect:$kotlinVersion")

    testRuntime("org.junit.vintage:junit-vintage-engine:${junitVintageVersion}")
    testRuntime("org.junit.jupiter:junit-jupiter-engine:${junitJupiterVersion}")
    testRuntime("org.jetbrains.spek:spek-junit-platform-engine:${spekFrameworkVersion}")

    testCompile("org.junit.vintage:junit-vintage-engine:$junitVintageVersion")
    testCompile("org.junit.jupiter:junit-jupiter-api:$junitJupiterVersion")
    testCompile("org.jetbrains.spek:spek-api:${spekFrameworkVersion}")
}
