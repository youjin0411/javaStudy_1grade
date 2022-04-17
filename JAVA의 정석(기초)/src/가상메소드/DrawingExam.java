package 가상메소드;

public class DrawingExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();
		c.draw(); //원 그리기
//		c.painting(); //색칠하기 
//		Shape s = new Shape();
//		s.draw();
//		s.paintiin(); => 오류 발생 : 상속 관계 시 수퍼클래스는 서브클래스의 메소드 사용 불가
		Shape s = new Circle(); // 업캐스팅 (수퍼클래스에 서브클래스 참조)
		s.draw();
		//s.painting => 오류발생 : 업캐스팅 시 수퍼클래스는 서브클래스의 오버로이딩(재정의)된 메서드는 사용할 수 있지만 오버라이딩 되지 않은 메서드는 사용 불가
		}

}
