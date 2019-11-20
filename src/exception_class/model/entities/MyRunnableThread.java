package exception_class.model.entities;

public class MyRunnableThread implements Runnable {

	private String nameThread;
	private int timeSleep;
	
	public MyRunnableThread(String nameThread, int timeSleep) {
		this.nameThread = nameThread;
		this.timeSleep = timeSleep;
	//	Thread thread = new Thread(this);
	//	thread.start();
	}

	public String getNameThread() { return this.nameThread; }
	
	@Override
	public void run() {
		String name = this.getNameThread();
		try {
			for(int i=0; i<=2; i++) {
				System.out.println(getNameThread() + " -> " + i);
				Thread.sleep(timeSleep);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name + " finish ");
	}
	
}
