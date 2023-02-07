package com.excercise.todolist.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excercise.todolist.demo.entities.ToDoList;
import com.excercise.todolist.demo.resources.repositories.ToDoListRepository;


@Service
public class ToDoListService {
	
	@Autowired
	private ToDoListRepository repository;
	
	public List<ToDoList> findAll() {
		return repository.findAll(); }
	
	public ToDoList findById(Integer id) {
		Optional<ToDoList> obj =  repository.findById(id);
		return obj.get();	}
	
	
	public ToDoList insert (ToDoList tl) {
		return repository.save(tl);
		
	}
	
	
	
	

}
