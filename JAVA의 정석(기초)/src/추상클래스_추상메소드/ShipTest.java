package 추상클래스_추상메소드;

public class ShipTest extends Ship{
	public int Passengerst() {
		return 10;
	}
	public int Luggage() {
		return 10;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShipTest ship = new ShipTest();
		System.out.println(ship.Passengerst());
		System.out.println(ship.Luggage());
	}

}
