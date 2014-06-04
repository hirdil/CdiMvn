package service;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.inject.Named;

import qualifier.Idared;
import qualifier.Jonagold;
import qualifier.Rotten;
import data.Apple;

@Singleton
@Startup
public class Starter {

	@Inject
	private Logger _logger;

	@Inject
	@Default
	private Apple _apple;

	@Inject
	@Idared
	private Apple _idaredApple;

	@Inject
	// This would be ambiguous here! : @Jonagold
	@Named("jonagold")
	private Apple _jonagoldApple;

	@Inject
	@Rotten
	@Jonagold
	private Apple _rottenJonagoldApple;

	@PostConstruct
	public void init() {
		_logger.info(Starter.class + " is initializing...");
		_logger.info("_apple = " + _apple);
		_logger.info("_idaredApple = " + _idaredApple);
		_logger.info("_jonagoldApple = " + _jonagoldApple);
		_logger.info("_rottenJonagoldApple = " + _rottenJonagoldApple);
	}
}
