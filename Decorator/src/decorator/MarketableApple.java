package decorator;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.enterprise.inject.Any;
import javax.inject.Inject;
import javax.inject.Named;

import data.Fruit;
import data.Plant;


@Decorator
public abstract class MarketableApple implements Plant {

	@Inject
	@Named("apple")
	@Delegate
	@Any
	private Fruit fruit;

	public MarketableApple() {
		System.out.println(MarketableApple.class + " Marketable Apple");
		// _logger.info(MarketableApple.class + " Marketable Apple");
	}

	@Override
	public String toString() {
		return MarketableApple.class + " Marketable Apple" + super.toString();
	}
}
