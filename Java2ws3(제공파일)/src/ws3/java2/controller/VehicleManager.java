package ws3.java2.controller;

import java.util.*;
import ws3.java2.entity.*;

public class VehicleManager {
	//�Ʒ� �ڵ�� �迭�� �����ϴ� ������ ������ ���̴�.
	//ArrayList�� �����ϵ��� ���ο� ������ �����Ͻÿ�.(��������  vehicleList)
	ArrayList<Vehicle> vehicleList = new ArrayList<>();  //��̸���Ʈ�� ���� vehicleList ��ü
	
	public VehicleManager() {
		//�Ʒ� �ڵ�� �迭�� �̿��ϵ��� �ۼ��Ǿ���.
		//ArrayList�� ����ϵ��� �����Ͻÿ�.
		//add�� ���ؼ� vehicleList�� A, C, S ��ü�� �ִ°�
		vehicleList.add(new Airplane("����474", 255, 55, 5));
		vehicleList.add(new Car("���", 222, 333, 145));
		vehicleList.add(new Ship("Ÿ��Ÿ��1", 24151, 50, 3));
	}
	
	public void displayVehicles1(String title) {
		//�Ʒ� �ڵ�� �迭�� ����Ű�� ��� ��ü�� ������ ����ϵ��� �ۼ��Ǿ���.
		//ArrayList�� vehicleList�� ��� ��� ��ü�� ����ϵ��� �����Ͻÿ�.
		System.out.println(title);
		for (Vehicle s : vehicleList) {
			s.displayInfo();
			s.setAvailable(true);
		}
		System.out.println();
	}
	
	public void sortByModelName(String title) {
		//�Ʒ� �ڵ�� �迭�� ���ؼ� ������ �����ϴ� ���̴�.
		//ArrayList�� vehicleList�� ���ؼ� ������ �����ϴ� �ڵ�� ��ȯ�Ͻÿ�.
		System.out.println(title);
		Collections.sort(vehicleList);
		}

	public void displayVehicles2(String title) {
		//�Ʒ� �ڵ�� �迭�� ����Ű�� ��� ��ü�� ������ ����ϵ��� �ۼ��Ǿ���.
		//ArrayList�� vehicleList�� ��� ��� ��ü�� ����ϵ��� �����Ͻÿ�.
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


