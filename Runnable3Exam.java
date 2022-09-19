package thread;

class Top2 implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i < 30; i++){
            System.out.print((Thread.currentThread()).getName() + i + "\t");
        }
    }
}

public class Runnable3Exam {
    public static void main(String[] args) {
        System.out.println("프로그램 시작");
        Top2 t = new Top2();
        Thread thd1 = new Thread(t, "a"); //t라는 스레드를 생성할 텐데 그 때 a라고 이름이 지정되는 것
        Thread thd2 = new Thread(t, "b");
        thd1.setPriority(9); //우선 순위가 높은 애가 먼저 끝나게 되어있다. 
        thd1.setName("new_a");
        thd2.setName("new_b");
        System.out.println(thd1.getPriority()); //따로 지정하지 않았을 경우 우선순위 5로 자동 지정
        System.out.println(thd2.getPriority());
        thd1.start();
        thd2.start();
        System.out.println("프로그램 종료");
    }
}
