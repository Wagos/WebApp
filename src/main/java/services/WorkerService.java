package services;

import entity.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import repositories.WorkerRepository;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Witkowsky Dmitry
 * Date: 28.11.12
 * Time: 11:41
 */
@Service
@Transactional
public class WorkerService {

    @Autowired
    private WorkerRepository workerRepository;


    public void saveWorker(Worker worker) {

        workerRepository.save(worker);
    }

    @SuppressWarnings("unchecked")
    public List<Worker> getAllWorkers() {
        return workerRepository.findAll();
    }

    @SuppressWarnings("unchecked")
    public List<String> getWorkersNames() {
        return workerRepository.findAllFio();
    }

    public void deleteWorker(String id) {
        workerRepository.delete(Integer.parseInt(id));
    }

    public Worker getWorker(String id) {
        return workerRepository.findOne(Integer.parseInt(id));
    }
}
