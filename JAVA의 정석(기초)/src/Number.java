//숫자를 입력받아 그 수와 뒤집은 수의 합 구하기 ex)입력한 수 : 18, 뒤집힌 수 : 81 =>두 수의 합 : 18 + 81 = 99
import java.util.Scanner;
public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int number[]= new int[2];
		int cnumber[]= new int[2];
		int sum;
		System.out.print("숫자를 입력하시오 >>  ");
			
			number[0]=scan.nextInt();
			number[1]=scan.nextInt();
		
		cnumber[0] = number[1]*10;
		cnumber[1] = number[0];
		
		sum = (number[0]*10)+(number[1])+(cnumber[0])+(cnumber[1]);
		
		System.out.println(sum);
		

	}

}
