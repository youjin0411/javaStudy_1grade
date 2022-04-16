package SuperTest;

class Grandfather {
	private String name;
	private int age;
	public Grandfather(String name,int age) {
		this.name = name;
		this.age = age;
		System.out.println("Grandfather 생성자"+" "+this.name +" "+this.age+"살이다.");
	}
}
