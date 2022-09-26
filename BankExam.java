package thread;

class Bank{
    private int money = 10000; //계좌 초기 금액
    public int getMoney() {
        return this.money; //private 이므로 같은 클래스 내에서만 접근이 가능하다. 그래서 getMoney()메서드를 통해 money에 접근 가능
    } //money 값을 리턴
    public void setMoney(int money) {
        this.money = money;
    } //money 값을 세팅
    public void saveMoney(int save){ //입금
        int m = this.getMoney();
        try {
            Thread.sleep(500); //0.5초간 정지 후 실행
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        this.setMoney(m + save); //m은 기존에 있던 금액 + save 세로 입금한 금액  => 기존 예금액 + 지금 입금액
    } //saveMoney 종료
    public void minusMoney(int minus){
        int m = this.getMoney();
        try {
            Thread.sleep(500);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        this.setMoney(m - minus); //기존 예금액 - 출금액
    } //minusMoney 닫음
} //Bank 닫음

class Family1 extends Thread{  //Thread  상속받아서 구현
    public void run(){ //Thread가 해야 할 작업을 구현
        //synchronized (BankExam.mybank){ //synchronized 동기화를 시켜주라, 다른 녀석들이 원금에 손대지 못하도록 동기화 해줌
            BankExam.mybank.saveMoney(5000); //원금에 5000원을 더해라
        //}
        System.out.println("saveMoney(5000): " + BankExam.mybank.getMoney()); //원금 + 5000원
    } //run 닫음
}; //Family1 닫음

class Family2 extends Thread{  //Thread  상속받아서 구현
    public void run(){ //Thread가 해야 할 작업을 구현
        //synchronized (BankExam.mybank){ //synchronized 동기화
            BankExam.mybank.minusMoney(2000); //원금 - 2000
        //}
        System.out.println("minusMoney(2000): " + BankExam.mybank.getMoney());
    } //run 닫음
}; //Family2 닫음

public class BankExam {
    public static Bank mybank = new Bank();

    public static void main(String[] args) {
        System.out.println("원금 : "+mybank.getMoney()); //원금은 10000
        Family1 f1 = new Family1(); //스레드
        Family2 f2 = new Family2(); //스레드
        f1.start(); //f1 스레드 시작
        try{
            Thread.sleep(200); //0.2초 있다가 f2가 실행이 된다.
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        f2.start();
    }
}
