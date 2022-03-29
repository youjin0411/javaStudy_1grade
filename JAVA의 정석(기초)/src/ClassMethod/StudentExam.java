package ClassMethod;

public class StudentExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studnet kim = new Studnet("김유진");
		//kim.grade = 2;
		kim.setGrade(2);
	 	Studnet jang = new Studnet("장원영",3);
		//kim.print();
		//jang.print();
	 	System.out.println("학생의 이름은 "+kim.getName()+"이고 , "+kim.getGrade()+"학년입니다.");
	 	System.out.println("학생의 이름은 "+jang.getName()+"이고, "+jang.getGrade()+"학년입니다.");
	}

}
