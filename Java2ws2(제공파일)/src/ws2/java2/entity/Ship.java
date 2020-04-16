package ws2.java2.entity;

public class Ship extends Vehicle{
	private int replacement;
	public Ship(String modelName, int maxSpeed, int numberLimit, boolean available, int replacement) {
		super(modelName, maxSpeed, numberLimit, available);
		this.replacement = replacement;
	}

	public void displayInfo() {
		System.out.println("-------------------------------------------");
		System.out.println(" �� �� �� : " + getModelName());
		System.out.println(" �ְ�ӵ� : " + getMaxSpeed() + "km/h");
		System.out.println(" �ִ����� : " + getNumberLimit() + "��");
		System.out.println(" �� �� �� : " + getReplacement() + "��");
	}

	public int getReplacement() {
		return replacement;
	}

	public void setReplacement(int replacement) {
		this.replacement = replacement;
	}

}
