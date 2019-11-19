package exception_class;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class ExceptionModels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mark("Start program"));
		// methodTest0();
		uploadFile("/home/marola/eclipse-workspace/exception_class/_arquivoteste.txt");
		
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
		} finally {
			// ocorrendo o erro ou não passa nesta parte do bloco
			System.out.println(mark("end - methodTest1"));
		}
		scanner.close();	
	}
	
	private static void uploadFile(String pathFile) {
		File file = new File(pathFile);
		Scanner scanner = null;
		try {
			scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
		} catch (FileNotFoundException e) {
			System.out.println("Erro ao abrir o arquivo: " + e.getMessage());
		} finally {
			if (scanner != null) {
				scanner.close();
				System.out.println("Arquivo fechado");
			}
		}
	}
	
	private static String mark(String text) {
		String a = "********	";
		return a + text + a;
	}

}