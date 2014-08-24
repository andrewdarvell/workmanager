package ru.darvell.workmanager.service.imlp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.darvell.workmanager.entity.Worker;
import ru.darvell.workmanager.repository.WorkerRepository;
import ru.darvell.workmanager.service.WorkerService;

import java.util.List;

@Service
public class WorkerServiceImpl implements WorkerService{

	@Autowired
	private WorkerRepository workerRepository;

	@Override
	public Worker addWorker(Worker worker) {
		return workerRepository.saveAndFlush(worker);
	}

	@Override
	public List<Worker> getAll() {
		return workerRepository.findAll();
	}
}
