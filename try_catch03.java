package 예외처리중간고사;

import org.omg.IOP.ExceptionDetailMessage;

public class try_catch03 {
    public static void main(String[] args) {
        String[] num = new String[3];
        try {
            for(int i = 0; i <= num.length; i++ ) {
                System.out.println(num[i]);
            }
        }catch(ArrayIndexOutOfBoundsException ae){
            System.out.println("배열에서 예외 발생");
        }catch (Exception e){
            System.out.println("예외 발생");
        }finally{
            System.out.println("무조건 실행되는 문장");
        }
    }
}
