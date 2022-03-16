//배열을 생성하여 원하는 개수만큼 넣은 후 입력한 수들 중 최댓값과 최소값을 구한 후 두 수의 최대공약수를 구하시오.
import java.util.Scanner;
public class ArrayResult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.print("배열의 크기를 입력하시오 > ");
		int arrsize = scan.nextInt();
		int number[] = new int[arrsize];
		int max = 0;
		int min = 100;
		int result = 0; 
	
		for(int i =0; i < arrsize; i++) {
			System.out.println("배열에 입력할 수를 입력하시오");
			System.out.print((i+1)+"번째 값을 입력하시오.");
			number[i] = scan.nextInt();
			
			if(number[i] > max ) {
				max = number[i];
			}
			if(number[i] < min) {
				min = number[i];
			}
		}
		System.out.println("최대값 :"+max+", 최소값 : "+min+"의 최소공약수는 ?");
			//유클리드 호제법 풀이 방식 
			do {
			    result = max % min;
			    max = min;  //max에 min을 대입함으로 출력 시 max를 출력해주어야 한다.
			    min = result;
			} while (result != 0);
		
		System.out.println("최대공약수는 "+ max +"입니다.");
	}

}
