package com.elr.dao;

import java.util.List;

import com.elr.model.Student;
import com.elr.model.Trainer;

public interface DaoInterface {
	
	//Trainer functions
	public void addTrainer(Trainer trainer);
	public Trainer getTrainer(int userId);
	public String editTrainer(Trainer trainer);
	public int deleteTrainer(int userId);
	public List<Trainer> getAllTrainers();
	
	//Students Functions
	public void addStrudent(Student student);
	public Student getStudent(int userId);
	public String editStudent(Student student);
	public int deleteStudent(int userId);
	public List<Student> getAllStudents();
}
