package exception_class.bins;

import exception_class.model.entities.MyRunnableThread;

public class TestThread {

	@SuppressWarnings("null")
	public static void TestRunnableThreads() {
		/*
		MyThread myThread = new MyThread("Thread #1 - ", 2000);
		MyThread myThread2 = new MyThread("Thread #2 ----- ", 1000);
		MyThread myThread3 = new MyThread("Thread #3 ----------", 500);
				*/
		MyRunnableThread mrt1 = new MyRunnableThread("Runnable #1 ** ", 500);
		MyRunnableThread mrt2 = new MyRunnableThread("Runnable #2 **** ", 500);
		MyRunnableThread mrt3 = new MyRunnableThread("Runnable #3 ****** ", 500);
		Thread th1 = new Thread(mrt1);
		Thread th2 = new Thread(mrt2);
		Thread th3 = new Thread(mrt3);
		
		th1.setPriority(Thread.MIN_PRIORITY);
		th2.setPriority(Thread.MAX_PRIORITY);
		th3.setPriority(Thread.NORM_PRIORITY);
		
		th1.start();
		th2.start();
		th3.start();
		// em Java join é um semáforo para threads com temporizador.
		try {
			th1.join();
			th2.join();
			th3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("***** Finish ******");

	}

}
