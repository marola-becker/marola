package exception_class.model.entities;

public class MyThreadSum implements Runnable {
	
	private String name;
	private int[] nums;
	
	private static Calculation calc = new Calculation();
	
	public MyThreadSum(String name, int[] nums) {
		this.name = name;
		this.nums = nums;
		new Thread(this, name).start();
		
	}

	@Override
	public void run() {
		System.out.println(this.name + " **** start **** ");
		int sum = calc.sumArray(this.nums);
		System.out.println("Sum result: " + sum);
		System.out.println(this.name + " **** finish ***** ");
		
	}
	
}
