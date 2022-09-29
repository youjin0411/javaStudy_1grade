package 예외처리중간고사;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;
public class IOExceptionExam01 {
    public static void main(String[] args) {
        InputStream sp = System.in;
        try {
            while (true){
                int i = sp.read();
                if(i == -1) break;
                System.out.print((char)i);
            }
        }catch (IOException a){
            System.out.println("입출력 오류 발생");
            a.printStackTrace();
        }

    }
}
