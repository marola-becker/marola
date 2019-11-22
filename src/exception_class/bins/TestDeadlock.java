package exception_class.bins;


public class TestDeadlock {

	public static void main(String[] args) {
		
		final String RECURSO01 = "Recurso #01";
		final String RECURSO02 = "Recurso #02";
	
		Thread th1 = new Thread() {
			public void run() {
				synchronized (RECURSO01) {
					System.out.println(RECURSO01 + "*** bloqueado ****");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					synchronized(RECURSO02) {
						System.out.println("Thread #1 tentando acessar " + RECURSO02);
					}
				}
			}
		};
		
		Thread th2 = new Thread() {
			public void run() {
				synchronized (RECURSO01) {
					System.out.println(RECURSO02 + "*** bloqueado ****");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					synchronized(RECURSO01) {
						System.out.println("Thread #2 tentando acessar " + RECURSO01);
					}	
				}
			}
		};
		
		th1.start();
		th2.start();
	}

}
