package airTicketReservation;

import java.util.ArrayList;

public class ReservationSystem {
	
	ArrayList<User> users = new ArrayList<User>();
	

	public void bookFlight(Flight toPoznan, User user1) {
		try {
			toPoznan.reserve(user1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
