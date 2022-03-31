package instanceof¿¬»êÀÚ;

public class instanceOfExam {
	static void print(Person p) {
		if(p instanceof Person)
			System.out.print("Person ");
		if(p instanceof Student)
			System.out.print("Student ");
		if(p instanceof Researcher)
			System.out.print("Researcher ");
		if(p instanceof Professor)
			System.out.print("Professor ");
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("new Student() -> \t");
		print(new Student());
		System.out.println("new Researcher() -> \t");
		print(new Researcher());
		System.out.println("new Professor() -> \t");
		print(new Professor());
	}

}
