package data;


public class Vegetable implements Plant {

	@Override
	public String toString() {
		return Vegetable.class.getSimpleName();
	}

	@Override
	public String getTaste() {
		return "spicy";
	}
}
