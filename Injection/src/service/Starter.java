package service;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;
import javax.inject.Named;

import data.Apple;
import data.Fruit;
import data.Plant;

@Singleton
@Startup
public class Starter {

	@Inject
	private Apple _fruit;

	public  Starter() {
		System.out.println("default constructor");
		System.out.println("_fruit = " + _fruit);
	}

	@Inject 
	public  Starter(@Named("apple") final Fruit fruit4, @Named("plum") final Plant fruit5) {
		System.out.println("constructor");
		System.out.println("fruit4 = " + fruit4);
		System.out.println("fruit5 = " + fruit5);
	}

	@PostConstruct
	private void init() {
		System.out.println("init");
		System.out.println("_fruit = " + _fruit);
	}

	@Inject 
	public void method(final Apple fruit2) {
		System.out.println("method");
		System.out.println("fruit2 = " + fruit2);
	}
}