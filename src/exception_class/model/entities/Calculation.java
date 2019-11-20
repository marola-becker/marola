package exception_class.model.entities;

public class Calculation {
	
	private int sums;
	// ao usar Synchronized no metodo, garante que somente uma thread passara por vez neste codigo
	public synchronized int sumArray(int[] array) {
		sums = 0;
		for(int i=0; i<(array.length -1); i++) {
			sums += array[i];
			System.out.println(" executiong..." +Thread.currentThread().getName() + "\n" + 
							   " Summing - " + array[i] + ", with total of " + sums);
			// adiciona um sleep para ocorrer cruzamento de threads diferentes
			try {
				Thread.sleep(150);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return sums;
	}

}
