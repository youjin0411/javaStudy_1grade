package StudentbyNotebook;
/*
 * 정적요소 : 이름 , 용돈, 
 * 동적요소 : 생성자메서드, 학생이 공책을 사다, 출력 
 */
public class Student {
	String name;
	int pinmoney; //용돈
	
	public Student(String name, int pinmoney) {
		this.name = name;
		this.pinmoney = pinmoney;
	}
	
	public void getNotebook(Notebook item,int amount) {
		if(pinmoney >= item.price*item.take ) {
			pinmoney -= item.price*item.take;
			item.sale(amount); //Notebook클래스의 sale을 호출한다.
		}else {
			System.out.println("구입 불가");
		}
	}
	
	public void PrintStudent() {
		System.out.println("====="+this.name+"학생의 남은 돈 =====");
		System.out.println("남은 금액 : "+ this.pinmoney);
	}
	
}
