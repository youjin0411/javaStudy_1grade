package SuperTest;

class Myclass extends Grandfather{
	
	public Myclass(String str) {
		super(str);
		System.out.println("MyClass 생성자");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myclass s = new Myclass("홍길동");
	}

}
