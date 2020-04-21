package ws3.java2.controller;

import java.util.*;
import ws3.java2.entity.*;

public class VehicleManager {
	//아래 코드는 배열을 참조하는 변수를 선언한 것이다.
	//ArrayList를 참조하도록 새로운 변수를 선언하시오.(변수명은  vehicleList)
	ArrayList<Vehicle> vehicleList = new ArrayList<>();  //어레이리스트로 만든 vehicleList 객체
	
	public VehicleManager() {
		//아래 코드는 배열을 이용하도록 작성되었다.
		//ArrayList를 사용하도록 수정하시오.
		//add를 통해서 vehicleList에 A, C, S 객체를 넣는것
		vehicleList.add(new Airplane("보잉474", 255, 55, 5));
		vehicleList.add(new Car("쏘렌토", 222, 333, 145));
		vehicleList.add(new Ship("타이타닉1", 24151, 50, 3));
	}
	
	public void displayVehicles1(String title) {
		//아래 코드는 배열이 가리키는 모든 객체의 정보를 출력하도록 작성되었다.
		//ArrayList인 vehicleList에 담긴 모든 객체를 출력하도록 수정하시오.
		System.out.println(title);
		for (Vehicle s : vehicleList) {
			s.displayInfo();
			s.setAvailable(true);
		}
		System.out.println();
	}
	
	public void sortByModelName(String title) {
		//아래 코드는 배열에 대해서 정렬을 수행하는 것이다.
		//ArrayList인 vehicleList에 대해서 정렬을 수행하는 코드로 변환하시오.
		System.out.println(title);
		Collections.sort(vehicleList);
		}

	public void displayVehicles2(String title) {
		//아래 코드는 배열이 가리키는 모든 객체의 정보를 출력하도록 작성되었다.
		//ArrayList인 vehicleList에 담긴 모든 객체를 출력하도록 수정하시오.
		System.out.println(title);
		Iterator<Vehicle> ltr = vehicleList.iterator();
		while(ltr.hasNext()) {
			Vehicle v = ltr.next();
			v.displayInfo();
			v.setAvailable(true);
		}
		System.out.println();
	}
}


