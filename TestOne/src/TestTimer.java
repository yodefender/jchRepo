import java.util.TimerTask;

public class TestTimer extends TimerTask {

	MyTimer timer;

	
	public TestTimer(int seconds) {
		
		timer = new MyTimer();
		timer.schedule(this, seconds, seconds);
		
	}

	public static void main(String args[]) {
		System.out.println("Start.");
		new TestTimer(1000);
		System.out.println("Finish.");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		timer.addCounter();
		System.out.println("Here I am");
		if(timer.getCounter()%4 == 0){
			System.out.println("Every fifth");
		}
	}

}
