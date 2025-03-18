pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
    plugins {
        id("io.spring.dependency-management") version "1.1.7"
    }
}

rootProject.name = "spring-boot-jar-shading"

include("services:serviceA:client")
include("services:serviceB:client")
include("services:serviceC")
include("app")
