package com.excercise.todolist.demo.entities;

import java.io.Serializable;

import com.excercise.todolist.demo.entities.enums.TaskStatus;

public class ToDoList implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String taskName;
	private Integer status;
	private String description;
	
	public ToDoList (){}

	public ToDoList(Integer id, String taskName,TaskStatus status, String description) {
		this.id = id;
		this.taskName = taskName;
		setTaskStatus (status);
		this.description = description;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
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

	
	
	
	
	
	


