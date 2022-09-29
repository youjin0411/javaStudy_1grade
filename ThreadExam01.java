package 예외처리중간고사;

class Top extends Thread{
    public void run(){
        for(int i = 0; i < 50; i++){
            System.out.print(i + "\t");
        }
    }
}

public class ThreadExam01 {
    public static void main(String[] args) {
        System.out.println("프로그램 시작");
        Top t = new Top();
        t.start();
        System.out.println("프로그램 종료");
    }
}
