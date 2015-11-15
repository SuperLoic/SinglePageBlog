package com.mark.resources.impl;

import java.util.Date;
import java.util.List;

import com.mark.resources.inf.IDAccessor;

public class Education implements IDAccessor {
	private long id;
	private String course;
	private Date startDate;
	private Date endDate;
	private List<String> achivements;
	private String organisation;
	private String degree;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public List<String> getAchivements() {
		return achivements;
	}

	public void setAchivements(List<String> achivements) {
		this.achivements = achivements;
	}

	public String getOrganisation() {
		return organisation;
	}

	public void setOrganisation(String organisation) {
		this.organisation = organisation;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

}
