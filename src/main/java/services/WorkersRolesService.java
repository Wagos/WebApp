package services;

import entity.WorkersRoles;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import repositories.WorkersRolesRepository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Witkowsky Dmitry
 * Date: 29.11.12
 * Time: 10:32
 */
@Service
@Transactional
public class WorkersRolesService {

    @Resource
    private WorkersRolesRepository workersRolesRepository;


    public void saveWorkersProject(WorkersRoles workersRoles) {
        workersRolesRepository.save(workersRoles);
    }

    @SuppressWarnings("unchecked")
    public List<WorkersRoles> getAllWorkersProject() {
        return workersRolesRepository.findAll();
    }

    public void deleteWorkersProject(String id) {
        workersRolesRepository.delete(Integer.parseInt(id));
    }

    public WorkersRoles getWorkersProject(String id) {
        return workersRolesRepository.findOne(Integer.parseInt(id));
    }
}
