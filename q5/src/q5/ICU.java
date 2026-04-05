package q5;

public class ICU extends Patient {

	ICU(int id, String name) {
        super(id, name, 5000); 
    }

    @Override
    double calculateBill(int days) {
        double totalBase = baseCharge * days;
        double serviceTax = totalBase * 0.12; 
        return totalBase + serviceTax;
    }
}
