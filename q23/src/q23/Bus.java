package q23;

public class Bus extends Transport {
	Bus(String route, double baseFare, int availableSeats) {
        super(route, baseFare, availableSeats);
    }

    @Override
    double calculateFare(int distance) {
        return baseFare * distance;
    }
}
