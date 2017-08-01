package com.volunteer.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Project {

	@Id
	@GeneratedValue
	private int id;

	private String name;

	private String description;

	private String location;

	@Temporal(TemporalType.DATE)
	private Date startDate;

	@Temporal(TemporalType.DATE)
	private Date endDate;

	@OneToMany(mappedBy = "Project")
	private List<Task> tasks;
	
	@OneToMany(mappedBy = "Project")
	private List<AssetProject> assets;
	
	@OneToMany
	@JoinColumn(name="project_id")
	private List<ResourceRequested> resources;

	public Project() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
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

	public List<Task> getTask() {
		return tasks;
	}

	public void setTask(List<Task> task) {
		this.tasks = task;
	}

	public List<AssetProject> getAssets() {
		return assets;
	}

	public void setAssets(List<AssetProject> assets) {
		this.assets = assets;
	}

	public List<ResourceRequested> getResources() {
		return resources;
	}

	public void setResources(List<ResourceRequested> resources) {
		this.resources = resources;
	}
	
	

}
