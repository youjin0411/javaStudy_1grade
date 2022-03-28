package 오버라이딩;

class Shape {
	public Shape next;
	
	public Shape() {
		next = null;
	}
	public void draw() {
		System.out.println("shape");
	}
}
