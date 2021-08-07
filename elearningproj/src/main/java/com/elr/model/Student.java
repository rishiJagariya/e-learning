package com.elr.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Entity
@Table(name = "STUDENT")
public class Student extends User {
	
	@OneToMany(mappedBy = "Course")
	private List enroll;

	public List getEnroll() {
		return enroll;
	}

	public void setEnroll(List enroll) {
		this.enroll = enroll;
	}

	@Override
	public String toString() {
		return "Student [enroll=" + enroll + "]";
	}

	public Student(List enroll) {
		super();
		this.enroll = enroll;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	
}
