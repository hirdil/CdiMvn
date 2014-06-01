package service;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

import data.Peach;

@Singleton
@Startup
public class Starter {

	@Inject
	private Logger _logger;

	@Inject
	private Peach _peach;

	@PostConstruct
	public void init() {
		_logger.info(Starter.class + " is initializing...");
		_logger.info("_peach = " + _peach.toString());
		_logger.info("_peach.getTaste() = " + _peach.getTaste());
	}
}
