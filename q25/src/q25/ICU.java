package q25;

public class ICU extends Patient implements Insurable {
	ICU(int id, String name, double baseCharge) {
        super(id, name, baseCharge);
    }

    @Override
    double calculateBill(int days) throws InvalidStayException {
        if (days <= 0) {
            throw new InvalidStayException("Stay duration must be greater than zero.");
        }
        double totalBase = baseCharge * days;
        calculatedBill = totalBase + (totalBase * 0.12);
        return calculatedBill;
    }

    @Override
    public double calculateInsuranceCoverage() {
        return calculatedBill * 0.70;
    }
}
