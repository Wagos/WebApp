package controllers;

import constants.Constants;
import entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import services.RolesService;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Witkowsky Dmitry
 * Date: 30.11.12
 * Time: 19:03
 */
@Controller
public class RolesPageController {

    @Autowired
    private RolesService rolesService;

    @RequestMapping(value = "/" + Constants.ROLES_PAGE, method = RequestMethod.GET)
    public String showRolesPage(Model model) {
        List<Role> roles = rolesService.getAllRoles();
        model.addAttribute(Constants.ROLES, roles);
        return Constants.ROLES_PAGE;
    }
}
