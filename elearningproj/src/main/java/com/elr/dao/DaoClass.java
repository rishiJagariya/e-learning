package com.elr.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.elr.model.Student;
import com.elr.model.Trainer;

@Repository
public class DaoClass implements DaoInterface{

	@Override
	public void addTrainer(Trainer trainer) {
		
	}

	@Override
	public Trainer getTrainer(int userId) {
		
		return null;
	}

	@Override
	public String editTrainer(Trainer trainer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteTrainer(int userId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Trainer> getAllTrainers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addStrudent(Student student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Student getStudent(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String editStudent(Student student) {
		// update student -> existing student where student.id == existingstudent.id 
		return null;
	}

	@Override
	public int deleteStudent(int userId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}
	


}
