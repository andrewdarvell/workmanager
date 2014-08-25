package ru.darvell.workmanager.entity;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "worker")
public class Worker {

	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Column(name = "id",nullable = false)
	private long id;

	@Column(name = "firstName")
	private String firstName;

	@Column(name = "lastName")
	private String lastName;

	@Column(name = "position")
	private String position;

	@Column(name = "ages")
	private String ages;

    @ManyToOne
    @JoinColumn(name = "action_id")
    private Action action;

	public Worker(){

	}

	public Worker(String firstName, String lasName, String position, String ages, Action action) {
		this.firstName = firstName;
		this.lastName = lasName;
		this.position = position;
		this.ages = ages;
        this.action = action;
	}

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lasName) {
		this.lastName = lasName;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getAges() {
		return ages;
	}

	public void setAges(String ages) {
		this.ages = ages;
	}

	@Override
	public String toString() {
		return "Worker{" +
				"id=" + id +
				", firstName='" + firstName + '\'' +
				", lasName='" + lastName + '\'' +
				", position='" + position + '\'' +
				", ages='" + ages + '\'' +
				'}';
	}
}
