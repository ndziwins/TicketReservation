package airTicketReservation;

public class TestATR {
	public static void main(String[] args) throws NoTicketException {

		ReservationSystem rs = new ReservationSystem();

		User user1 = new User("Adam", "Kowalski");
		User user2 = new User("Jan", "Nowak");

		User.users.add(user1);
		User.users.add(user2);

		Flight toPoznan = new Flight(40, "Warszawa-Poznan", "22.10.2019", 150.0);
		Flight toBerlin = new Flight(100, "Warszawa-Berlin", "22.10.2019", 350.0);
		Flight toPodlasie = new Flight(1, "Warszawa-Podlasie", "23.10.2019", 1000.0);

		toPoznan.printFlightInformation();
		toBerlin.printFlightInformation();
		toPodlasie.printFlightInformation();
		System.out.println();

		rs.bookFlight(toPoznan, user1);

		toPoznan.reserve(user2);
		toBerlin.reserve(user1);
		System.out.println();

		toPodlasie.reserve(user1);
		toPodlasie.reserve(user1);
		System.out.println();

		user1.printUser();
		user2.printUser();
		System.out.println();
		toPoznan.printFlightInformation();
		toBerlin.printFlightInformation();
		toPodlasie.printFlightInformation();

	}
}
