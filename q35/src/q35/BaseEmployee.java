package q35;

public abstract class BaseEmployee {
	protected String name;
    protected double salary;

    public BaseEmployee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    abstract double calculateBonus();

    public void displayProfile() {
        System.out.println("Name: " + name + " | Salary: Rs. " + salary + " | Bonus: Rs. " + calculateBonus());
    }
}
