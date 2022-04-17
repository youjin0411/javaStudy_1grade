package 인터페이스;

public class TV implements Sound{
	private int SndLevel;
	public TV() {
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
