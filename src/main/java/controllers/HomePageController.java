package controllers;

import constants.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import services.ProjectService;
import services.WorkerService;

import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: Witkowsky Dmitry
 * Date: 23.11.12
 * Time: 14:36
 */
@Controller
public class HomePageController {

    @Autowired
    private WorkerService workerService;
    @Autowired
    private ProjectService projectService;

    @RequestMapping(value = "/" + Constants.HOME_PAGE, method = RequestMethod.GET)
    public String showHomePage(Map<String, Object> model) {
        List workers = workerService.getWorkersNames();
        List projects = projectService.getProjectsNames();
        model.put(Constants.WORKERS, workers);
        model.put(Constants.PROJECTS, projects);
        return Constants.HOME_PAGE;
    }
}
