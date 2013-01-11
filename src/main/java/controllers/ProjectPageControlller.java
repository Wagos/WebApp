package controllers;

import constants.Constants;
import entity.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import services.ProjectService;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Witkowsky Dmitry
 * Date: 29.11.12
 * Time: 11:11
 */
@Controller
public class ProjectPageControlller {
    @Autowired
    private ProjectService projectService;

    @RequestMapping(value = "/" + Constants.PROJECT_PAGE, method = RequestMethod.GET)
    public String showWorkerPage(Model model) {
        List projects = projectService.getAllProjects();
        model.addAttribute(Constants.PROJECTS, projects);
        return Constants.PROJECT_PAGE;
    }

    @RequestMapping(value = "/" + Constants.DELETE_PROJECT, method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.OK)
    private void deleteProject(@RequestParam String id) {
        projectService.deleteProject(id);
    }

    @RequestMapping(value = "/" + Constants.SELECT_PROJECT, method = RequestMethod.POST, params = Constants.UPDATE)
    private String updateProject(@RequestParam String id, Model model) {
        Project project = projectService.getProject(id);
        model.addAttribute(Constants.PROJECT, project);
        return Constants.PROJECT_EDIT_PAGE;
    }
}
