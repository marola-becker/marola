package exception_class.model.entities;

public class ThreadSemaphore implements Runnable {
	
	private CollorSemaphore collor;
	private Boolean stop = false;
	private Boolean collorChanged = false;
	
	public ThreadSemaphore() {
		this.collor = CollorSemaphore.RED;
		Thread th1 = new Thread(this);
		th1.start();
	}

	@Override
	public void run() {
		while(!stop) {
			try {
				Thread.sleep(this.collor.getTimeWait());
				collorChange();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
	private synchronized void collorChange() {
		switch(this.collor) {
			case RED: this.collor = CollorSemaphore.GREEN; break;
			case GREEN: this.collor = CollorSemaphore.YELLOW; break;
			case YELLOW: this.collor = CollorSemaphore.RED; break;
			default: break;
		}
		this.collorChanged = true;
		notify();
	}
	
	public synchronized void waitingCollorChange() {
		while(!this.collorChanged) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.collorChanged = false;
	}
	
	public synchronized void stopSemaphore() {
		this.stop = true;
	}
	
	public CollorSemaphore getCollor() { return this.collor; }
}
