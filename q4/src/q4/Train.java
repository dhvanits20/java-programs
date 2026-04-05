package q4;

public class Train extends Transport {
 
	Train(String route, double distance) {
        super(route, distance);
    }

    @Override
    double calculateFare() {
        return (distance * 3) + 50; // 3 per km + 50 reservation charge
    }
}
