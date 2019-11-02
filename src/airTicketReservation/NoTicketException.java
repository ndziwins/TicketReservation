package airTicketReservation;

public class NoTicketException extends Exception {
	
	public NoTicketException(String info){
		super(info);
		System.out.println(info);
}
}
