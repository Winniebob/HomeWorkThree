package Workers;

// Базовый абстрактный класс Worker
public abstract class Worker {
    public String name;

    public Worker(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public abstract double calculateAverageMonthlySalary();
}