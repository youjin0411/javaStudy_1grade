package 클래스변수;
 
import java.util.Scanner; 

/*
 * static변수를 이용하여 달러와 완화를 변환 해주는 환율 계산기를 만들어보자.
 */
public class CurrencyConverter {
	private static double rate; //한국 원화에 대한 환율
	public static double toDollar(double won) {
		return won/rate; //한국 원화를 달러로 변환
	}
	public static double toKWR(double dollar) {
		return dollar * rate;  //달러를 한국 원화로 변환
	}
	public static void setRate(double r ) {
		rate = r; //환율설정 . KWR / $1
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("환율(1달러) >> ");
		double rate = scanner.nextDouble();
		CurrencyConverter.setRate(rate);
		System.out.println("백만원은 $ "+CurrencyConverter.toDollar(1000000)+"입니다.");
		System.out.println("$100는 "+CurrencyConverter.toKWR(100)+"입니다.");
		scanner.close();
	}

}
