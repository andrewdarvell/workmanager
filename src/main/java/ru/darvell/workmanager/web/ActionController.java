package ru.darvell.workmanager.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.darvell.workmanager.entity.Action;
import ru.darvell.workmanager.service.ActionService;

import java.util.Map;

@Controller
public class ActionController {

    @Autowired
    private ActionService actionService;

    @RequestMapping("/actions")
    public String home() {
        System.out.println("Redirect to index");
        return "redirect:/actions/index";
    }

    @RequestMapping("/actions/index")
    public String listContacts(Map<String, Object> map) {

        //map.put("worker", new Worker());
        map.put("actionList", actionService.getAll());

        return "actions";
    }
    @RequestMapping("/actions/id={actionId}")
    public String showAction(@PathVariable("actionId") Integer actionId,
                                                Map<String, Object> map)
    {
        System.out.println("Action "+actionId);
        Action action = actionService.getById(actionId);
        map.put("actionObj", action);
        return "action";
    }

}
