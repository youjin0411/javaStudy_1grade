package 캐스팅;

public class CastiogExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car mycar,yourcar;
		Bus mybus, yourbus;
		Truck mytruck,yourturck;
		mycar = new Bus(); //업캐스팅
		mybus = new Bus(); //객체 생성 
		mytruck = new Truck(); //객체 생성
		
		System.out.println("["+mycar.print()+"]");
		System.out.println("["+mybus.print()+"]");
		System.out.println("["+mytruck.print()+"]");
		yourcar = mybus;
		yourbus = (Bus)yourcar; //다운 캐스팅
		System.out.println("["+yourbus.print()+"]");
		yourcar = mytruck;
		yourturck = (Truck)yourcar; //다운 캐스팅 
		System.out.println("["+yourturck.print()+"]");
	}

}
