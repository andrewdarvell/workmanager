package ru.darvell.workmanager.service.imlp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.darvell.workmanager.entity.Action;
import ru.darvell.workmanager.repository.ActionRepository;
import ru.darvell.workmanager.service.ActionService;

import java.util.List;

@Service
public class ActionServiceImpl implements ActionService {

    @Autowired
    private ActionRepository actionRepository;

    @Override
    public Action addAction(Action action) {
        return actionRepository.saveAndFlush(action);
    }

    @Override
    public Action editAction(Action action) {
        return actionRepository.saveAndFlush(action);
    }

    @Override
    public List<Action> getAll() {
        return actionRepository.findAll();
    }

    @Override
    public void deleteAction(long id) {
        actionRepository.delete(id);
    }
}
