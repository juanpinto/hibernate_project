package com.volunteer.model;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("volunteer")
public class Volunteer extends Asset {
	
	private int name;
	
	@OneToMany(mappedBy ="Volunteer")
	private List<AssetProject> projects;
	
	@OneToMany(mappedBy="Volunteer")
	private List<VolunteerTask> tasks;
	
	
	public Volunteer() {
		
	}

	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}

	public List<AssetProject> getProjects() {
		return projects;
	}

	public void setProjects(List<AssetProject> projects) {
		this.projects = projects;
	}

	public List<VolunteerTask> getTasks() {
		return tasks;
	}

	public void setTasks(List<VolunteerTask> tasks) {
		this.tasks = tasks;
	}
	
	
	

}
