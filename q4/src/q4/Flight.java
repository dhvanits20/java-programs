package q4;

public class Flight extends Transport {

	Flight(String route, double distance) {
        super(route, distance);
    }

    @Override
    double calculateFare() {
        double baseFare = distance * 10; // 10 per km
        return baseFare + (baseFare * 0.18); // + 18% tax
    }
}
