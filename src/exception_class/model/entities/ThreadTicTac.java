package exception_class.model.entities;

public class ThreadTicTac implements Runnable {
	
	public TicTac tt;
	public Thread th;
	final int NUM = 5;

	public ThreadTicTac(String name, TicTac tt) {
		this.tt = tt;
		th = new Thread(this, name);
		th.start();
	}
	
	@Override
	public void run() {
		if(th.getName().equalsIgnoreCase("tic")) {
			for(int i=0; i<NUM; i++) {
				tt.tic(true);
			}
			tt.tic(false);
		} else {
			for(int i=0; i<NUM; i++) {
				tt.tac(true);
			}
			tt.tac(false);
		}
		
	}

}
