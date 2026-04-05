package q8;

public class Car extends Vehicle {

	Car(String vehicleNumber, double vehiclePrice) {
        super(vehicleNumber, vehiclePrice);
    }

    @Override
    double calculateInsurance() {
        return vehiclePrice * 0.05;
    }
}
