package controllers;

import constants.Constants;
import entity.Project;
import entity.Role;
import entity.Worker;
import entity.WorkersRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import services.ProjectService;
import services.RolesService;
import services.WorkerService;
import services.WorkersRolesService;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: Witkowsky Dmitry
 * Date: 03.12.12
 * Time: 10:01
 */
@Controller
public class WorkersRolesEditPageController {

    @Autowired
    private WorkersRolesService workersRolesService;

    @Autowired
    private WorkerService workerService;

    @Autowired
    private ProjectService projectService;

    @Autowired
    private RolesService rolesService;


    @RequestMapping(value = Constants.PATH_SEPARATOR + Constants.WORKERS_ROLES_EDIT_PAGE, method = RequestMethod.GET)
    public String showWorkersRolesEditPage(Model model) {
        model.addAttribute(Constants.WORKERS, workerService.getAllWorkers());
        model.addAttribute(Constants.PROJECTS, projectService.getAllProjects());
        model.addAttribute(Constants.ROLES, rolesService.getAllRoles());
        model.addAttribute(Constants.WORKERS_ROLE, new WorkersRoles());
        return Constants.WORKERS_ROLES_EDIT_PAGE;
    }

    @RequestMapping(value = Constants.PATH_SEPARATOR+Constants.WORKERS_ROLES_DATA,method = RequestMethod.GET)

    public @ResponseBody
    Map<String, Map> getWorkersRolesData(){
        Map<String, Map> map=new HashMap<String, Map>();
        Map<Integer, String> tempMap=new HashMap<Integer, String>();
        List<Worker> list=workerService.getAllWorkers();
        for(Worker worker : list){
            tempMap.put(worker.getId(),worker.getFio());
        }
        map.put(Constants.WORKER+".id",tempMap);
        tempMap=new HashMap<>();
        List<Project> list1=projectService.getAllProjects();
        for(Project project : list1){
            tempMap.put(project.getId(),project.getName());
        }
        map.put(Constants.PROJECT+".id",tempMap);

        Map<String, String> temp2=new HashMap<String, String>();
        List<Role> workersRoleses=rolesService.getAllRoles();
        for(Role role:workersRoleses){
            temp2.put(role.getName(),role.getName());
        }
        map.put("roleName.name",temp2);
//        map.put(Constants.WORKERS, );
//        map.put(Constants.PROJECTS, projectService.getAllProjects());
//        map.put(Constants.ROLES, rolesService.getAllRoles());
        return map;
    }

    @RequestMapping(value = Constants.PATH_SEPARATOR + Constants.SAVE_WORKERS_ROLE, method = RequestMethod.POST)
    public String saveWorkersRole(@Valid WorkersRoles workersRole, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return Constants.WORKERS_ROLES_EDIT_PAGE;
        }
        workersRolesService.saveWorkersProject(workersRole);
        return Constants.REDIRECT + Constants.WORKERS_ROLES_PAGE;
    }

}
