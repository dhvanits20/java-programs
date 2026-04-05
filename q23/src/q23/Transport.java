package q23;

public abstract class Transport implements Bookable {
	String route;
    double baseFare;
    int availableSeats;

    Transport(String route, double baseFare, int availableSeats) {
        this.route = route;
        this.baseFare = baseFare;
        this.availableSeats = availableSeats;
    }

    abstract double calculateFare(int distance);

    @Override
    public void bookSeat(int seats) throws SeatNotAvailableException {
        if (seats > availableSeats) {
            throw new SeatNotAvailableException("Requested " + seats + " seats, but only " + availableSeats + " available.");
        }
        availableSeats -= seats;
        System.out.println("Successfully booked " + seats + " seats.");
    }
}
