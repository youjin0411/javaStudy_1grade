//369게임 프로그램 
public class FlowExam {
	public static void main(String[] args) {
		
		for(int i = 1; i <= 100; i++) {
			System.out.print("i="+i);
			
			int temp = i;  //i의 값을 다른 변수에 저장 => do _ while문 때문에 while문 조건에서 for문을 나가 i를 사용할 수 없어서 
			
			do {  
				if(temp % 10 %3 == 0 && temp % 10 != 0) {  
					System.out.print("짝");
					}
				}while((temp/=10) != 0); //10을 나누었을 시에 몫이 0이면 빠져나오고 몫이 0이 아니면 다시 반복한다. 
			// >> 만약 temp가 99일 시 짝이  먼저 출력되고 while조건식에서 99 / 10 => 9 
			//그러므로 다시 do로 가서 temp에 9를 넣고 한 번 더 하고 while문에서 결과값이 0이 되므로 멈춘다. 
			
			System.out.println();
			
			}
		}
	}

