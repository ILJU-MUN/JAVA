package ws2.java2.entity;

public class Ship extends Vehicle{
	private int replacement;
	public Ship(String modelName, int maxSpeed, int numberLimit, boolean available, int replacement) {
		super(modelName, maxSpeed, numberLimit, available);
		this.replacement = replacement;
	}

	public void displayInfo() {
		System.out.println("-------------------------------------------");
		System.out.println(" 모 델 명 : " + getModelName());
		System.out.println(" 최고속도 : " + getMaxSpeed() + "km/h");
		System.out.println(" 최대정원 : " + getNumberLimit() + "명");
		System.out.println(" 배 수 량 : " + getReplacement() + "톤");
	}

	public int getReplacement() {
		return replacement;
	}

	public void setReplacement(int replacement) {
		this.replacement = replacement;
	}

}
