package data;

import javax.inject.Named;

@Named
public class Fruit implements Plant {

	@Override
	public String toString() {
		return "Fruit []";
	}

}
