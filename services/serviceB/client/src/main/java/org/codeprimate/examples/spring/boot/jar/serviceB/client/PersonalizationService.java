package org.codeprimate.examples.spring.boot.jar.serviceB.client;

/**
 * @author John Blum
 * @since 0.1.0
 */
@FunctionalInterface
@SuppressWarnings("unused")
public interface PersonalizationService {

	static PersonalizationService username() {
		return message -> "%1$s, %2$s".formatted(message, System.getProperty("user.name"));
	}

	String personalize(String message);

}
