package com.trainingbasket.datamodels.beans;

import java.util.List;

public class Subject
{
	private int subID;
	private String subName;
	private float subDuration;
	private List<Topic> TopicId;
	private List<Topic> TopicName;
	public int getSubID() {
		return subID;
	}
	public void setSubID(int subID) {
		this.subID = subID;
	}
	public String getSubName() {
		return subName;
	}
	public void setSubName(String subName) {
		this.subName = subName;
	}
	public float getSubDuration() {
		return subDuration;
	}
	public void setSubDuration(float subDuration) {
		this.subDuration = subDuration;
	}
	public List<Topic> getTopicId() {
		return TopicId;
	}
	public void setTopicId(List<Topic> topicId) {
		TopicId = topicId;
	}
	public List<Topic> getTopicName() {
		return TopicName;
	}
	public void setTopicName(List<Topic> topicName) {
		TopicName = topicName;
	}
}