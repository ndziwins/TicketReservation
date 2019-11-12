package airTicketReservation;

public class Ticket {
	private int TicketID;
	private User user;
	private Route route;
	private static int maxId = 0;

	public Ticket(User user, Route route) {
		this.TicketID = maxId++;
		this.user = user;
		this.route = route;
	}

	public int getTicketID() {
		return TicketID;
	}

	public User getUser() {
		return user;
	}

	public Route getRoute() {
		return route;
	}
}
