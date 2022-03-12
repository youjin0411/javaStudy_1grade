import java.util.Scanner;
public class average {
//두 수의 평균 이하를 출력하는 프로그램 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int num1[] = new int[10];
		int sum =0;
		for(int i =0; i<num1.length;i++) {
			System.out.println((i+1)+"번째 숫자를 입력하시오.");
		num1[i]=scan.nextInt();
		sum += num1[i];
		}
		int avg = sum / num1.length;
		
		for(int j=1;j<=avg;j++) {
			System.out.println("평균 이하의 수 :" + j);
		}
		
	}

}
