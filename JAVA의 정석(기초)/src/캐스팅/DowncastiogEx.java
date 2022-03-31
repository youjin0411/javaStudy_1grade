package 캐스팅;

public class DowncastiogEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p= new Student("이재문"); //업캐스팅 (부모 클래스 = 자식 클래스)
		Student s;
		
		s=(Student)p; //다운 캐스팅 
		System.out.println(s.name);
	}

}
