package producer;

import javax.enterprise.inject.Produces;
import javax.inject.Named;

import qualifier.Idared;
import qualifier.Jonagold;
import builder.AppleBuilder;
import data.Apple;
import data.AppleType;

/**
 * Session Bean implementation class Starter
 */
public class FruitProducer {

//	@Produces
//	@Named("apple1")
//	public Apple produceApple() {
//		return new Apple();
//	}

	@Named
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
