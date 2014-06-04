package data;

import javax.enterprise.inject.Alternative;

@Alternative
public class FruitMock extends Fruit {

	@Override
	public String toString() {
		return FruitMock.class.getSimpleName();
	}

	@Override
	public String getTaste() {
		return "do not try it!";
	}
}
