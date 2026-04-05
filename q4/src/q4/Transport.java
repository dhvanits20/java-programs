package q4;

public abstract class Transport {

	String route;
    double distance;

    Transport(String route, double distance) {
        this.route = route;
        this.distance = distance;
    }

    abstract double calculateFare();
}
