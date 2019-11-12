package airTicketReservation;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Route {
    private Airport departure;
    private Airport arrival;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    private Airplane plane;
    private double price;
    private int freeSeats;
    private int id;
    public static int maxID = 0;


    public Route (Airport departure, Airport arrival, LocalDateTime departureTime, LocalDateTime arrivalTime, Airplane plane, double price) {
        this.departure = departure;
        this.arrival = arrival;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
        this.plane = plane;
        this.price = price;
        freeSeats = plane.getSeats();
        id = maxID++;
    }

    public int getId() {
        return id;
    }

    public Airplane getPlane() {
        return plane;
    }

    public Airport getArrival() {
        return arrival;
    }

    public Airport getDeparture() {
        return departure;
    }

    public double getPrice() {
        return price;
    }

    public void reserve(User user) {
        if (freeSeats > 0) {
            Ticket ticket = new Ticket(user, this);
            this.freeSeats--;
            System.out.println("Ticket is reserved for " + user.getName());
        } else {
        System.out.println("Sorry, but there is no more free seats on this route");
    }
        System.out.println();
    }

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    public String getDepartureDate() {
        return departureTime.format(formatter);
    }

    public String getArrivalDate() {
        return arrivalTime.format(formatter);
    }

    public void printRouteInformation() {
        System.out.println("This route is from "+this.departure.getName()+" to "+this.arrival.getName()+".");
        System.out.println("Departure time is: "+this.getDepartureDate()+" and estimated arrival time is: "+this.getArrivalDate());
        System.out.println("Airplane is: "+this.plane.getName()+" with "+this.plane.getSeats()+" seats. Single ticket cost is: "+this.getPrice());
        System.out.println("There is still "+this.freeSeats+" free seats.");
        System.out.println();
    }
}
