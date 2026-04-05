package q21;

public abstract class Person {
	int id;
    String name;

    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    abstract void displayDetails();
}
