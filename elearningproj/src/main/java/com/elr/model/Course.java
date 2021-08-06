package com.elr.model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class Course {

	@Id
	@OneToOne(mappedBy = "student")
	@JoinColumn(name = "courseId")
	private int courseId;

	@OneToMany(mappedBy = "student")
	private String courseName;

	@OneToOne(mappedBy = "course")
	@JoinColumn(name = "courseId")
	private int fee;

	@OneToOne(mappedBy = "course")
	@JoinColumn(name = "courseId")
	private int duration;
	private int rating;

	@OneToMany(mappedBy = "course")
	@JoinColumn(name = "course")
	private int trainerId;

	@Column(name = "course")
	private String description;

	@Column(name = "course")
	private String category;

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(int courseId, String courseName, int fee, int duration, int rating, int trainerId, String description,
			String category) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.fee = fee;
		this.duration = duration;
		this.rating = rating;
		this.trainerId = trainerId;
		this.description = description;
		this.category = category;
	}

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

	public int getTrainerId() {
		return trainerId;
	}

	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
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

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", fee=" + fee + ", duration=" + duration
				+ ", rating=" + rating + ", trainerId=" + trainerId + ", description=" + description + ", category="
				+ category + "]";
	}

}
