package service;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;
import javax.inject.Named;

import data.Apple;
import data.Fruit;

@Singleton
@LocalBean
@Startup
public class Starter {

	@Inject
	private Apple _fruit;

	public  Starter() {
		System.out.println("def. const.");
	}

//	@Inject
	public  Starter(Apple fruit3) {
		System.out.println("fruit3 = " + fruit3.toString());
	}
	
	@Inject 
	public  Starter(@Named("apple") Fruit fruit4, @Named("plum") Fruit fruit5) {
		System.out.println("fruit4 = " + fruit4.toString());
		System.out.println("fruit5 = " + fruit5.toString());
	}

	@PostConstruct
	private void init() {
		System.out.println(Starter.class + " is initializing...");
		System.out.println("_fruit = " + _fruit.toString());
	}

	@Inject 
	public void method(Apple fruit2) {
		System.out.println("fruit2 = " + fruit2.toString());
	}
}
