package q12;

public class Student {

	int id,age,marks;
    String name;
    
	Student(int id, String name, int age, int marks) throws InvalidAgeException, InvalidMarksException {
        if (age < 17) {
            throw new InvalidAgeException("Student age must be 17 or above. Provided: " + age);
        }
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException("Marks must be between 0 and 100. Provided: " + marks);
        }
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
}