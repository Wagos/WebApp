package controllers;

import constants.Constants;
import entity.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import services.WorkerService;

import javax.validation.Valid;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Witkowsky Dmitry
 * Date: 26.11.12
 * Time: 15:37
 */
@Controller
public class WorkersPageController {

    @Autowired
    private WorkerService workerService;

    @RequestMapping(value = "/" + Constants.DELETE_WORKER, method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.OK)
    private void deleteWorker(@RequestParam String id) {
        workerService.deleteWorker(id);
      // return Constants.REDIRECT + Constants.WORKER_PAGE;
    }

    @RequestMapping(value = "/" + Constants.SELECT_WORKER, method = RequestMethod.POST)
    private String updateWorker(@RequestParam String id, Model model) {
        Worker worker = workerService.getWorker(id);
        model.addAttribute(Constants.WORKER, worker);
        return "worker/workerEdit";
    }

    @RequestMapping(value = "/" + Constants.WORKER_PAGE, method = RequestMethod.GET)
    public String showWorkerPage(Model model) {
        List workers = workerService.getAllWorkers();
        model.addAttribute(Constants.WORKERS, workers);
        return Constants.WORKER_PAGE;
    }

    @RequestMapping(value = "/Save")
    public String save(@Valid Worker worker,BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            return null;
        }
        workerService.saveWorker(worker);
        return "Ololo";
    }
}
