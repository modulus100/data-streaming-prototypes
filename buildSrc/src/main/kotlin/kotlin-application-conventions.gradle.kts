import org.gradle.kotlin.dsl.application
import org.gradle.kotlin.dsl.version

plugins {
    // Apply the common convention plugin for shared build configuration between library and application projects.
    id("kotlin-common-conventions")

    // Apply the application plugin to add support for building a CLI application in Java.
    application
}
