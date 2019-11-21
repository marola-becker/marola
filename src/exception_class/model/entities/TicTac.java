package exception_class.model.entities;

public class TicTac {
	
	boolean tic;
	
	synchronized void tic(Boolean inExecution) {
		if(!inExecution) {
			tic = true;
			notify();
			return;
		}
		System.out.println("tic ");
		tic = true;
		notify();		
			try {
				while(tic) {
					wait();
				} 
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
	}
	
	synchronized void tac(Boolean inExecution) {
		if(!inExecution) {
			tic = false;
			notify();
			return;
		}
		System.out.println("tac ");
		tic = false;
		notify();		
			try {
				while(!tic) {
					wait();
				} 
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
	}

}
