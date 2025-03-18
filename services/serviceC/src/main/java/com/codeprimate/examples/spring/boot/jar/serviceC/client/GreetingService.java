package com.codeprimate.examples.spring.boot.jar.serviceC.client;

import org.codeprimate.examples.spring.boot.jar.serviceA.client.MessageService;
import org.codeprimate.examples.spring.boot.jar.serviceB.client.PersonalizationService;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

/**
 * @author John Blum
 * @since 0.1.0
 */
@Service
@SuppressWarnings("unused")
public class GreetingService {

	private final MessageService messageService;

	private final PersonalizationService personalizationService;

	public GreetingService(MessageService messageService, PersonalizationService personalizationService) {

		Assert.notNull(messageService, "MessageService is required");
		Assert.notNull(personalizationService, "PersonalizationService is required");

		this.messageService = messageService;
		this.personalizationService = personalizationService;
	}

	public String greet() {
		return this.personalizationService.personalize(this.messageService.message());
	}
}
