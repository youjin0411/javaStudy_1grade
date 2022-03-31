package 캐스팅;

public class UpcastionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p;
		Student s = new Student("이재문");
		p = s; //부모 클래스에 자식 클래스를 업캐스팅 받는 것 
		
		System.out.println(p.name);
	}

}
