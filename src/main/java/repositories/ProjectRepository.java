package repositories;

import entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Witkowsky Dmitry
 * Date: 30.11.12
 * Time: 15:48
 */
public interface ProjectRepository extends JpaRepository<Project, Integer> {
    @Query("SELECT name from Project")
    public List<String> findAllName();
}
