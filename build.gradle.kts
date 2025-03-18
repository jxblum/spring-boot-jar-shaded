plugins {
	java
	id("org.springframework.boot") version "3.4.3" apply false
	id("io.spring.dependency-management")

}

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(17)
	}
}

allprojects {
	group = "org.codeprimate.examples"
	version = "0.1.0-SNAPSHOT"
}

subprojects {

	apply(plugin = "io.spring.dependency-management")

	repositories {
		mavenCentral()
	}

	dependencyManagement {
		imports {
 			mavenBom(org.springframework.boot.gradle.plugin.SpringBootPlugin.BOM_COORDINATES)
		}
	}
}

