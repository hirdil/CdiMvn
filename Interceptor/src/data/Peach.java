package data;

import interceptor.binding.ExecutionTime;

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
