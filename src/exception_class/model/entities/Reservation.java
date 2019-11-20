package exception_class.model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import exception_class.model.exceptions.DomainException;

public class Reservation {
	private Integer roomNumber;
	private Date checkIn;
	private Date checkoOut;

	private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkoOut = checkOut;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public Date getCheckoOut() {
		return checkoOut;
	}

	public long duration() {
		long diff = this.checkoOut.getTime() - this.checkIn.getTime();
		// a classe TimeUnit possui métodos de tratamentos para dias, horas, minutos...
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);

	}

	public void updateDates(Date checkIn, Date checkOut) throws DomainException{
		
		Date now = new Date();
		if(checkIn.before(now) || (checkOut.before(now))) {
			throw new DomainException("As datas de reserva deverão ser futuras!");
		} 
		if (!checkOut.after(checkIn)) {				
			throw new DomainException("Erro de reserva:" +
					"A data do check-out não pode ser inferior a do check-in!");
		} 
		this.checkIn = checkIn;
		this.checkoOut = checkOut;		
	}

	@Override
	public String toString() {
		return "Reservation [roomNumber=" + roomNumber + ", " + "checkIn=" + simpleDateFormat.format(checkIn)
				+ ", checkoOut=" + simpleDateFormat.format(checkoOut) + ", " + Long.toString(duration()) + " nights.]";
	}

}
