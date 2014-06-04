package service;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

import data.Plant;

@Singleton
@Startup
public class Starter {

	@Inject
	private Logger _logger;

	// same for Fruit
	@Inject
	private Plant _plant;

	@PostConstruct
	public void init() {
		_logger.info(Starter.class + " is initializing...");
		_logger.info("injected:  " + _plant);
		_logger.info("taste: " + _plant.getTaste());
	}
}
