package builder;

import data.Apple;
import data.AppleType;

public class AppleBuilder {

	public static AppleBuilder builder() {
		return new AppleBuilder();
	};

	private Apple apple = new Apple();

	public AppleBuilder type(AppleType type) {
		apple.setType(type);
		return this;
	}

	public Apple build() {
		return apple;
	}
}