package decorator;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.enterprise.inject.Any;
import javax.inject.Inject;
import javax.inject.Named;

import data.Plant;

@Decorator
public abstract class RottenFruit implements Plant {

	@Inject
	@Named("fruit")
	@Delegate
	@Any
	private Plant plant;

	public RottenFruit() {
		System.out.println(RottenFruit.class + " initialized");
		// _logger.info(MarketableApple.class + " Marketable Apple");
	}

	@Override
	public String toString() {
		return RottenFruit.class + " decorates " + super.toString();
	}
}
