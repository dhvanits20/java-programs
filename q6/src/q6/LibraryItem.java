package q6;

public abstract class LibraryItem {

	int id;
    String title;

    LibraryItem(int id, String title) {
        this.id = id;
        this.title = title;
    }

    abstract double calculateFine(int daysLate);

}
