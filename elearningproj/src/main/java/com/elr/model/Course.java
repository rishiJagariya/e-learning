package com.elr.model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name="Course")
@Entity
public class Course {

	@Id
	@ManyToOne
	@JoinColumn(name = "courseId")
	private int courseId;

	@Column
	private String courseName;

	@Column
	private int fee;
	
    @Column 
	private int duration;
	
    @Column
	private int rating;

	@ManyToOne
	private int userId;

	@Column
	private String description;

	@Column
	private String category;

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", fee=" + fee + ", duration=" + duration
				+ ", rating=" + rating + ", userId=" + userId + ", description=" + description + ", category="
				+ category + "]";
	}

	public Course(int courseId, String courseName, int fee, int duration, int rating, int userId, String description,
			String category) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.fee = fee;
		this.duration = duration;
		this.rating = rating;
		this.userId = userId;
		this.description = description;
		this.category = category;
	}

	

}
