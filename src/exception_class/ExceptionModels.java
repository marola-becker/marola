package exception_class;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class ExceptionModels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		try {
			String[] vetor = scanner.nextLine().split(" ");
			int position = scanner.nextInt();
			System.out.println(vetor[position]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Erro de índice");
		} catch(InputMismatchException e) {
			System.out.println("Valor digitado inválido");
		}
		System.out.println("fim");
		scanner.close();	
	}

}