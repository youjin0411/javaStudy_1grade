package 인터페이스;

public class SoundExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sound tv = new TV();
		Sound radio = new Radio();
		radio.SoundDown(5);
		radio.SoundUp(5);
	}

}
