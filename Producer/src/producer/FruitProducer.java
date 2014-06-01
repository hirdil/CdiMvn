package producer;

import javax.enterprise.inject.New;
import javax.enterprise.inject.Produces;

import qualifier.Idared;
import qualifier.Jonagold;
import builder.AppleBuilder;
import data.Apple;
import data.AppleType;
import data.Fruit;

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
	public Apple produceAppleJonagold(@New Apple apple) {
		apple.setType(AppleType.JONAGOLD);
		return apple;
	}

}
