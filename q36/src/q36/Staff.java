package q36;

public class Staff {
	protected String code;
    protected String name;

    public Staff(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public void displayStaffInfo() {
        System.out.print("Code: " + code + " | Name: " + name);
    }
}
