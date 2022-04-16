package 상속;

public class Truckmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Truck2 truck = new Truck2();
		truck.carname = "프론티어";
		truck.truckton = 3;
		System.out.println("나의 트럭은 "+truck.carname+"이다.");
		System.out.println(truck.carname+"는 "+truck.truckton+"톤을 실을 수 있다");
	}

}
