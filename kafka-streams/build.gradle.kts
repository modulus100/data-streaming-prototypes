/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    id("java-application-conventions")
    id("org.jetbrains.kotlin.jvm") version "1.8.10"
}

dependencies {
    implementation("org.apache.commons:commons-text")
    implementation(project(":utilities"))
}

application {
    // Define the main class for the application.
    mainClass.set("data.streaming.prototypes.app.App")
}
