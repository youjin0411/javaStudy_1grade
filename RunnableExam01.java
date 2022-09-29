package 예외처리중간고사;

class Top2 implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i < 50; i++){
            System.out.print(i+"\t");
        }
    }
}

public class RunnableExam01 {
    public static void main(String[] args) {
        System.out.println("프로그램 시작");
        Thread th = new Thread(new Top2());
        th.start();
        System.out.println("프로그램 종료");
    }
}
