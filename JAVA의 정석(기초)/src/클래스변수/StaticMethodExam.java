package 클래스변수;

public class StaticMethodExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student kim = new Student();
		Student jang = new Student();
		Student bak = new Student();
		System.out.println("생성된 학생 객체 수는 "+Student.getCount()+"입니다.");
	}

}
