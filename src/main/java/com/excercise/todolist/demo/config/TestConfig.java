package com.excercise.todolist.demo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.excercise.todolist.demo.entities.ToDoList;
import com.excercise.todolist.demo.entities.enums.TaskStatus;
import com.excercise.todolist.demo.resources.repositories.ToDoListRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {


	@Autowired 
	private ToDoListRepository tRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
	ToDoList t1 = new ToDoList(null, "Clean the bathromm", TaskStatus.READY_TO_DO, "Mop the floor and clean the mirrors");
	ToDoList t2 = new ToDoList(null, "Throw out the garbage", TaskStatus.DONE, "Remove garbage from the house and put it in the trash");
	
	tRepository.saveAll(Arrays.asList(t1, t2));
		
		
		
	}

}
