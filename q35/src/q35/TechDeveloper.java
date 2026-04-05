package q35;

public class TechDeveloper extends BaseEmployee {
	public TechDeveloper(String name, double salary) {
        super(name, salary);
    }

    @Override
    double calculateBonus() {
        return salary * 0.10;
    }
}
