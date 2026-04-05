package q19;

public class Car extends Vehicle {
	Car(String vehicleNumber, double vehiclePrice) throws InvalidPriceException {
        super(vehicleNumber, vehiclePrice);
    }

    @Override
    double calculatePremium() {
        return vehiclePrice * 0.05;
    }
}
