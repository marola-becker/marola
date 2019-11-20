package exception_class.bins;

import exception_class.model.entities.MyThread;

public class TestThread {

	public static void main(String[] args) {
		
		MyThread myThread = new MyThread("Thread #1 - ", 2000);
		MyThread myThread2 = new MyThread("Thread #2 ----- ", 1000);
		MyThread myThread3 = new MyThread("Thread #3 ----------", 500);
		
	}

}
