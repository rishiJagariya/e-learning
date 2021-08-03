package com.elr.Elearning;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Trainer {
	@Id
	private int trainerId;
	@Column
	private String trainerName;
	private int dob;
	private String username;
	@OneToMany(mappedBy="Course")
	private List courseOffered;
	@OneToOne
	@JoinColumn(name = "userType", referencedColumnName = "auth")
	private int auth;
	public Trainer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Trainer(int trainerId, String trainerName, int dob, String username, List courseOffered, int auth) {
		super();
		this.trainerId = trainerId;
		this.trainerName = trainerName;
		this.dob = dob;
		this.username = username;
		this.courseOffered = courseOffered;
		this.auth = auth;
	}
	public int getTrainerId() {
		return trainerId;
	}
	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}
	public String getTrainerName() {
		return trainerName;
	}
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	public int getDob() {
		return dob;
	}
	public void setDob(int dob) {
		this.dob = dob;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public List getCourseOffered() {
		return courseOffered;
	}
	public void setCourseOffered(List courseOffered) {
		this.courseOffered = courseOffered;
	}
	public int getAuth() {
		return auth;
	}
	public void setAuth(int auth) {
		this.auth = auth;
	}
	@Override
	public String toString() {
		return "Trainer [trainerId=" + trainerId + ", trainerName=" + trainerName + ", dob=" + dob + ", username="
				+ username + ", courseOffered=" + courseOffered + ", auth=" + auth + "]";
	}
	
}
