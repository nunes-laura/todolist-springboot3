package com.excercise.todolist.demo.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.excercise.todolist.demo.entities.ToDoList;
import com.excercise.todolist.demo.entities.enums.TaskStatus;

@RestController
@RequestMapping(value="/newlist")
public class ToDoListResource {
	
	
	@GetMapping
	public ResponseEntity<ToDoList> findAll () {
		ToDoList t = new ToDoList(1, "Clean the bathroom", TaskStatus.READY_TO_DO, "Mop the floor and clean the mirrors");
		return ResponseEntity.ok().body(t);
	}
	

}
