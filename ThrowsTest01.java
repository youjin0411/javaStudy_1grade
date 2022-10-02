import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsTest01 {
    public static void ThrowMethod() throws FileNotFoundException{
        FileReader fr = new FileReader("data.txt");
    }

    public static void main(String[] args) {
        try{
            ThrowMethod();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
