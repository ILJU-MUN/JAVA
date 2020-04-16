package ws2.java2.entity;

public class Car extends Vehicle{
	private int mileage;
	public Car(String modelName, int maxSpeed, int numberLimit, boolean available, int mileage) {
		super(modelName, maxSpeed, numberLimit, available);
		this.mileage = mileage;
	}

	public void displayInfo() {
		System.out.println("-------------------------------------------");
		System.out.println(" �� �� �� : " + getModelName());
		System.out.println(" �ְ�ӵ� : " + getMaxSpeed() + "km/h");
		System.out.println(" �ִ����� : " + getNumberLimit() + "��");
		System.out.println(" ��տ��� : " + getMileage() + "km/l");
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
}
