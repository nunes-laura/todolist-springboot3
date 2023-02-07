package com.excercise.todolist.demo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.excercise.todolist.demo.entities.ToDoList;
import com.excercise.todolist.demo.services.ToDoListService;

@RestController
@RequestMapping(value="/newlist")
public class ToDoListResource {
	
	@Autowired
	private ToDoListService service;
	
	
	@GetMapping
	public ResponseEntity<List<ToDoList>> findAll () {
		List<ToDoList> tl =  service.findAll();
		return ResponseEntity.ok().body(tl);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity <ToDoList> findById (@PathVariable Integer id) {
		ToDoList obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	

}
