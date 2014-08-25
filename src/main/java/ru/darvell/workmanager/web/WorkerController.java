package ru.darvell.workmanager.web;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.darvell.workmanager.entity.Worker;
import ru.darvell.workmanager.service.WorkerService;

import java.util.List;
import java.util.Map;

@Controller
public class WorkerController {



	@Autowired
	private WorkerService workerService;

	@RequestMapping("/")
	public String home() {
		System.out.println("Redirect to index");
		return "redirect:/worker/index";
	}

	@RequestMapping("/worker/index")
	public String listWorkers(Map<String, Object> map) {

		map.put("worker", new Worker());
		map.put("workerList", workerService.getAll());
        /*
        List<Worker> workers = workerService.getAll();
        for(int i = 0; i<workers.size();i++){
            System.out.println(workers.get(i).getAction().getActionName());
        }
        */
		return "worker";
	}

	@RequestMapping(value = "/worker/add", method = RequestMethod.POST)
	public String addContact(@ModelAttribute("Worker") Worker worker,BindingResult result) {

		workerService.addWorker(worker);

		return "redirect:/worker/index";
	}

	@RequestMapping("/worker/delete/{workerId}")
	public String deleteContact(@PathVariable("workerId") Integer workerId) {
        workerService.deleteWorker(workerId);
		return "redirect:/worker/index";
	}




}
