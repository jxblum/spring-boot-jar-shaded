package org.codeprimate.examples.spring.boot.jar;

import org.codeprimate.examples.spring.boot.jar.serviceA.client.MessageService;
import org.codeprimate.examples.spring.boot.jar.serviceB.client.PersonalizationService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;

/**
 * @author John Blum
 * @since 0.1.0
 */
@SpringBootApplication
@SuppressWarnings("unused")
public class ShadedJarExampleApplication {

	public static void main(String[] args) {

		new SpringApplicationBuilder(ShadedJarExampleApplication.class)
			.web(WebApplicationType.NONE)
			.build()
			.run(args);
	}

	@SpringBootConfiguration
	static class ShadedJarExampleConfiguration {

		@Bean
		MessageService messageService() {
			return MessageService.hello();
		}

		PersonalizationService personalizationService() {
			return PersonalizationService.username();
		}
	}

	@Bean
	ApplicationRunner programRunner(MessageService messageService, PersonalizationService personalizationService) {
		return args -> System.out.printf("%s%n", personalizationService.personalize(messageService.message()));
	}
}
