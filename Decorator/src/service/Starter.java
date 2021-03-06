package service;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

import data.Vegetable;

@Singleton
@Startup
public class Starter {

	@Inject
	private Logger _logger;

	@Inject
	private Vegetable _vegetable;

	@PostConstruct
	public void init() {
		_logger.info(Starter.class + " is initializing...");
		_logger.info("_vegetable = " + _vegetable);
		_logger.info("taste: " + _vegetable.getTaste());
	}
}
