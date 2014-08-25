package ru.darvell.workmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.darvell.workmanager.entity.Worker;


public interface WorkerRepository extends JpaRepository<Worker, Long> {

    @Query("select w from Worker w where w.lastName = :lastName")
    Worker findByLastName(@Param("lastName") String lastName);

}
