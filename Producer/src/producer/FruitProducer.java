package producer;

import javax.enterprise.inject.Produces;

import builder.AppleBuilder;
import data.Apple;
import data.AppleType;
import data.Fruit;
import qualifier.Idared;
import qualifier.Jonagold;

/**
 * Session Bean implementation class Starter
 */
public class FruitProducer {

	@Produces
	public Fruit produceApple() {
		return new Apple();
	}

	@Produces
	@Idared
	public Apple produceAppleIdared() {
		return AppleBuilder.builder().type(AppleType.IDARED).build();
	}

	@Produces
	@Jonagold
	public Apple produceAppleJonagold() {
		return AppleBuilder.builder().type(AppleType.JONAGOLD).build();
	}

}
