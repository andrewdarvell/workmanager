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
    @Column(name = "action_id",nullable = false)
    private long id;

    @Column(name = "actionName")
    private String actionName;

    /*
    @OneToOne(optional = false)
    @JoinColumn(name="worker", unique = true)
    private Worker worker;

*/
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
/*
    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }
*/
    //public Action(String actionName, Worker worker) {
    public Action(String actionName) {
        this.actionName = actionName;
        //this.worker = worker;
    }

    public Action() {
    }

    @Override
    public String toString() {
        return "Action{" +
                "id=" + id +
                ", actonName='" + actionName + '}';
    }
}
