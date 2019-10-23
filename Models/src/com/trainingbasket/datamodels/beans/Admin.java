package com.trainingbasket.datamodels.beans;
import java.util.*;

public class Admin
{
	private int adminID;
	private String adminName;
	private List<Trainer> adminTrainerID;
	private List<Student> adminStudentID;
	private List<Course> adminCourseID;
	private List<Date> adminDOB;
	private List<Date> adminDuration;
	private String adminContact;
	private List<Email> adminEmail;
	public int getAdminID() {
		return adminID;
	}
	public void setAdminID(int adminID) {
		this.adminID = adminID;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public List<Trainer> getAdminTrainerID() {
		return adminTrainerID;
	}
	public void setAdminTrainerID(List<Trainer> adminTrainerID) {
		this.adminTrainerID = adminTrainerID;
	}
	public List<Student> getAdminStudentID() {
		return adminStudentID;
	}
	public void setAdminStudentID(List<Student> adminStudentID) {
		this.adminStudentID = adminStudentID;
	}
	public List<Course> getAdminCourseID() {
		return adminCourseID;
	}
	public void setAdminCourseID(List<Course> adminCourseID) {
		this.adminCourseID = adminCourseID;
	}
	public List<Date> getAdminDOB() {
		return adminDOB;
	}
	public void setAdminDOB(List<Date> adminDOB) {
		this.adminDOB = adminDOB;
	}
	public List<Date> getAdminDuration() {
		return adminDuration;
	}
	public void setAdminDuration(List<Date> adminDuration) {
		this.adminDuration = adminDuration;
	}
	public String getAdminContact() {
		return adminContact;
	}
	public void setAdminContact(String adminContact) {
		this.adminContact = adminContact;
	}
	public List<Email> getAdminEmail() {
		return adminEmail;
	}
	public void setAdminEmail(List<Email> adminEmail) {
		this.adminEmail = adminEmail;
	}
}
