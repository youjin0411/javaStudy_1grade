package 클래스;

public class Tv {
	String color;
	boolean power;
	int chaanel;
	
	public void power() {
		power = !power; //power의 값의 true이면 false이다. 
	}
	public void chaanlUp() {
		chaanel ++;
	}
	public void chaanlDown() {
		chaanel --;
	}
}
