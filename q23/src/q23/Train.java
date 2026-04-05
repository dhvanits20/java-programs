package q23;

public class Train extends Transport {
	Train(String route, double baseFare, int availableSeats) {
        super(route, baseFare, availableSeats);
    }

    @Override
    double calculateFare(int distance) {
        return (baseFare * distance) + 50;
    }
}
