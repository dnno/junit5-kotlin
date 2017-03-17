buildscript {

    var kotlinVersion: String by extra
    kotlinVersion = "1.1.0"

    repositories {
        mavenCentral()
    }

    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
        classpath("org.jetbrains.kotlin:kotlin-allopen:$kotlinVersion")
    }

}

val kotlinVersion: String by extra

// JUnit 5
val junitPlatformVersion = "1.0.0-M3"
val junitVintageVersion = "4.12.0-M3"
val junitJupiterVersion = "5.0.0-M3"

apply {
    plugin("kotlin")
}

repositories {
    mavenCentral()
}

dependencies {
    compile("org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion")
    compile("org.jetbrains.kotlin:kotlin-reflect:$kotlinVersion")

    testRuntime("org.junit.vintage:junit-vintage-engine:${junitVintageVersion}")
    testRuntime("org.junit.jupiter:junit-jupiter-engine:${junitJupiterVersion}")

    testCompile("org.junit.jupiter:junit-jupiter-api:$junitJupiterVersion")
}
