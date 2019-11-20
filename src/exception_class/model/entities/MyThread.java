package exception_class.model.entities;

public class MyThread extends Thread {
	private String threadName;
	private int timeSleep;
	
	public MyThread(String nameThread, int timeSleep) {
		this.threadName = nameThread;
		this.timeSleep = timeSleep;
		start();
	}
	
	public String getMyThreadName() { return this.threadName; }
	@Override
	public void run() {
		try {
			for (int i=0; i<6-1; i++) {
				System.out.println(getMyThreadName() + " -> " + i);
				sleep(this.timeSleep);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Finish - " + getMyThreadName());
	}
}
