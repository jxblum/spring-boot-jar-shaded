package org.codeprimate.examples.spring.boot.jar.serviceA.client;

/**
 * @author John Blum
 * @since 0.1.0
 */
@FunctionalInterface
@SuppressWarnings("unused")
public interface MessageService {

	static MessageService hello() {
		return () -> "Hello";
	}

	String message();

}
