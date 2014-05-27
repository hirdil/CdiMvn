package service;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

import data.Apple;
import qualifier.Idared;
import qualifier.Jonagold;

@Singleton
@LocalBean
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
		_logger.info("_apple" + _apple.toString());
		_logger.info("_idaredApple" + _idaredApple.toString());
		_logger.info("_jonagoldApple" + _jonagoldApple.toString());
	}
}
