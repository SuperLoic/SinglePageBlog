package com.mark.resources.impl;

import com.mark.resources.inf.IDAccessor;

public class Skill implements IDAccessor {
	private long id;
	private String name;
	private String description;
	private int experiences;
	private int degree;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getExperiences() {
		return experiences;
	}

	public void setExperiences(int experiences) {
		this.experiences = experiences;
	}

	public int getDegree() {
		return degree;
	}

	public void setDegree(int degree) {
		this.degree = degree;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	private int type;

}
