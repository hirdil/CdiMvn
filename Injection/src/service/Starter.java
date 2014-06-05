package service;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;
import javax.inject.Named;

import data.Apple;
import data.Fruit;
import data.Plant;

@Singleton
@Startup
public class Starter {

	// 1. field injection
	@Inject
	private Apple _apple;

	public Starter() {
		System.out.println("default constructor");
		System.out.println("_apple = " + _apple);
	}

	// 2. constructor injection
	@Inject
	public Starter(@Named("apple") final Fruit fruit2,
			@Named("plum") final Plant fruit3) {
		System.out.println("constructor injection");
		System.out.println("fruit2 = " + fruit2);
		System.out.println("fruit3 = " + fruit3);
		System.out.println("_appleField = " + _apple);
	}

	// 3. method (setter) injection
	@Inject
	public void setter(final Apple apple2) {
		System.out.println("method");
		System.out.println("apple2 = " + apple2);
	}

	// 4. dynamic injection
	// it can be inside method bodies to create cdi beans dynamically.
	@Inject
	protected Instance<Apple> _dynamicApple;
	
	@PostConstruct
	private void init() {
		System.out.println("init");
		System.out.println("_apple = " + _apple);
		System.out.println("get a dynamic Apple = " + _dynamicApple.get());
	}
}