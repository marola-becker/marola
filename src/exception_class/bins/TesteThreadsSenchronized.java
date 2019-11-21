package exception_class.bins;

import exception_class.model.entities.MyThreadSum;

public class TesteThreadsSenchronized {

	public static void testCalculationSynchronized(String[] args) {
		
		int[] nums = {1,2,3};
		MyThreadSum th1 = new MyThreadSum("thr#1", nums);
		MyThreadSum th2 = new MyThreadSum("thr#2", nums);
		MyThreadSum th3 = new MyThreadSum("thr#3", nums);

	}

}
