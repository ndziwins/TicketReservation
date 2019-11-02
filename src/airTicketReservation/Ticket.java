package airTicketReservation;

public class Ticket {
	private int TicketID;
	private User user;
	private Flight flight;
	private static int MAXID = 0;

	public Ticket(User user, Flight flight) {
		this.TicketID = MAXID++;
		this.user = user;
		this.flight = flight;
	}

	public int getTicketID() {
		return TicketID;
	}

	public User getUser() {
		return user;
	}

	public Flight getFlight() {
		return flight;
	}
}
