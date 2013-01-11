package controllers;

import constants.Constants;
import entity.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import services.ProjectService;

import javax.validation.Valid;

/**
 * Created with IntelliJ IDEA.
 * User: Witkowsky Dmitry
 * Date: 29.11.12
 * Time: 18:02
 */
@Controller
public class ProjectEditPageController {
    @Autowired
    private ProjectService projectService;

    @RequestMapping(value = "/" + Constants.PROJECT_EDIT_PAGE, method = RequestMethod.GET)
    public String showWorkerEditForm(Model model) {
        model.addAttribute(Constants.PROJECT, new Project());
        return Constants.PROJECT_EDIT_PAGE;
    }

    @RequestMapping(value = "/" + Constants.SAVE_PROJECT, method = RequestMethod.POST)
    public String saveProject(@Valid Project project, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return Constants.PROJECT_EDIT_PAGE;
        }
        projectService.addProject(project);
        return Constants.REDIRECT + Constants.PROJECT_PAGE;
    }
}
