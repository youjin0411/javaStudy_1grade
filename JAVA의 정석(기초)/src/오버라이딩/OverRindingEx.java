package 오버라이딩;

public class OverRindingEx {
	static void paint(Shape p) {
		p.draw();
	}
	  
	public static void main(String args[]) {
		paint(new Shape());
		paint(new Line());
		paint(new Rect());
		paint(new Circle());
	}
}
