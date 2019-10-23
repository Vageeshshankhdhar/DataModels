package com.trainingbasket.datamodels.beans;

import java.util.List;

public class Student
{
	private int studentID;
	private String studentName;
	private Date studentDOB;
	private String studentProofID;
	private Date studentDuration;
	private List<Course> stCourseID;
	private List<Course> stCourseName;
	private List<Trainer> stTrainerID;
	private String studentContact;
	private String studentEmail;
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Date getStudentDOB() {
		return studentDOB;
	}
	public void setStudentDOB(Date studentDOB) {
		this.studentDOB = studentDOB;
	}
	public String getStudentProofID() {
		return studentProofID;
	}
	public void setStudentProofID(String studentProofID) {
		this.studentProofID = studentProofID;
	}
	public Date getStudentDuration() {
		return studentDuration;
	}
	public void setStudentDuration(Date studentDuration) {
		this.studentDuration = studentDuration;
	}
	public List<Course> getStCourseID() {
		return stCourseID;
	}
	public void setStCourseID(List<Course> stCourseID) {
		this.stCourseID = stCourseID;
	}
	public List<Course> getStCourseName() {
		return stCourseName;
	}
	public void setStCourseName(List<Course> stCourseName) {
		this.stCourseName = stCourseName;
	}
	public List<Trainer> getStTrainerID() {
		return stTrainerID;
	}
	public void setStTrainerID(List<Trainer> stTrainerID) {
		this.stTrainerID = stTrainerID;
	}
	public String getStudentContact() {
		return studentContact;
	}
	public void setStudentContact(String studentContact) {
		this.studentContact = studentContact;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}	
}