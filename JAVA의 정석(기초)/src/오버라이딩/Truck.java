package 오버라이딩;

class Truck extends Car{ 
	int ton = 5;
	void speedUp() {
		velocity += 10;
		System.out.println("속도 : "+velocity+"증가");
	}
}
