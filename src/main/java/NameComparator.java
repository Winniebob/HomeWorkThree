import Workers.Worker;

import java.util.Comparator;

// Компаратор для сортировки по имени работника
class NameComparator implements Comparator<Worker> {
    @Override
    public int compare(Worker w1, Worker w2) {
        return w1.name.compareTo(w2.name);
    }
}