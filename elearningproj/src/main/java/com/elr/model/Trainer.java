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
	private List<Course> courseOffered;
	public Trainer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Trainer(User user) {
		this.setUsername(user.getUsername());
		this.setPassword(user.getPassword());
		this.setFname(user.getFname());
		this.setLname(user.getLname());
		this.setDob(user.getDob());
		this.setPhoneNo(user.getPhoneNo());
		this.setUserId(user.getUserId());
		this.setUserType(user.getUserType());
		this.courseOffered = null;
	}
	
	public Trainer(List<Course> courseOffered) {
		super();
		this.courseOffered = courseOffered;
	}
	public List<Course> getCourseOffered() {
		return courseOffered;
	}
	public void setCourseOffered(Course courseOffered) {
		this.courseOffered.add(courseOffered);
	}
	@Override
	public String toString() {
		return "Trainer [courseOffered=" + courseOffered + "]";
	}
	
	
}
