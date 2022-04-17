package 가상메소드;

public class ShipMainExam {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Ship myship = new MyShip(); //Ship객체에 MyShip 업캐스팅 
			Ship yourship = new YourShip(); // Ship 객체에 YourShip 업캐스팅
			ShipName.search(myship); //Ship 객체에 myship 업캐스팅 했을 시 => Myship name : 해적선
			ShipName.search(yourship);//Ship 객체에 yourship 업캐스팅 했을 시 => YourShip name : 타이타닉 호
	}

}
