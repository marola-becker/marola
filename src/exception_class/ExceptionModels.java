package exception_class;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class ExceptionModels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mark("Start program"));
		methodTest0();
		
		System.out.println(mark("End program"));

	}
	
	private static void methodTest0() {
		System.out.println(mark("start - methodTest0"));
		methodTest1();
		System.out.println(mark("end - methodTest0"));
	}
	
	private static void methodTest1() {		
		System.out.println(mark("start - methodTest1"));
		Scanner scanner = new Scanner(System.in);
		try {
			String[] vetor = scanner.nextLine().split(" ");
			int position = scanner.nextInt();
			System.out.println(vetor[position]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// acesso a índice fora do limite existente no vetor
			System.out.println("Erro de índice");
			e.printStackTrace();
			scanner.next();
		} catch(InputMismatchException e) {
			// exceção para tipo (input) inválido
			System.out.println("Valor digitado inválido");
			// printStackTrace imprime a pilha de chamados de métodos
			e.printStackTrace();
			scanner.next();
		}
		System.out.println(mark("end - methodTest1"));
		scanner.close();	
	}
	
	private static String mark(String text) {
		String a = "********	";
		return a + text + a;
	}

}