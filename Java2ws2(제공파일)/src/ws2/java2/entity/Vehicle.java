package ws2.java2.entity;

public class Vehicle {
	private String modelName;
	private int maxSpeed;
	private int numberLimit;
	private boolean available;
	
	public Vehicle(String modelName, int maxSpeed, int numberLimit, boolean available  ) {
		this.modelName = modelName;
		this.maxSpeed = maxSpeed;
		this.numberLimit = numberLimit;
		this.available = available;	
	}
	
	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
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

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public static void main(String[] args) {
		
	}
	
	public void displayInfo() {
	
	}
}
