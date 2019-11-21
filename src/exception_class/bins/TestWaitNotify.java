package exception_class.bins;

import exception_class.model.entities.ThreadTicTac;
import exception_class.model.entities.TicTac;

public class TestWaitNotify {

	public static void main(String[] args) {
		TicTac tt = new TicTac();
		ThreadTicTac tic = new ThreadTicTac("tic", tt);
		ThreadTicTac tac = new ThreadTicTac("tac", tt);
		
		try {
			tic.th.join();
			tac.th.join();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
