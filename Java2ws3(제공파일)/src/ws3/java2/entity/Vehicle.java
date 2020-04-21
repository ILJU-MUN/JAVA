package ws3.java2.entity;


public abstract class Vehicle implements Comparable/*sort를 사용하기 위해 implements*/{
	private String modelName;
	private int maxSpeed;
	private int numberLimit;
	private boolean available;
	
	@Override
	public int compareTo(Object v) {
		Vehicle  s = (Vehicle)v;
		if(this.modelName.length() > s.modelName.length())
			return 1;
		else if(this.modelName.length() < s.modelName.length())
			return -1;
		else
			return 0;
	}
	
	public Vehicle() {
	}
	
	public Vehicle(String modelName, int maxSpeed, int numberLimit) {
		this.modelName = modelName;
		this.maxSpeed = maxSpeed;
		this.numberLimit = numberLimit;
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
	
	public void displayInfo() {
		System.out.println("-------------------------------------------");
		System.out.println(" 모 델 명 : " + modelName);
		System.out.println(" 최고속도 : " + maxSpeed + "km/h");
		System.out.println(" 최대정원 : " + numberLimit + "명");
	}
	
}
