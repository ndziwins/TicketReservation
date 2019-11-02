package airTicketReservation;

import java.util.ArrayList;

public class User {

	private String name;
	private String surname;
	private int userID;
	private static int MAXID = 1;
	private ArrayList<Ticket> tickets = new ArrayList<Ticket>();
	public static ArrayList<User> users = new ArrayList<User>();

	
	public User(String name, String surname) {
		this.name= name;
		this.surname = surname;
		this.userID = MAXID++;
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
		System.out.println("U¿ytkownik " + this.getName() + " ma w systemie id: " + this.getID());
	}

}
