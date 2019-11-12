package airTicketReservation;
import java.time.LocalDateTime;

public class TestATR {
	public static void main(String[] args) {

		ReservationSystem rs = new ReservationSystem();
		
		Airport war = new Airport ("WAR", "Warsaw", "Lotniskowa 1, Warsaw");
		Airport ber = new Airport ("BER", "Berlin", "Flughafen 2, Berlin");
		Airport mos = new Airport ("MOS", "Moscow", "Aeroportna 3, Moscow");
		Airport sar = new Airport ("SAR", "Sarnaki", "Podlaska 4, Sarnaki");
		
		ReservationSystem.airports.add(war);
		ReservationSystem.airports.add(ber);
		ReservationSystem.airports.add(mos);
		ReservationSystem.airports.add(sar);
		
		Airplane B747 = new Airplane ("Boeing747", 220);
		Airplane B787 = new Airplane ("Boeing787", 330);

		ReservationSystem.airplanes.add(B747);
		ReservationSystem.airplanes.add(B787);
		
		User user1 = new User("Adam", "Kowalski");
		User user2 = new User("Jan", "Nowak");

		ReservationSystem.users.add(user1);
		ReservationSystem.users.add(user2);

		Route warBer = new Route (war, ber, LocalDateTime.of(2019, 11, 8, 15, 00), LocalDateTime.of(2019, 11, 8, 17, 30), B747, 150.00);
		Route warMos = new Route (war, ber, LocalDateTime.of(2019, 11, 8, 15, 00), LocalDateTime.of(2019, 11, 8, 17, 30), B747, 150.00);
		Route warSar = new Route (war, ber, LocalDateTime.of(2019, 11, 8, 15, 00), LocalDateTime.of(2019, 11, 8, 17, 30), B747, 150.00);
		Route berMos = new Route (war, ber, LocalDateTime.of(2019, 11, 8, 15, 00), LocalDateTime.of(2019, 11, 8, 17, 30), B747, 150.00);

		System.out.println(sar.getInformation());
		user1.printUser();

		warBer.printRouteInformation();
		warBer.reserve(user1);
		warBer.printRouteInformation();
	}
}
