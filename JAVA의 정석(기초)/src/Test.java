import java.util.Scanner;
public class Test {
//두 수를 입력받아 100이하의 자연수 중 두 수의 공배수를 구하는 프로그램 작성 	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Scanner scan = new Scanner(System.in);
		System.out.println("num1을 입력받으시오 : ");
		int num1= scan.nextInt();
		System.out.println("num2을 입력받으시오 : ");
		int num2 = scan.nextInt();
		
		for(int i =1; i<=100; i++) {
			if((i % num1 == 0)&&(i % num2 == 0)) { 
				/*
				 * 입력한 수 : 24 , 12
				 * for(증감)
				 * if((1 % 24 ==0) && (1%12==0) ) => false 
				 * if(48 % 24 ==0) && (48 % 12 ==0) => true 두 수의 최소 공배수 
				 * if(96 % 24 ==0) && (96 % 12 ==0) => true 두 수의 공배수 
				 */
				System.out.println(i);
				continue;
			}
		}
		}

	}


