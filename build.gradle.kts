plugins {
	java
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
	repositories {
		mavenCentral()
	}
}

