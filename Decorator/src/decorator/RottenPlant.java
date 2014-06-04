package decorator;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.enterprise.inject.Any;
import javax.inject.Inject;

import data.Plant;
import data.Vegetable;

@Decorator
public abstract class RottenPlant implements Plant {

	@Inject
	@Delegate
	@Any
	private Vegetable _plant;

	@Inject
	private Logger _logger;

	@PostConstruct
	public void init() {
		_logger.info(RottenPlant.class + " initialized");
	}

	@Override
	public String getTaste() {
		return "rotten " + _plant.getTaste();
	}
}
