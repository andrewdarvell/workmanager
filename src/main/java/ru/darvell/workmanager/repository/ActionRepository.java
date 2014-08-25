package ru.darvell.workmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.darvell.workmanager.entity.Action;

public interface ActionRepository extends JpaRepository<Action, Long>{
}
