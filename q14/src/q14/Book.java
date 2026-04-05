package q14;

public class Book extends LibraryItem {

	Book(int id, String title) {
        super(id, title);
    }

    @Override
    double calculateFine(int daysLate) throws InvalidDaysException {
        if (daysLate < 0) {
            throw new InvalidDaysException("Late days cannot be negative. Provided: " + daysLate);
        }
        return daysLate * 5;
    }
}

class Magazine extends LibraryItem {
    Magazine(int id, String title) {
        super(id, title);
    }

    @Override
    double calculateFine(int daysLate) throws InvalidDaysException {
        if (daysLate < 0) {
            throw new InvalidDaysException("Late days cannot be negative. Provided: " + daysLate);
        }
        return daysLate * 3;
    }
}
