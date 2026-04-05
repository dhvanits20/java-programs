package q9;

public class Employee {

	int id;
    String name;
    int rating;

    Employee(int id, String name, int rating) {
        this.id = id;
        this.name = name;
        this.rating = rating;
    }
    double calculateBonus(double baseSalary) {
        if (rating >= 4) {
            return baseSalary * 0.20;
        } else if (rating == 3) {
            return baseSalary * 0.10;
        } else {
            return 0;
        }
    }
}