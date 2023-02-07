package com.excercise.todolist.demo.resources.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excercise.todolist.demo.entities.ToDoList;

public interface ToDoListRepository extends JpaRepository <ToDoList, Integer> {

}
