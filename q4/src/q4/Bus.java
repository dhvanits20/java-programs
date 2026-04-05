package q4;

public class Bus extends Transport{

	Bus(String route, double distance) {
        super(route, distance);
    }

    @Override
    double calculateFare() {
        return distance * 5; // 5 per km
    }
}
