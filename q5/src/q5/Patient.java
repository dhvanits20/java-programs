package q5;

public class Patient {

	int id;
    String name;
    double baseCharge; 

    Patient(int id, String name, double baseCharge) {
        this.id = id;
        this.name = name;
        this.baseCharge = baseCharge;
    }

    double calculateBill(int days) {
        return baseCharge * days;
    }
}
