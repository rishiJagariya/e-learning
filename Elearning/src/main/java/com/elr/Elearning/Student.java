package com.elr.Elearning;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Student {
	@Id
	private int studentId;
	
	@Column(name="Student_Name")
	private String studentName;
	
	@Column(name="DOB")
	private String dob;
	
	@OneToOne
	@JoinColumn(name = "auth_un")
	private String username;
	
	@OneToMany(mappedBy = "Course")
	private List<Integer> enroll;
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", dob=" + dob + ", username="
				+ username + ", enroll=" + enroll + ", auth=" + auth + "]";
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int studentId, String studentName, String dob, String username, List<Integer> enroll, Auth auth) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.dob = dob;
		this.username = username;
		this.enroll = enroll;
		this.auth = auth;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<Integer> getEnroll() {
		return enroll;
	}

	public void setEnroll(List<Integer> enroll) {
		this.enroll = enroll;
	}

	public Auth getAuth() {
		return auth;
	}

	public void setAuth(Auth auth) {
		this.auth = auth;
	}

	@Embedded
	private Auth auth;

	public Object setUser;

	public Object setUserName;
	
	
	
}
