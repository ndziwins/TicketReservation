package airTicketReservation;

public class Airplane {
	private String name;
	private int seats;
	
	public Airplane (String name, int seats) {
		this.name = name;
		this.seats = seats;
	}
	
	public String getName() {
		return name;
	}
	
	public int getSeats() {
		return seats;
	}
}
