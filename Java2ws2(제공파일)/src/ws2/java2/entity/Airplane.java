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
		System.out.println(" �� �� �� : " + getModelName());
		System.out.println(" �ְ�ӵ� : " + getMaxSpeed() + "km/h");
		System.out.println(" �ִ����� : " + getNumberLimit() + "��");
		System.out.println(" �������� : " + getNumOfEngine() + "��");
	}
}
