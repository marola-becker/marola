package exception_class.model.entities;
/** classe EXTERNA **/
public class NestedExternalClass {

	/** atributos classe EXTERNA */
	private String name = "EXTERNAL Class";
	
	public NestedExternalClass() {}
	
	/** classe INTERNA */
	public class InternalClass{
		/** atributo classe INTERNA **/
		private String name = "INTERNAL Class";
		/** método da classe INTERNA **/
		public void printText() {
			System.out.println(name);
			/** Classes Internas possuem acesso aos atributos e métodos da classe Externa **/
			System.out.println(NestedExternalClass.this.name);
		}
		
	}
	
	/** classe INTERNA ESTATICA */
	public static class InternalOtherClass{
		private String VALOR = "CLASSE ESTÁTICA INTERNA";
		public InternalOtherClass() { }
		public String getVALOR() { return this.VALOR; }		
	}
	
	public String getName() { return this.name; }
}
