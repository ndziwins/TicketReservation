package airTicketReservation;

public class Flight {
	private int seats;
	private String route;
	private String date;
	private double price;
	private int flightID;
	private static int MAXID = 0;
	private int nbTickets = 0;

	public Flight(int seats, String route, String date, double price) {
		this.seats = seats;
		this.route = route;
		this.date = date;
		this.price = price;
		this.flightID = MAXID++;

	}


	public void reserve(User user) { if (nbTickets < seats) { Ticket ticket = new
	  Ticket(user, this); user.addTicket(ticket); nbTickets++;
	  System.out.println("Zarezerwowano bilet dla " + user.getName()); } else {
	  System.out.
	  println("Przepraszamy, rezerwacja nieudana. Wykupiono juz wszystkie bilety.");
	  } 
	}

	public String getRoute() {
		return route;
	}

	public String getDate() {
		return date;
	}

	public double getPrice() {
		return price;
	}

	public int getFlightID() {
		return flightID;
	}

	public int getFreeSeats() {
		return seats - nbTickets;
	}

	public void printFlightInformation() {
		System.out.println("Ten lot jest na po¹czeniu: " + this.getRoute() + " o dacie " + this.getDate()
				+ " i ma jeszcze " + this.getFreeSeats() + " wolnych miejsc.");
	}
}
