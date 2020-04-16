package ws1.java2.entity;

public class Airplane {
	private int maxSpeed;
	private int numberLimit;
	private int numOfEngine;
	private boolean available;
	private String modelName;
	
	public Airplane(String mn, int ms, int nl, int noe){
		this.modelName = mn;
		this.maxSpeed = ms;
		this.numberLimit = nl;
		this.numOfEngine = noe;
	}
	public Airplane() {
		
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getNumberLimit() {
		return numberLimit;
	}

	public void setNumberLimit(int numberLimit) {
		this.numberLimit = numberLimit;
	}

	public int getNumOfEngine() {
		return numOfEngine;
	}

	public void setNumOfEngine(int numOfEngine) {
		this.numOfEngine = numOfEngine;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public void displayInfo() {
		System.out.println("-------------------------------------------");
		System.out.println(" �� �� �� : " + getModelName());
		System.out.println(" �ְ�ӵ� : " + getMaxSpeed());
		System.out.println(" �ִ����� : " + getNumberLimit());
		System.out.println(" �������� : " + getNumOfEngine() + "��");		
	}
}
