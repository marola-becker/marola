package exception_class.bins;

import exception_class.model.entities.NestedExternalClass;
import exception_class.model.entities.NestedExternalClass.InternalClass;
import exception_class.model.entities.NestedExternalClass.InternalOtherClass;

public class TestNestedClass {
	/* classes aninhadas */
	
	public static void main(String[] args) {
		
		NestedExternalClass nec = new NestedExternalClass();
		
		InternalClass ic = nec.new InternalClass(); 
		
		InternalOtherClass ioc = new InternalOtherClass();
		
		System.out.println(ioc.getVALOR());
		
		ic.printText();		

	}

}
