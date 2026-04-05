package q19;

public class Bike extends Vehicle {
	Bike(String vehicleNumber, double vehiclePrice) throws InvalidPriceException {
        super(vehicleNumber, vehiclePrice);
    }

    @Override
    double calculatePremium() {
        return vehiclePrice * 0.03;
    }
}
