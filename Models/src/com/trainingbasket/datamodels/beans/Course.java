package com.trainingbasket.datamodels.beans;

import java.util.List;

public class Course
{
	private int courseID;
	private String courseName;
	private float studentDuration;
	private List<Subject> subID;
	private int studentCourseID;
	private int TrainerID;
	public int getCourseID() {
		return courseID;
	}
	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public float getStudentDuration() {
		return studentDuration;
	}
	public void setStudentDuration(float studentDuration) {
		this.studentDuration = studentDuration;
	}
	public List<Subject> getSubID() {
		return subID;
	}
	public void setSubID(List<Subject> subID) {
		this.subID = subID;
	}
	public int getStudentCourseID() {
		return studentCourseID;
	}
	public void setStudentCourseID(int studentCourseID) {
		this.studentCourseID = studentCourseID;
	}
	public int getTrainerID() {
		return TrainerID;
	}
	public void setTrainerID(int trainerID) {
		TrainerID = trainerID;
	}
}