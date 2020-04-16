package ws2.java2.controller;

import ws2.java2.entity.*;

public class VehicleManager {
	Airplane[] airplaneArr;
	Car[] carArr;
	Ship[] shipArr;
	
	
	public VehicleManager() {
		airplaneArr = new Airplane[1];
		carArr = new Car[3];
		shipArr = new Ship[2];
		
		airplaneArr[0] = new Airplane("����747", 1300, 300, true, 4);
		carArr[0] = new Car("�ҳ�Ÿ3", 180, 45, true, 20);
		carArr[1] = new Car("���", 200, 40, true, 11);
		carArr[2] = new Car("�׷���", 250, 80, true, 50);
		shipArr[0] = new Ship("Ÿ��Ÿ��", 500, 30, true, 400);
		shipArr[1] = new Ship("�Ǵн�", 800, 200, true, 500);
		
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
			shipArr[inx].setAvailable(true);
		}
		
		System.out.println();
	}
}

