package com.elr.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Entity
@Table(name = "STUDENT")
public class Student extends User {
	
	@OneToMany(mappedBy = "Course")
	private List<Course> enroll;

	public List<Course> getEnroll() {
		return enroll;
	}

	public void setEnroll(Course enroll) {
		this.enroll.add(enroll);
	}
	
	public Student(User user) {
		this.setUsername(user.getUsername());
		this.setPassword(user.getPassword());
		this.setFname(user.getFname());
		this.setLname(user.getLname());
		this.setDob(user.getDob());
		this.setPhoneNo(user.getPhoneNo());
		this.setUserId(user.getUserId());
		this.setUserType(user.getUserType());
		this.enroll = null;
	}

	@Override
	public String toString() {
		return "Student [enroll=" + enroll + "]";
	}

	public Student(List<Course> enroll) {
		super();
		this.enroll = enroll;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	
}
