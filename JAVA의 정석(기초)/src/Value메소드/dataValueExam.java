package Value메소드;
import java.util.*;
public class dataValueExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String line;
		String tmpStr = "hong 용산구 10.5 20.5";
		StringTokenizer parse = new StringTokenizer(tmpStr);
		String name;
		String address;
		double math;
		double english;
		double total;
		double avg;
		name = parse.nextToken();
		address = parse.nextToken();
		math=Double.valueOf(parse.nextToken()).doubleValue();//parse-> Double (wrapper)-> double(기본 타입)
		english = Double.valueOf(parse.nextToken()).doubleValue();
		total = math + english;
		avg = total / 2.0;
		System.out.println(name +"\t"+address+"\t"+math+"\t"+english+"\t"+total+"\t"+avg);
	}

}
