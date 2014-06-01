package data;
import interceptor.binding.ExecutionTime;

import javax.inject.Named;

@Named
public class Peach extends Fruit {

	@Override
	public String toString() {
		return "Peach []";
	}

	@ExecutionTime
	public String getTaste() {
		return "sweet";
	}

}
