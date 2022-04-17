package 가상메소드;

public class ShipName {
	public static void search(Ship s) {
		if(s instanceof MyShip) { //Ship s의 객체 안에 MyShip가 업캐스팅 되면 
			MyShip b = (MyShip)s; // MyShip b의 객체에 Ship s의 객체를 다운 캐스팅 시켜준다. 즉 MyShip 원상복귀 
			System.out.println("Myship name : "+b.Name()); //Myship name : 해적선
		}else if(s instanceof YourShip){ //Ship s의 객체 안에 YourShip가 업캐스팅 되면 
			YourShip b = (YourShip)s; //YourShip b의 객체에 Ship s의 객체를 다운 캐스팅 시켜준다. 즉 YourShip b 원상복귀 
			System.out.println("YourShip name : "+ b.Name()); // YourShip name : 타이타닉 호
		}
	}
}
