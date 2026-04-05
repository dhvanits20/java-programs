package q23;

public class Flight extends Transport {
	Flight(String route, double baseFare, int availableSeats) {
        super(route, baseFare, availableSeats);
    }

    @Override
    double calculateFare(int distance) {
        double fare = baseFare * distance;
        return fare + (fare * 0.18);
    }
}
