package com.excercise.todolist.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excercise.todolist.demo.entities.ToDoList;
import com.excercise.todolist.demo.resources.repositories.ToDoListRepository;
import com.excercise.todolist.demo.services.exceptions.ResourceNotFoundException;


@Service
public class ToDoListService {
	
	@Autowired
	private ToDoListRepository repository;
	
	public List<ToDoList> findAll() {
		return repository.findAll(); }
	
	public ToDoList findById(Integer id) {
		Optional<ToDoList> obj =  repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));	}
	
	
	public ToDoList insert (ToDoList tl) {
		return repository.save(tl);}
	
	public void delete (Integer id) {
		repository.deleteById(id);}
	
	public ToDoList update(Integer id, ToDoList obj) {
		ToDoList entity = repository.getReferenceById(id);
		updateData(entity, obj);
		return repository.save(entity);
	}

	private void updateData(ToDoList entity, ToDoList obj) {
		entity.setName(obj.getName());
		entity.setDescription(obj.getDescription());}
		
	}
	
	


