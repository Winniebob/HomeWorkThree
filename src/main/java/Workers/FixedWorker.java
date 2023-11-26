package Workers;

// Потомок класса Worker - Worker
public class FixedWorker extends Worker {
    private double monthlySalary;

    public FixedWorker(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateAverageMonthlySalary() {
        return monthlySalary;
    }
}