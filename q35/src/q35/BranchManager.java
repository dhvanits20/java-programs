package q35;

public class BranchManager extends BaseEmployee {
	public BranchManager(String name, double salary) {
        super(name, salary);
    }

    @Override
    double calculateBonus() {
        return salary * 0.20;
    }
}
