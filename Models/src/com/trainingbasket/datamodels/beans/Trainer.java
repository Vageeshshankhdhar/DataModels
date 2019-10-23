package com.trainingbasket.datamodels.beans;
import java.util.*;

public class Trainer
{
	private int trainerID;
	private String trainerName;
	private List<Course> trainerCourseID;
	private String trainerContact;
	private List<Email> trainerEmail;
	private String trainerProofID;
	private List<Date> trainerDate;
	private List<Admin> TrainerAdmin;
	public int getTrainerID() {
		return trainerID;
	}
	public void setTrainerID(int trainerID) {
		this.trainerID = trainerID;
	}
	public String getTrainerName() {
		return trainerName;
	}
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	public List<Course> getTrainerCourseID() {
		return trainerCourseID;
	}
	public void setTrainerCourseID(List<Course> trainerCourseID) {
		this.trainerCourseID = trainerCourseID;
	}
	public String getTrainerContact() {
		return trainerContact;
	}
	public void setTrainerContact(String trainerContact) {
		this.trainerContact = trainerContact;
	}
	public List<Email> getTrainerEmail() {
		return trainerEmail;
	}
	public void setTrainerEmail(List<Email> trainerEmail) {
		this.trainerEmail = trainerEmail;
	}
	public String getTrainerProofID() {
		return trainerProofID;
	}
	public void setTrainerProofID(String trainerProofID) {
		this.trainerProofID = trainerProofID;
	}
	public List<Date> getTrainerDate() {
		return trainerDate;
	}
	public void setTrainerDate(List<Date> trainerDate) {
		this.trainerDate = trainerDate;
	}
	public List<Admin> getTrainerAdmin() {
		return TrainerAdmin;
	}
	public void setTrainerAdmin(List<Admin> trainerAdmin) {
		TrainerAdmin = trainerAdmin;
	}
	
}
