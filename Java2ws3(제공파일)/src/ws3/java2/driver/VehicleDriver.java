package ws3.java2.driver;

import java.util.Collections;

import ws3.java2.controller.*;

public class VehicleDriver {
	public static void main(String[] args) {
		VehicleManager vm = new VehicleManager();
		vm.displayVehicles1(">> ��� ��� <<");
		vm.sortByModelName("Collections.sort�� ����");
		vm.displayVehicles2(">> �𵨸����� ���ĵ� ��� ��� <<");
	}
}
