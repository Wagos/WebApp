package controllers;

import constants.Constants;
import entity.Worker;
import exeptions.ImageUploadException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import services.WorkerService;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: Witkowsky Dmitry
 * Date: 26.11.12
 * Time: 18:44
 */
@Controller
public class WorkerEditPageController {

    @Autowired
    private WorkerService workerService;

    @RequestMapping(value = "/" + Constants.WORKER_EDIT_PAGE, method = RequestMethod.GET)
    public String showWorkerEditForm(Model model) {
        model.addAttribute(Constants.WORKER, new Worker());
        return Constants.WORKER_EDIT_PAGE;
    }



}
