package com.elr.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Enrollment {
    
    @Id
    private int registrationId;
    
    @OneToOne(mappedBy = "Student")
    @JoinColumn(name="studentId")
    private int studentId;
    
    @OneToOne(mappedBy = "Course")
    @JoinColumn(name="courseId")
    private int courseId;
    
    @Column
    private String dateOfEnroll;
    
    @Column
    private String dateOfCompletion;

	public Enrollment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Enrollment(int registrationId, int studentId, int courseId, String dateOfEnroll, String dateOfCompletion) {
		super();
		this.registrationId = registrationId;
		this.studentId = studentId;
		this.courseId = courseId;
		this.dateOfEnroll = dateOfEnroll;
		this.dateOfCompletion = dateOfCompletion;
	}

	public int getRegistrationId() {
		return registrationId;
	}

	public void setRegistrationId(int registrationId) {
		this.registrationId = registrationId;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getDateOfEnroll() {
		return dateOfEnroll;
	}

	public void setDateOfEnroll(String dateOfEnroll) {
		this.dateOfEnroll = dateOfEnroll;
	}

	public String getDateOfCompletion() {
		return dateOfCompletion;
	}

	public void setDateOfCompletion(String dateOfCompletion) {
		this.dateOfCompletion = dateOfCompletion;
	}

	@Override
	public String toString() {
		return "Enrollment [registrationId=" + registrationId + ", studentId=" + studentId + ", courseId=" + courseId
				+ ", dateOfEnroll=" + dateOfEnroll + ", dateOfCompletion=" + dateOfCompletion + "]";
	}
    
    
}

