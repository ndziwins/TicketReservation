package airTicketReservation;

import java.time.LocalDateTime;

public class Schedule {
    private Airport departure;
    private Airport arrival;
    private Airplane plane;
    private LocalDateTime time;

    public Schedule (Airport departure, Airport arrival, Airplane plane, LocalDateTime time) {
        this.departure = departure;
        this.arrival = arrival;
        this.plane = plane;
        this.time = time;
    }


}
