package service;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

import qualifier.Idared;
import qualifier.Jonagold;
import data.Apple;

@Singleton
@Startup
public class Starter {

	@Inject
	private Logger _logger;

	@Inject
	private Apple _apple;

	@Inject
	@Idared
	private Apple _idaredApple;

	@Inject
	@Jonagold
	private Apple _jonagoldApple;

	@PostConstruct
	public void init() {
		_logger.info(Starter.class + " is initializing...");
		_logger.info("_apple" + _apple);
		_logger.info("_idaredApple" + _idaredApple);
		_logger.info("_jonagoldApple" + _jonagoldApple);
	}
}
