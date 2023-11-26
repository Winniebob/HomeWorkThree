import Workers.Worker;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// класс, содержащий массив или коллекцию сотрудников
class WorkersCollection implements Iterable<Worker> {
    private List<Worker> workers;

    public WorkersCollection() {
        workers = new ArrayList<>();
    }

    public void addWorker(Worker worker) {
        workers.add(worker);
    }

    @Override
    public Iterator<Worker> iterator() {
        return workers.iterator();
    }
}