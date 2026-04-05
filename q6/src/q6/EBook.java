package q6;

public class EBook extends LibraryItem {

	EBook(int id, String title) {
        super(id, title);
    }

    @Override
    double calculateFine(int daysLate) {
        return daysLate * 2; // 2 per day
    }
}
