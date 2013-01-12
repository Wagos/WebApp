package controllers;

import constants.Constants;
import entity.Worker;
import exeptions.ImageUploadException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.multipart.MultipartFile;
import services.WorkerService;

import javax.validation.Valid;
import java.io.IOException;
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

    @RequestMapping(value = "/" + Constants.SAVE_WORKER, method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.OK)
    public void saveWorker(@Valid Worker worker, BindingResult bindingResult,
                           @RequestParam(value = "image", required = false)
                           MultipartFile image) {

        if (bindingResult.hasErrors()) {
            //return Constants.WORKER_EDIT_PAGE;
        }
        try {
            validatePhoto(image);
            addWoker(worker, image);
        } catch (ImageUploadException e) {
            bindingResult.rejectValue("photo", e.getMessage());
            // return Constants.WORKER_EDIT_PAGE;
        }
        //return Constants.REDIRECT + Constants.WORKER_PAGE;

    }

    private void validatePhoto(MultipartFile image) {
        if (!image.isEmpty()) {
            String contentType = image.getContentType();
            if (!contentType.equals("image/jpeg") || contentType.equals("image/png")) {
                throw new ImageUploadException("errors.worker.photo.format");
            }
        } else throw new ImageUploadException("errors.worker.photo.empty");
    }

    private void addWoker(Worker worker, MultipartFile image) {
        try {
            worker.setPhoto(image.getBytes());
            workerService.saveWorker(worker);
        } catch (IOException e) {
            throw new ImageUploadException("errors.worker.photo.read", e);
        }

    }
}
