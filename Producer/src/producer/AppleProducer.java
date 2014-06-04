package producer;

import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.New;
import javax.enterprise.inject.Produces;
import javax.inject.Named;

import qualifier.Idared;
import qualifier.Jonagold;
import qualifier.Rotten;
import builder.AppleBuilder;
import data.Apple;
import data.AppleType;

public class AppleProducer {
	
	@Produces
	@Idared
	public Apple produceAppleIdared() {
		return AppleBuilder.builder().type(AppleType.IDARED).build();
	}

	@Produces
	@Jonagold
	@Named("jonagold")
	public Apple produceAppleJonagold(@New final Apple apple) {
		apple.setType(AppleType.JONAGOLD);
		return apple;
	}

	@Produces
	@Rotten
	@Jonagold
	public Apple produceAppleRottenJonagold(@New final Apple apple) {
		apple.setType(AppleType.JONAGOLD);
		apple.setTaste("Do not try it!");
		return apple;
	}

	// Provides the possibility to release bean resources before bean is
	// destroyed.
	public void throwToBasket(@Disposes @Jonagold final Apple apple) {
		System.out.println("Apple to basket: " + apple);
	}
}
