package 인터페이스;

public class Radio implements Sound{
	private int SndLevel;
	public Radio() {
		SndLevel = 0;
	}
	public void SoundUp(int level) {
		SndLevel += level;
	}
	public void SoundDown(int level) {
		SndLevel -= level;
		if(SndLevel < 0) SndLevel = 0;
	}
}
