package q1;

public class PayrollSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee[] staff = new Employee[5];
        
        staff[0] = new TeachingStaff(101, "Dr. Sharma", 50000, "Physics", 5000);
        staff[1] = new Employee(102, "Amit Patel", 25000); // Normal Employee
        staff[2] = new TeachingStaff(103, "Prof.Singh", 60000, "Computer Science", 8000);
        staff[3] = new Employee(104, "Neha Gupta", 28000); // Normal Employee
        staff[4] = new TeachingStaff(105, "Dr. Reddy ", 55000, "Mathematics", 6000);

        System.out.println("--- University Payroll Report ---");
        for (Employee e : staff) {
            System.out.println("ID: " + e.id + " | Name: " + e.name + " | Final Salary: Rs. " + e.calculateSalary());
        }
	}

}
