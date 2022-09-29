package 예외처리중간고사;

public class ThrowsExam01 {
    public static void ThrowsT() throws ArrayIndexOutOfBoundsException{
        String[] num = new String[3];
        num[3] = "홍길동";
    }

    public static void main(String[] args) {
        ThrowsExam01 t = new ThrowsExam01();
        try {
            ThrowsT();
        }catch (ArrayIndexOutOfBoundsException ae){
            System.out.println("배열에서 예외 발생");
        }
    }
}
