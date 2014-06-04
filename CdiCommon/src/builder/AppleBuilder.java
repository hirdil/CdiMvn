package builder;

import data.Apple;
import data.AppleType;

public class AppleBuilder {

	public static AppleBuilder builder() {
		return new AppleBuilder();
	};

	private final Apple _apple = new Apple();

	public AppleBuilder type(final AppleType type) {
		_apple.setType(type);
		return this;
	}

	public AppleBuilder taste(final String taste) {
		_apple.setTaste(taste);
		return this;
	}

	public Apple build() {
		return _apple;
	}
}