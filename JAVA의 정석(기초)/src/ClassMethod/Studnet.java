package ClassMethod;

class Studnet {
	String name;
	int grade;
	
	public Studnet() {}
	
	public Studnet(String name) {
		this.name = name;
	}
	
	public Studnet(String name,int grade) {
		this(name);
		this.grade = grade;
	}
	/*
	public void print() {
		System.out.println("학생의 이름은 "+this.name+"이고, "+this.grade+"학년입니다.");
	}
	*/
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getGrade() {
		return this.grade;
	}
}
