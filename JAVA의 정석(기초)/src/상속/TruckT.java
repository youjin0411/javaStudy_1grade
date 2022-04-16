package 상속;

public class TruckT extends Car{
	TruckT(){
		System.out.println("Truck 생성자");
	}
	public static void main(String args[]) {
		TruckT truck = new TruckT();
	}
}
