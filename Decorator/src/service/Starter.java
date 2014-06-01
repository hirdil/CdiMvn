package service;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;
import javax.inject.Named;

import qualifier.Idared;
import qualifier.Jonagold;
import data.Fruit;
import data.Plant;

@Singleton
@Startup
public class Starter {

	@Inject
	private Logger _logger;

	@Inject
	@Named("fruit")
	private Fruit _apple;

	@Inject
	@Idared
	private Plant _idaredApple; 

	@Inject
	@Jonagold
	private Plant _jonagoldApple;

	@PostConstruct
	public void init() {
		_logger.info(Starter.class + " is initializing...");
		_logger.info("_apple = " + _apple.toString());
		_logger.info("_idaredApple = " + _idaredApple.toString());
		_logger.info("_jonagoldApple = " + _jonagoldApple.toString());
	}
}
