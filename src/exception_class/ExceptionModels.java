package exception_class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import exception_class.model.entities.Reservation;
import exception_class.model.exceptions.DomainException;
import exception_class.others.TestsExceptions;

public class ExceptionModels {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(TestsExceptions.mark("Start program"));
		
		Scanner scanner = new Scanner(System.in);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		try {
			System.out.println("Room number: ");
			Integer roomNumber = scanner.nextInt();
			System.out.println("Check-in date (dd/MM/yyyy):");
			Date checkIn = simpleDateFormat.parse(scanner.next());
			System.out.println("Check-out date (dd/MM/yyyy):");
			Date checkOut = simpleDateFormat.parse(scanner.next());	

			Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
			System.out.println(reservation);

			System.out.println();
			System.out.println("Enter data to update the reservation");
			System.out.println("Check-in date (dd/MM/yyyy):");
			checkIn = simpleDateFormat.parse(scanner.next());
			System.out.println("Check-out date (dd/MM/yyyy):");
			checkOut = simpleDateFormat.parse(scanner.next());
			
			reservation.updateDates(checkIn, checkOut);
			System.out.println(reservation);				
		} catch (ParseException e) {
			System.out.println("Data inválida!" + e.getMessage());
		} catch (IllegalArgumentException e) {
			System.out.println("Data com formato inválido!" + e.getMessage());
		} catch (DomainException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(TestsExceptions.mark("End program"));

	}
}