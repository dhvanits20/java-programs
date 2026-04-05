package q21;

public class Faculty extends Person implements Payable {
	double basicSalary;
    double bonus;

    Faculty(int id, String name, double basicSalary, double bonus) throws InvalidAmountException {
        super(id, name);
        if (basicSalary < 0) {
            throw new InvalidAmountException("Basic salary cannot be negative.");
        }
        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }

    @Override
    void displayDetails() {
        System.out.println("Faculty ID: " + id + " | Name: " + name);
    }

    @Override
    public double calculatePayment() {
        return basicSalary + bonus;
    }
}
