import java.util.Scanner;
//1~3팀의 국어 영어 수학의 점수를 출력받으시오. (단,0~100 이하의 점수만 입력가능)

public class Score_print {
	public static void main(String[] args) {

		int score[][]=new int[3][3];
		inputScore(score);
		PrintResult(score);
	}
		
		//각 팀의 점수 입력받기
	public static int[][] inputScore(int[][] score) {  //입력
	      Scanner scan=new Scanner(System.in);
	      
	      for(int i=0; i<score.length; i++){   //입력을 5번 받을 수 있도록 배열 길이 0,1,2,3,4 반복
	          System.out.println((i+1)+"팀의 항목별 점수 입력");
	          for(int j=0; j<score.length; j++){  
	        	  switch(j+1) {  
	        	  case 1: System.out.print("국어 입력:"); break;
	        	  case 2: System.out.print("영어 입력:"); break;
	        	  case 3: System.out.print("수학 입력:"); break;
	        	  }
	             score[i][j]=scan.nextInt();  
	             
	             while(score[i][j]>100||score[i][j]<0) {   //20초과 이거나 0미만일 시 다시 입력
	                System.out.println("다시 입력:");
	                  score[i][j]=scan.nextInt();
	             }
	           }
	      }
	      return score; //입력받은 각 조의 완성도 창의성 이해도를 main메서드에 리턴 시켜준다. 
	    }
	    
	public static void PrintResult(int[][] score) {
		System.out.println("점수를 확인해주세요");
		System.out.println("팀\t국어\t영어\t수학");

		for(int i=0; i<score.length; i++){ //조 5번 
	    	  System.out.print((i+1)+"조"+"\t");   //1-5조 출력
	         for(int j =0; j<score[i].length; j++) { //5열  
	               System.out.print(score[i][j]+"\t"); //전부 출력
	         }  
	         System.out.println(""); // 한 줄 띄우기
		}
	}
}

