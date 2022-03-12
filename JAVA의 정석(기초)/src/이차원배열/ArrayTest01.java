package 이차원배열;
// 유진, 민아, 지희의 자바 파이썬 c언어 점수를 2차원 배열에 저장하여 이쁘게 출력하는 프로그램
/*
 *  과목		자바|		파이썬|	c언어|	총점|		평균
 *  1조			
 *  2조
 *  3조
 */
import java.util.Scanner;
public class ArrayTest01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int number[][]=new int[3][5];
		int sum = 0;
		for(int i =0; i < number.length; i++) {
			System.out.println("자바. 파이썬 . c언어 점수를 입력하시오. > ");
			for(int j = 0; j < number[i].length-2; j++) {
				number[i][j]=scan.nextInt();
			}
			System.out.println();
		}
		System.out.println("과목\t자바|\t파이썬|\tc언어");
		for(int i =0; i < number.length; i++) {
			System.out.print(i+1+"조");
			for(int j = 0; j < number[i].length-2; j++) {
				System.out.print("\t"+number[i][j]);
			}

			System.out.println();
	}	

	}
}
