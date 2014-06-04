package data;

import javax.inject.Named;

@Named
public class Apple extends Fruit {

	private String _taste = "sour";

	private AppleType _type;

	@Override
	public String toString() {
		return Apple.class.getSimpleName() + " [type=" + getType() + ", taste="
				+ getTaste() + "]";
	}

	public AppleType getType() {
		return _type;
	}

	public void setType(AppleType type) {
		_type = type;
	}

	@Override
	public String getTaste() {
		return _taste;
	}

	public void setTaste(String taste) {
		_taste = taste;
	}
}
