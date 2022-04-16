package SuperTest;

class EngHello extends Greeting{
	public String name = "Mr.hee";
	public int age = 18;
	public void sayHello() {
		System.out.println(age + "살의 "+name+" Nice to meet you");
	}
	public void test() {
		System.out.print(super.age + "살의 "+ super.name);
		super.sayHello();
	}
	public static void main(String args[]) {
		EngHello eng = new EngHello();
		eng.sayHello();
		eng.test();
	}
}
