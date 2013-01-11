package services;

import entity.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import repositories.ProjectRepository;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Witkowsky Dmitry
 * Date: 29.11.12
 * Time: 9:56
 */
@Service
@Transactional
public class ProjectService {

    //    @Resource
//    private ProjectDAO projectDAO;
    @Autowired
    private ProjectRepository projectRepository;

    public void addProject(Project project) {
        projectRepository.save(project);
    }

    @SuppressWarnings("unchecked")
    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    @SuppressWarnings("unchecked")
    public List<String> getProjectsNames() {
        return projectRepository.findAllName();
    }

    public void deleteProject(String id) {
        projectRepository.delete(Integer.parseInt(id));
    }

    public Project getProject(String id) {
        return projectRepository.findOne(Integer.parseInt(id));
    }
}
