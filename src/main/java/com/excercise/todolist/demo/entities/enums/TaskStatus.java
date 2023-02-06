package com.excercise.todolist.demo.entities.enums;

public enum TaskStatus {
	
	READY_TO_DO(1),
	DOING(2),
	DONE(3),
	CANCELLED(4);
	
	private int code;
	
	private TaskStatus(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	public static TaskStatus valueOf (int code) {
		for (TaskStatus value : TaskStatus.values()) {
			if (value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid TaskStatus code");
	}

}
