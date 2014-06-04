package data;

import javax.inject.Named;

@Named
public class Plum extends Fruit {

	@Override
	public String toString() {
		return Plum.class.getSimpleName();
	}

	@Override
	public String getTaste() {
		return "sweet";
	}
}
