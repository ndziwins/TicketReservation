package airTicketReservation;

import java.util.ArrayList;

public class User {

	private String name;
	private String surname;
	private int userID;
	private static int maxId = 1;
	private ArrayList<Ticket> tickets = new ArrayList<Ticket>();
	
	public User(String name, String surname) {
		this.name= name;
		this.surname = surname;
		this.userID = maxId++;
	}

	public void addTicket(Ticket ticket) {
		tickets.add(ticket);
	}

	public ArrayList<Ticket> getTickets() {
		return tickets;
	}

	public String getName() {
		return name + " " + surname;
	}

	public int getID() {
		return userID;
	}

	public void printUser() {
		System.out.println("Passenger " + this.getName() + " has id: " + this.getID());
	}

}
