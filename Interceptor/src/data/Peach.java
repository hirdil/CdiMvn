package data;

import interceptor.binding.ExecutionTime;

import javax.inject.Named;

@Named
public class Peach extends Fruit {

	@Override
	public String toString() {
		return Peach.class.getSimpleName();
	}

	@Override
	@ExecutionTime
	public String getTaste() {
		return "sweet";
	}
}
