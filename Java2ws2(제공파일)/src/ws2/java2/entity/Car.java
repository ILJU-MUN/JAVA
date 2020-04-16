package ws2.java2.entity;

public class Car extends Vehicle{
	private int mileage;
	public Car(String modelName, int maxSpeed, int numberLimit, boolean available, int mileage) {
		super(modelName, maxSpeed, numberLimit, available);
		this.mileage = mileage;
	}

	public void displayInfo() {
		System.out.println("-------------------------------------------");
		System.out.println(" 모 델 명 : " + getModelName());
		System.out.println(" 최고속도 : " + getMaxSpeed() + "km/h");
		System.out.println(" 최대정원 : " + getNumberLimit() + "명");
		System.out.println(" 평균연비 : " + getMileage() + "km/l");
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
}
