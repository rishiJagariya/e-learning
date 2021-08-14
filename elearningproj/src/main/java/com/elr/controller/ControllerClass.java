package com.elr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.elr.model.Student;
import com.elr.model.Trainer;
import com.elr.model.User;
import com.elr.service.ServiceInterface;

@RestController
public class ControllerClass {
	
	@Autowired
	ServiceInterface eService;
	
	@CrossOrigin
	@PostMapping("adduser")
	public ResponseEntity<String> addUser(@RequestBody User user) {
		
		if(user.getUserType() == "trainer") {
			Trainer newTrainer = new Trainer(user);
			eService.addTrainer(newTrainer);
			
		} else if(user.getUserType() == "student") {
			Student newStudent = new Student(user);
			eService.addStrudent(newStudent);
		}
		return null;
	}
	

}
