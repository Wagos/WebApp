package controllers;

import constants.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import services.WorkersRolesService;

/**
 * Created with IntelliJ IDEA.
 * User: Witkowsky Dmitry
 * Date: 03.12.12
 * Time: 10:00
 */
@Controller
public class WorkersRolesPageController {

    @Autowired
    private WorkersRolesService workersRolesService;

    @RequestMapping(value = "/" + Constants.WORKERS_ROLES_PAGE, method = RequestMethod.GET)
    public String showWorkersRolesPage(Model model) {
        model.addAttribute(Constants.WORKERS_ROLES, workersRolesService.getAllWorkersProject());
        return Constants.WORKERS_ROLES_PAGE;
    }

    @RequestMapping(value = "/" + Constants.SELECT_WORKERS_ROLE, params = "delete")
    public String selectWorkersRole(@RequestParam String id) {
        workersRolesService.deleteWorkersProject(id);
        return Constants.REDIRECT + Constants.WORKERS_ROLES_PAGE;
    }
}
