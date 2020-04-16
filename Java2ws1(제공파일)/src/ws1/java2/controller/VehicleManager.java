package ws1.java2.controller;

import ws1.java2.entity.*;

public class VehicleManager {
	Airplane[] airplaneArr;
	Car[] carArr;
	Ship[] shipArr;
	
	public VehicleManager() {
		airplaneArr = new Airplane[2];
		carArr = new Car[3];
		shipArr = new Ship[2];
		
		airplaneArr[0] = new Airplane("보잉11", 1,1,1);
		
		airplaneArr[1] = new Airplane();
		airplaneArr[1].setModelName("버터플라이");
		airplaneArr[1].setMaxSpeed(2500);
		airplaneArr[1].setNumberLimit(700);
		airplaneArr[1].setNumOfEngine(4);
		
		
		carArr[0] = new Car();
		carArr[0].setModelName("소가타는 소나타3");
		carArr[0].setMaxSpeed(1250);
		carArr[0].setNumberLimit(22);
		carArr[0].setMileage(22);
		
		carArr[1] = new Car();
		carArr[1].setModelName("티코2");
		carArr[1].setMaxSpeed(130);
		carArr[1].setNumberLimit(5);
		carArr[1].setMileage(2);

		carArr[2] = new Car();
		carArr[2].setModelName("스타렉스");
		carArr[2].setMaxSpeed(500);
		carArr[2].setNumberLimit(100);
		carArr[2].setMileage(11);

		shipArr[0] = new Ship();
		shipArr[0].modelName = "크루즈2";
		shipArr[0].maxSpeed = 30;
		shipArr[0].numberLimit = 400;
		shipArr[0].replacement = 35000;
			
		shipArr[1] = new Ship();
		shipArr[1].modelName = "노틸러스";
		shipArr[1].maxSpeed = 25;
		shipArr[1].numberLimit = 150;
		shipArr[1].replacement = 15000;
	}
	
	public void displayVehicles(String title) {
		System.out.println(title);
		
		for (int inx = 0 ; inx < airplaneArr.length ; inx++) {
			airplaneArr[inx].displayInfo();
			airplaneArr[inx].setAvailable(true);
		}
		
		for (int inx = 0 ; inx < carArr.length ; inx++) {
			carArr[inx].displayInfo();
			carArr[inx].setAvailable(true);
		}
		
		for (int inx = 0 ; inx < shipArr.length ; inx++) {
			shipArr[inx].displayInfo();
			shipArr[inx].available = true;
		}
		
		System.out.println();
	}
}

