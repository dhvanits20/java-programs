package q21;

public class Student extends Person implements Payable {
	double courseFee;
    double scholarship;

    Student(int id, String name, double courseFee, double scholarship) throws InvalidAmountException {
        super(id, name);
        if (courseFee < 0) {
            throw new InvalidAmountException("Course fee cannot be negative.");
        }
        this.courseFee = courseFee;
        this.scholarship = scholarship;
    }

    @Override
    void displayDetails() {
        System.out.println("Student ID: " + id + " | Name: " + name);
    }

    @Override
    public double calculatePayment() {
        return courseFee - scholarship;
    }

}
