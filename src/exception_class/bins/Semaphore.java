package exception_class.bins;

import exception_class.model.entities.ThreadSemaphore;

public class Semaphore {

	public static void main(String[] args) {
		ThreadSemaphore tSemaphore = new ThreadSemaphore();
		
		for(int i=1; i<10; i++) {
			System.out.println(tSemaphore.getCollor());
			tSemaphore.waitingCollorChange();
		}
		tSemaphore.stopSemaphore();
	}

}
