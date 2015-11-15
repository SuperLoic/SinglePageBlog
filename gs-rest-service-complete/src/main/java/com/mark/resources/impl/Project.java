package com.mark.resources.impl;

import java.util.Date;
import java.util.List;

import com.mark.resources.inf.IDAccessor;

public class Project implements IDAccessor {
	private long id;
	private String projectName;
	private Date startDate;
	private Date endDate;
	private String role;
	private List<String> keyAchivements;
	private List<String> responsibilities;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
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

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public List<String> getKeyAchivements() {
		return keyAchivements;
	}

	public void setKeyAchivements(List<String> keyAchivements) {
		this.keyAchivements = keyAchivements;
	}

	public List<String> getResponsibilities() {
		return responsibilities;
	}

	public void setResponsibilities(List<String> responsibilities) {
		this.responsibilities = responsibilities;
	}

}
