package com.elr.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.elr.dao.DaoClass;
import com.elr.dao.DaoInterface;
import com.elr.model.Student;
import com.elr.model.Trainer;

@Service
public class ServiceClass implements ServiceInterface{
	
	DaoInterface dao = new DaoClass();

	@Override
	public void addTrainer(Trainer trainer) {
		dao.addTrainer(trainer);
	}

	@Override
	public Trainer getTrainer(int userId) {
		return dao.getTrainer(userId);
	}

	@Override
	public String editTrainer(Trainer trainer) {
		return dao.editTrainer(trainer);
	}

	@Override
	public int deleteTrainer(int userId) {
		return dao.deleteTrainer(userId);
	}

	@Override
	public List<Trainer> getAllTrainers() {
		return dao.getAllTrainers();
	}

	@Override
	public void addStrudent(Student student) {
		dao.addStrudent(student);
	}

	@Override
	public Student getStudent(int userId) {
		return dao.getStudent(userId);
	}

	@Override
	public String editStudent(Student student) {
		return dao.editStudent(student);
	}

	@Override
	public int deleteStudent(int userId) {
		return dao.deleteStudent(userId);
	}

	@Override
	public List<Student> getAllStudents() {
		return dao.getAllStudents();
	}

}
