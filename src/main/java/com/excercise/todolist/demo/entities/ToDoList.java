package com.excercise.todolist.demo.entities;

import java.io.Serializable;

import com.excercise.todolist.demo.entities.enums.TaskStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ToDoList implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	
	private Integer status;
	
	private String description;
	
	public ToDoList (){}

	public ToDoList(Integer id, String name, TaskStatus status, String description) {
		this.id = id;
		this.name = name;
		setTaskStatus (status);
		this.description = description;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TaskStatus getTaskStatus() {
		return TaskStatus.valueOf(status);
	}

	public void setTaskStatus(TaskStatus status) {
		if (status != null) {
		this.status = status.getCode(); }
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
}

	
	
	
	
	
	


