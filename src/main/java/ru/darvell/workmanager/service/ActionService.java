package ru.darvell.workmanager.service;

import ru.darvell.workmanager.entity.Action;

import java.util.List;

public interface ActionService {
    Action addAction(Action action);
    Action editAction(Action action);
    List<Action> getAll();
    void deleteAction(long id);
    Action getById(long id);
}
