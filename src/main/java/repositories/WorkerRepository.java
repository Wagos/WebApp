package repositories;

import entity.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Witkowsky Dmitry
 * Date: 30.11.12
 * Time: 14:05
 */

public interface WorkerRepository extends JpaRepository<Worker, Integer> {
    //    List<String> findFio();
    @Query("SELECT fio from Worker")
    public List<String> findAllFio();

}
