package q6;

public class PrintedBook extends LibraryItem {

	PrintedBook(int id, String title) {
        super(id, title);
    }

    @Override
    double calculateFine(int daysLate) {
        return daysLate * 5; // 5 per day
    }
}
