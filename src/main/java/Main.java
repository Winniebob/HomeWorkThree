import Workers.FixedWorker;
import Workers.Freelancer;
import Workers.Worker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создание массива/коллекции сотрудников
        List<Worker> workers = new ArrayList<>();
        workers.add(new Freelancer("Иван", 10));
        workers.add(new FixedWorker("Петр", 3000));
        workers.add(new Freelancer("Анна", 15));
        workers.add(new FixedWorker("Мария", 2000));

        // Сортировка массива/коллекции с использованием компаратора
        Collections.sort(workers, new NameComparator());

        // Вывод данных с использованием foreach
        for (Worker worker : workers) {
            System.out.println("Имя: " + worker.name);
            System.out.println("Среднемесячная заработная плата: " + worker.calculateAverageMonthlySalary());
            System.out.println();
        }

        //  возможность вывода данных с использованием foreach у созданного класса содержащего массив сотрудников
        WorkersCollection workersCollection = new WorkersCollection();
        workersCollection.addWorker(new FixedWorker("Себастьян", 15000));
        workersCollection.addWorker(new FixedWorker("Дмитрий", 16000));
        workersCollection.addWorker(new Freelancer("Инга", 11));
        workersCollection.addWorker(new Freelancer("Леонид", 12));

        for (Worker worker : workersCollection) {
            System.out.println(worker.getName());
            System.out.println(worker.calculateAverageMonthlySalary());
        }
    }
}