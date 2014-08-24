package ru.darvell.workmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.darvell.workmanager.entity.Worker;


public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
