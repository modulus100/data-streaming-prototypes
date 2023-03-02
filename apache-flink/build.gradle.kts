

plugins {
    id("java-application-conventions")
    id("org.jetbrains.kotlin.jvm") version "1.8.10"
}

dependencies {
}

application {
    // Define the main class for the application.
    mainClass.set("data.streaming.prototypes.flink.Main")
}
