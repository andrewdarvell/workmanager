package ru.darvell.workmanager.entity;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "action")
public class Action {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id",nullable = false)
    private long id;

    @Column(name = "actionName")
    private String actionName;

    @Column(name = "worker")
    private Worker worker;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    public Action(String actionName, Worker worker) {
        this.actionName = actionName;
        this.worker = worker;
    }

    public Action() {
    }
}
