package q6;

public class Journal extends LibraryItem {

	Journal(int id, String title) {
        super(id, title);
    }

    @Override
    double calculateFine(int daysLate) {
        return (daysLate * 10) + 50; // 10 per day + 50 fixed charge
    }
}
