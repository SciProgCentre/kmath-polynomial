import org.jetbrains.kotlin.gradle.tasks.KotlinJvmCompile

plugins {
    kotlin("jvm")
}

repositories {
    mavenCentral()
    maven("https://repo.kotlin.link")
}

dependencies {
    implementation(rootProject)
}

kotlin.sourceSets.all {
    with(languageSettings) {
        optIn("kotlin.contracts.ExperimentalContracts")
        optIn("space.kscience.kmath.UnstableKMathAPI")
    }
}

tasks.withType<KotlinJvmCompile> {
    kotlinOptions {
        jvmTarget = "11"
        freeCompilerArgs = freeCompilerArgs + "-Xjvm-default=all" + "-Xopt-in=kotlin.RequiresOptIn" + "-Xlambdas=indy"
    }
}

readme {
    maturity = space.kscience.gradle.Maturity.EXPERIMENTAL
}
