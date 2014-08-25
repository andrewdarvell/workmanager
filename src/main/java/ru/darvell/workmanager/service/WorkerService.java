package ru.darvell.workmanager.service;

import ru.darvell.workmanager.entity.Worker;

import java.util.List;

public interface WorkerService {
	Worker addWorker(Worker worker);

	List<Worker> getAll();

    void delete(long id);

    Worker editWorker(Worker worker);

    Worker getByLastName(String lastName);

}
