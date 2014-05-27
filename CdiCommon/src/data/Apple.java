package data;
import javax.inject.Named;

@Named
public class Apple extends Fruit {

	private AppleType type;
	
	@Override
	public String toString() {
		return "Apple [type=" + getType() + "]";
	}

	public AppleType getType() {
		return type;
	}

	public void setType(AppleType type) {
		this.type = type;
	}
}
