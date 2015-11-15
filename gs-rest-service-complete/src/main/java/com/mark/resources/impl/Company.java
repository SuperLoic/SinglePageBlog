package com.mark.resources.impl;

import java.util.Date;
import java.util.List;

import com.mark.resources.inf.IDAccessor;

public class Company implements IDAccessor {
	private long id;
	private Date startWorkingDay;
	private Date farewellDay;
	private String positionTitle;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getStartWorkingDay() {
		return startWorkingDay;
	}

	public void setStartWorkingDay(Date startWorkingDay) {
		this.startWorkingDay = startWorkingDay;
	}

	public Date getFarewellDay() {
		return farewellDay;
	}

	public void setFarewellDay(Date farewellDay) {
		this.farewellDay = farewellDay;
	}

	public String getPositionTitle() {
		return positionTitle;
	}

	public void setPositionTitle(String positionTitle) {
		this.positionTitle = positionTitle;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	private String companyName;
	private List<Project> projects;

}
