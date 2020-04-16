package ws2.java2.entity;

public class Airplane extends Vehicle{
	private int numOfEngine;

	public Airplane(String modelName, int maxSpeed, int numberLimit, boolean available, int engine) {
		super(modelName, maxSpeed, numberLimit, available);
		this.numOfEngine = engine;
	}

	public int getNumOfEngine() {
		return numOfEngine;
	}

	public void setNumOfEngine(int numOfEngine) {
		this.numOfEngine = numOfEngine;
	}

	public void displayInfo() {
		System.out.println("-------------------------------------------");
		System.out.println(" 모 델 명 : " + getModelName());
		System.out.println(" 최고속도 : " + getMaxSpeed() + "km/h");
		System.out.println(" 최대정원 : " + getNumberLimit() + "명");
		System.out.println(" 엔진개수 : " + getNumOfEngine() + "개");
	}
}
