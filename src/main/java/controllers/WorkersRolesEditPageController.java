package controllers;

import constants.Constants;
import entity.WorkersRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import services.ProjectService;
import services.RolesService;
import services.WorkerService;
import services.WorkersRolesService;

import javax.validation.Valid;

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


    @RequestMapping(value = "/" + Constants.WORKERS_ROLES_EDIT_PAGE, method = RequestMethod.GET)
    public String showWorkersRolesEditPage(Model model) {
        model.addAttribute(Constants.WORKERS, workerService.getAllWorkers());
        model.addAttribute(Constants.PROJECTS, projectService.getAllProjects());
        model.addAttribute(Constants.ROLES, rolesService.getAllRoles());
        model.addAttribute(Constants.WORKERS_ROLE, new WorkersRoles());
        return Constants.WORKERS_ROLES_EDIT_PAGE;
    }

    @RequestMapping(value = "/" + Constants.SAVE_WORKERS_ROLE, method = RequestMethod.POST)
    public String saveWorkersRole(@Valid WorkersRoles workersRole, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return Constants.WORKERS_ROLES_EDIT_PAGE;
        }
        workersRolesService.saveWorkersProject(workersRole);
        return Constants.REDIRECT + Constants.WORKERS_ROLES_PAGE;
    }

}
