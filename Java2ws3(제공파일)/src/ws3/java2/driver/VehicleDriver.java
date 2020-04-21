package ws3.java2.driver;

import java.util.Collections;

import ws3.java2.controller.*;

public class VehicleDriver {
	public static void main(String[] args) {
		VehicleManager vm = new VehicleManager();
		vm.displayVehicles1(">> 재고 목록 <<");
		vm.sortByModelName("Collections.sort로 정렬");
		vm.displayVehicles2(">> 모델명으로 정렬된 재고 목록 <<");
	}
}
