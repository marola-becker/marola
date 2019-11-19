package exception_class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import exception_class.model.entities.Reservation;
import exception_class.others.TestsExceptions;

public class ExceptionModels {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		System.out.println(TestsExceptions.mark("Start program"));
		
		Scanner scanner = new Scanner(System.in);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Room number: ");
		Integer roomNumber = scanner.nextInt();
		System.out.println("Check-in date (dd/MM/yyyy):");
		// no método parser (converte tipos), pode ocorrer uma exceção, tipo ParseException
		Date checkIn = simpleDateFormat.parse(scanner.next());
		System.out.println("Check-out date (dd/MM/yyyy):");
		// no método parser (converte tipos), pode ocorrer uma exceção, tipo ParseException
		Date checkOut = simpleDateFormat.parse(scanner.next());	
		
		// forma desaconselhada - ruim
		if (!checkOut.after(checkIn)) {
			System.out.println(
					"Erro de reserva:" +
					"A data do check-out não pode ser inferior a do check-in!");
		} else {
			Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
			System.out.println(reservation);
			
			System.out.println();
			System.out.println("Enter data to update the reservation");
			
			System.out.println("Check-in date (dd/MM/yyyy):");
			checkIn = simpleDateFormat.parse(scanner.next());
			System.out.println("Check-out date (dd/MM/yyyy):");
			checkOut = simpleDateFormat.parse(scanner.next());
			String error = reservation.updateDates(checkIn, checkOut);
			if(error != null) {
				System.out.println(error);
			} else
				System.out.println(reservation);				
			}
		System.out.println(TestsExceptions.mark("End program"));
		}

}