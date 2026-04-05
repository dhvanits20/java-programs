package q32;

public class Month {
	private int monthNumber;
    private final String[] monthNames = {
        "Unknown", "January", "February", "March", "April", "May", "June", 
        "July", "August", "September", "October", "November", "December"
    };

    public Month() {
        this.monthNumber = 1;
    }

    public Month(int monthNumber) {
        setMonthNumber(monthNumber);
    }

    public Month(String monthName) {
        boolean found = false;
        for (int i = 1; i <= 12; i++) {
            if (monthNames[i].equalsIgnoreCase(monthName)) {
                this.monthNumber = i;
                found = true;
                break;
            }
        }
        if (!found) {
            this.monthNumber = 1;
        }
    }

    public void setMonthNumber(int monthNumber) {
        if (monthNumber < 1 || monthNumber > 12) {
            this.monthNumber = 1;
        } else {
            this.monthNumber = monthNumber;
        }
    }

    public int getMonthNumber() {
        return monthNumber;
    }

    public String getMonthName() {
        return monthNames[monthNumber];
    }

    @Override
    public String toString() {
        return getMonthName();
    }

    public boolean greaterThan(Month m) {
        return this.monthNumber > m.monthNumber;
    }

    public boolean lessThan(Month m) {
        return this.monthNumber < m.monthNumber;
    }
}
