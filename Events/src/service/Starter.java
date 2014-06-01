package service;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.enterprise.event.Event;
import javax.inject.Inject;

import qualifier.Idared;
import builder.AppleBuilder;
import data.Apple;
import data.AppleType;

@Singleton
@Startup
public class Starter {

	@Inject
	private Logger _logger;

	@PostConstruct
	public void init() {
		_logger.info(Starter.class + " is initializing...");
		
	}

	@Inject
	@Idared
	private Event< Apple> _appleEvent;

	@Schedule(second = "*/5", minute = "*", hour = "*", persistent = false)
	private void createApple() {
		final Apple apple = AppleBuilder.builder().type(AppleType.IDARED)
				.build();
		_logger.info("fire: " + apple);
		_appleEvent.fire(apple);
		_logger.info("fired: " + apple);
	}
}
