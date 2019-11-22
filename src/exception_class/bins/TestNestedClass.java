package exception_class.bins;

import exception_class.model.entities.NestedExternalClass;
import exception_class.model.entities.NestedExternalClass.InternalClass;

public class TestNestedClass {
	/* classes aninhadas */
	
	public static void main(String[] args) {
		
		NestedExternalClass nec = new NestedExternalClass();
		
		InternalClass ic = nec.new InternalClass(); 
		
		ic.printText();		

	}

}
