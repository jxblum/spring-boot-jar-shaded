plugins {
    `java-library`
}

description = "Service C"
group = "org.codeprimate.examples.spring.boot.jar.service.C"

dependencies {
    api(project(":services:serviceA:client"))
    api(project(":services:serviceB:client"))
    implementation("org.springframework.boot:spring-boot-starter")
}
