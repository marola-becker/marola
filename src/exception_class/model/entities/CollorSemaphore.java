package exception_class.model.entities;

public enum CollorSemaphore {

	GREEN(3000), YELLOW(1000), RED(2500);
	
	private int timeWait;
	
	CollorSemaphore(int timeWait) {
		this.timeWait = timeWait;
	}
	
	public int getTimeWait() { return this.timeWait; }
	
}
