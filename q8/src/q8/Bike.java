package q8;

public class Bike extends Vehicle {

	Bike(String vehicleNumber, double vehiclePrice) {
        super(vehicleNumber, vehiclePrice);
    }

    @Override
    double calculateInsurance() {
        return vehiclePrice * 0.03;
    }
}
