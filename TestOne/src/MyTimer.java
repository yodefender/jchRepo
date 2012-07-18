import java.util.Timer;


public class MyTimer extends Timer{
	
	private int counter = 0;

	public int getCounter() {
		return counter;
	}

	public void addCounter() {
		this.counter++;
	}

}
