package com.elr.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "Trainer")
public class Trainer extends Student{
	
	@OneToMany(mappedBy="Course")
	private List courseOffered;
	public Trainer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Trainer(List courseOffered) {
		super();
		this.courseOffered = courseOffered;
	}
	public List getCourseOffered() {
		return courseOffered;
	}
	public void setCourseOffered(List courseOffered) {
		this.courseOffered = courseOffered;
	}
	@Override
	public String toString() {
		return "Trainer [courseOffered=" + courseOffered + "]";
	}
	
	
}
